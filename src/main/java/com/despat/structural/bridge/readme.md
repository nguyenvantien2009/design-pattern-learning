# Bridge Pattern

## Design

```mermaid
classDiagram
class Shape
<<abstract>> Shape
Shape: - DrawAPI drawAPI
Shape: + void draw()

Circle --> Shape: extends
Circle: - int x
Circle: - int y
Circle: - int radius
Circle: + void draw()

Rectangle --> Shape: extends
Rectangle: - int x
Rectangle: - int y
Rectangle: - int w
Rectangle: - int h
Rectangle: + void draw()


class DrawAPI
<<inteface>> DrawAPI
DrawAPI: + void drawCircle(x, y, radius)
DrawAPI: + void drawRectangle(x, y, h, w)

PencilCircleDraw --|> DrawAPI: implements
PencilCircleDraw: + int size
PencilCircleDraw: + void drawCircle(x, y, radius)
PencilCircleDraw: + void drawRectangle(x, y, h, w)

PencilRectangleDraw --|> DrawAPI: implements
PencilRectangleDraw: + int size
PencilRectangleDraw: + void drawCircle(x, y, radius)
PencilRectangleDraw: + void drawRectangle(x, y, h, w)

BrushCircleDraw --|> DrawAPI: implements
BrushCircleDraw: + int size
BrushCircleDraw: + int color
BrushCircleDraw: + void drawCircle(x, y, radius)
BrushCircleDraw: + void drawRectangle(x, y, h, w)

BrushRectangleDraw --|> DrawAPI: implements
BrushRectangleDraw: + int size
BrushRectangleDraw: + int color
BrushRectangleDraw: + void drawCircle(x, y, radius)
BrushRectangleDraw: + void drawRectangle(x, y, h, w)

Shape --* DrawAPI
```

## Code

Run code

```shell
mvn compile && mvn exec:java -Pbridge
```
