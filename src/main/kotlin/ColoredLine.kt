class ColoredLine() : Line() {
    protected var color :Colors = Colors.NO_COLOR
        set(value) {
            field = if(value== Colors.NO_COLOR){
                println("Для линии $name неправильно установлен цвет")
                Colors.NO_COLOR
            } else value
        }
        get(){
            return if(field!=Colors.NO_COLOR) field
            else{
                println("Установлен некорректный цвет для линии $name")
                field
            }
        }
    constructor(_name :String, _x1 :Double, _y1 :Double, _x2 :Double, _y2 :Double, _color :Colors) :this() {
        color = _color
        name = _name
        pointsArray[0].xCoordinate = _x1
        pointsArray[0].yCoordinate = _y1
        pointsArray[1].xCoordinate = _x2
        pointsArray[1].yCoordinate = _y2
    }

    override fun toString(): String {
        return super.toString() + "\nЦвет - $color"
    }
}