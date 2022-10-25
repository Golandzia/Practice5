class Polygone constructor() : Line() {
    private var numberOfVertices :Int = 0
        set(value) {
            field = if (value>0) value else{
                println("Установлено некорректное значения для количества вершин многоуггольника.\n Пожалуйста введите заного:")
                readln().toInt()
            }
        }
        get() {
            return if(field>0){
                field
            } else{
                println("Возможно установлено некорректное значения для количества вершин многоуггольника.")
                field
            }
        }

    constructor(_name : String, _numOfVertices :Int) :this()
    {
        name = _name
        println("Введите координаты вершин в формате x1, y1, x2, y2 и тд. ПО ЧАСОВОЙ СТРЕЛКЕ")
        for (i in 1.._numOfVertices){
            pointsArray.add(i-1, Point(i.toString(), readln().toDouble(), readln().toDouble()))
        }
    }

    override fun toString(): String {
        var infoToOut :String = "Имя многоугольника: $name\n"
        pointsArray.forEach { el->
            infoToOut+= "Имя точки: ${el.name} (${el.xCoordinate} ; ${el.xCoordinate})\n"
        }
        return infoToOut
    }
    fun movePolygone(polygone: Polygone, directionOfTravel :DirectionOfTravels, PathLength :Double) :Polygone {
        when (directionOfTravel) {
            DirectionOfTravels.UP -> {
                polygone.pointsArray.forEach { el ->
                    el.yCoordinate += PathLength
                }
                return polygone
            }
            DirectionOfTravels.DOWN -> {
                polygone.pointsArray.forEach { el ->
                    el.yCoordinate -= PathLength
                }
                return polygone
            }
            DirectionOfTravels.RIGHT -> {
                polygone.pointsArray.forEach { el ->
                    el.xCoordinate += PathLength
                }
                return polygone
            }
            DirectionOfTravels.LEFT -> {
                polygone.pointsArray.forEach { el ->
                    el.xCoordinate -= PathLength
                }
                return polygone
            }
            else -> {
                println("Один из параметров для движения многоугольника указан неверно\n Движение не произведено")
                return polygone
            }
        }
    }
}