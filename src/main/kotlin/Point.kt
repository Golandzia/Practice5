open class Point constructor (){
    var name: String = ""
        set(value){
            field = if(value == ""){
                print("Не установлено имя для точки с координатами ($xCoordinate; $yCoordinate)\n" +
                        "Пожалуйста, введите его в ручную: ")
                readln()
            } else value
        }
        get(){
            return if(field!= "") field
            else {
                println("Имя для точки с координатами ($xCoordinate; $yCoordinate) не установлено")
                field
            }
        }
    var xCoordinate: Double = 0.0
        set(value){
            field = if(value> -1000 && value<1000) value
            else{
                print("Установленно некорректное значение координаты по X для точки $name \n" +
                        "Пожалуста, введите новое: ")
                readln().toDouble()
            }
        }
        get(){
            return if(field>-1000 && field<1000) field
            else{
                println("Установлено некорректное значение координат по X для точки $name")
                field
            }
        }
    var yCoordinate: Double = 0.0
        set(value){
            field = if(value> -1000 && value<1000) value
            else{
                print("Установленно некорректное значение координаты по Y для точки $name \n" +
                        "Пожалуста, введите новое: ")
                readln().toDouble()
            }
        }
        get(){
            return if(field>-1000 && field<1000) field
            else{
                println("Установлено некорректное значение координат по Y для точки $name")
                field
            }
        }
    constructor(_name :String, _xCoordinate :Double, _yCoordinate :Double) : this() {
        name = _name
        xCoordinate = _xCoordinate
        yCoordinate = _yCoordinate
    }

    override fun toString() :String{
        return "Имя точки: $name \n Координаты: ($xCoordinate ; $yCoordinate)"
    }

}