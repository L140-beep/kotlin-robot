open class Robot(var x : Int, var y : Int, var direction : Direction) {
    fun stepForward() {
        when (direction){
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
            Direction.DOWN -> y--
            Direction.UP -> y++
        }
    }

    fun turnLeft(){
        when (direction){
            Direction.RIGHT -> direction = Direction.UP
            Direction.LEFT -> direction = Direction.DOWN
            Direction.DOWN -> direction = Direction.RIGHT
            Direction.UP -> direction = Direction.LEFT
        }
    }

    fun getLook() : Direction{
        return direction
    }

    fun turnRight(){
        when (direction){
            Direction.RIGHT -> direction = Direction.DOWN
            Direction.LEFT -> direction = Direction.UP
            Direction.DOWN -> direction = Direction.LEFT
            Direction.UP -> direction = Direction.RIGHT
        }
    }

    fun getLocation() : Map<String, Int>{
        return mapOf("x" to x, "y" to y)
    }

    override fun toString(): String {
        return "(${x}, ${y}), looks ${direction}"
    }
}

enum class Direction{
    UP, DOWN, LEFT, RIGHT
}