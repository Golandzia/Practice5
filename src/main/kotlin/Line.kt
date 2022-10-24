open class Line constructor() : Point() {
    protected var pointsCoordinate = mapOf<String, Double>("x1" to 0.0, "y1" to 0.0, "x2" to 0.0, "y2" to 0.0)
        set(value) {
            value.forEach { (key, valueInCycle) ->
                if (valueInCycle < -1000.0 || valueInCycle > 1000.0)
                    println("Для координаты $key прямой $name установено некорректное значение")
                field = value
            }
        }
        get() {
            field.forEach { (key, valueInCycle) ->
                if (valueInCycle < -1000.0 || valueInCycle > 1000.0)
                    println("Для координаты $key прямой $name установено некорректное значение")
            }
            return field
        }

    constructor(_name :String, _x1 :Double, _y1 :Double, _x2 :Double, _y2 :Double) :this(){
        name = _name
        pointsCoordinate = mapOf("x1" to _x1, "y1" to _y1, "x2" to _x2, "y2" to _y2)
    }

    override fun toString(): String {
        return "Имя прямой: $name\n Координаты: (${pointsCoordinate["x1"]} ; ${pointsCoordinate["y1"]}) " +
                " (${pointsCoordinate["x2"]} ; ${pointsCoordinate["y2"]})"
    }
}