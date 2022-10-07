fun main(){
    var fedor = SmartRobot(3, 4, Direction.RIGHT)
    println("Начальное положение: " + fedor.getLocation())
    fedor.moveTo(1, 0)
    println("После перемещения: " + fedor.getLocation())
    println(fedor.getLook())
}