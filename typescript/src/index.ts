import { newRenderer } from "./renderer.js"
import { newCircle } from "./shapes/circle.js";
import { newRectangle } from "./shapes/rectangle.js";
import { newSquare } from "./shapes/square.js";

const rectangle: Shape = newRectangle(2, 3)
const circle: Shape = newCircle(2)
const square: Shape = newSquare(3)

const renderer_rectangle = newRenderer(rectangle)
const renderer_circle = newRenderer(circle)
const renderer_square = newRenderer(square)

renderer_rectangle.draw()
renderer_circle.draw()
renderer_square.draw()