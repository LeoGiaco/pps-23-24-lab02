package task4

enum Shape:
  case Circle(radius: Double)
  case Square(side: Double)
  case Rectangle(side1: Double, side2: Double)

object Shape:
  def perimeter(shape: Shape) = shape match
    case Shape.Circle(radius) => 2 * Math.PI * radius
    case Shape.Square(side) => side * side
    case Shape.Rectangle(side1, side2) => side1 * side2

  def scale(shape: Shape, alpha: Double) = shape match
    case Shape.Circle(radius) => Shape.Circle(radius * alpha)
    case Shape.Square(side) => Shape.Square(side * alpha)
    case Shape.Rectangle(side1, side2) => Shape.Rectangle(side1 * alpha, side2 * alpha) 