class ColoredPoint constructor() :Point() {
    protected var color :Colors = Colors.NO_COLOR
        set(value) {
            field = if(value== Colors.NO_COLOR){
                println("Для точки $name неправильно установлен цвет")
                Colors.NO_COLOR
            } else value
        }
        get(){
            return if(field!=Colors.NO_COLOR) field
            else{
                println("Установлен некорректный цвет для точки $name")
                field
            }
        }

    constructor(_name: String, _xCoordinate :Double, _yCoordinate :Double, _color: Colors) :this(){
        name = _name
        xCoordinate = _xCoordinate
        yCoordinate = _yCoordinate
        color = _color
    }

    override fun toString(): String {
        return super.toString() + "\nЦвет: $color"
    }
}