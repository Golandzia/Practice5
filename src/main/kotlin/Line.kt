open class Line constructor() : Point() {
    protected var pointsArray = mutableListOf<Point>()
        set(value) {
            value.forEach{el->
                if(el.xCoordinate>1000 || el.yCoordinate<-1000.0)
                    println("Для одной из координат прямой $name установленно некоррекстное значение")
            }
            field = value
        }
        get() {
            field.forEach { el ->
                if (el.xCoordinate > 1000 || el.yCoordinate < -1000.0)
                    println("Для одной из координат прямой $name установленно некоррекстное значение")
            }
            return field
        }

    constructor(_name :String, _x1 :Double, _y1 :Double, _x2 :Double, _y2 :Double) :this(){
        name = _name
        pointsArray[0].xCoordinate = _x1
        pointsArray[0].yCoordinate = _y1
        pointsArray[1].xCoordinate = _x2
        pointsArray[1].yCoordinate = _y2
    }

    override fun toString(): String {
        return "Имя прямой - $name\nКоординаты: (${pointsArray[0].xCoordinate} ; ${pointsArray[0].yCoordinate}) " +
                " (${pointsArray[1].xCoordinate} ; ${pointsArray[1].yCoordinate}"
    }
}