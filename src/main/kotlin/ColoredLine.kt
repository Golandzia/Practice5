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
    constructor(_color :Colors) :this() {
        color = _color
    }
}