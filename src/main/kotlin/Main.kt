fun main(){
    var polygone = Polygone("test" , 4)
    polygone = polygone.movePolygone(polygone, DirectionOfTravels.DOWN_LEFT, 1.0)
    println("\n\n\n${polygone.toString()}")
}