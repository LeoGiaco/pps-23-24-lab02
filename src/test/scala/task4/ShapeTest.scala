package task4

import Shape.*
import org.junit.*
import org.junit.Assert.*

class ShapeTest:
    @Test def circleHasCorrectPerimeter =
        val radius = 10d
        val circle = Shape.Circle(radius)
        assertEquals(2 * Math.PI * radius, Shape.perimeter(circle), 0.001)

    @Test def squareHasCorrectPerimeter =
        val side = 10d
        val square = Shape.Square(side)
        assertEquals(side * side, Shape.perimeter(square), 0.001)
   
    @Test def rectangleHasCorrectPerimeter =
        val side1 = 10d
        val side2 = 5d
        val rect = Shape.Rectangle(side1, side2)
        assertEquals(side1 * side2, Shape.perimeter(rect), 0.001)


