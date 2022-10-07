class SmartRobot(x : Int, y : Int, direction : Direction): Robot(x, y, direction) {

    fun moveTo(toX: Int, toY: Int){
        if(x > toX){
            rotate(Direction.RIGHT)
        }
        else{
            rotate(Direction.LEFT)
        }

        while(x != toX){
            stepForward()
        }

        if (y > toY){
            rotate(Direction.DOWN)
        }
        else {
            rotate(Direction.UP)
        }

        while(y != toY){
            stepForward()
        }
    }

    fun rotate(new_direction : Direction) {
        while(direction != new_direction){
            turnLeft()
        }
    }
}

