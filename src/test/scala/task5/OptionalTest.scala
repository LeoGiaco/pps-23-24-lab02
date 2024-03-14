package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*

class OptionalTest:
  @Test def emptyOptionalShouldBeEmpty(): Unit = {
    val empty = Optional.Empty()
    assertTrue(Optional.isEmpty(empty))
  }

  @Test def nonEmptyOptionalShouldNotBeEmpty(): Unit = {
    val nonEmpty = Optional.Maybe(0)
    assertFalse(Optional.isEmpty(nonEmpty))
  }

  @Test def orElseShouldReturnDefaultWhenEmpty(): Unit = {
    val nonEmpty = Optional.Maybe(0)
    assertEquals(0, Optional.orElse(nonEmpty, 1))
  }

  @Test def orElseShouldReturnValueWhenNonEmpty(): Unit = {
    val empty = Optional.Empty()
    assertEquals(1, Optional.orElse(empty, 1))
  }

  /** Task 5 -- Look the behaviour of map operator */
  @Test def mapShouldReturnEmptyWhenEmpty(): Unit = {
    val empty: Optional[Int] = Optional.Empty()
    val result = Optional.map(empty, _ + 1)
    assertTrue(Optional.isEmpty(result))
  }

  @Test def mapShouldReturnTransformedValueWhenNonEmpty(): Unit = {
    val nonEmpty = Optional.Maybe(0)
    val result = Optional.map(nonEmpty, _ + 1)
    assertEquals(1, Optional.orElse(result, 1))
  }

  @Test def filterShouldFilterCorrectly(): Unit = {
    val opt = Optional.Maybe(5)
    val empty = Optional.Empty[Int]()
    assertEquals(opt, Optional.filter(opt, _ > 2))
    assertEquals(Optional.Empty[Int](), Optional.filter(opt, _ > 8))
    assertEquals(Optional.Empty[Int](), Optional.filter(empty, _ > 8))
  }