package snake;

//TODO CELAN METOD REMOVE UNUSED. DO SOMETHING WITH UNNESESERY WILD CONNECTIONS TO SNAKE

import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game {



    SnakeSnake snake = new SnakeSnake(10,10);
    WorldMap map = new WorldMap();



    public void snakeTurnLeft() { snake.turnLeft();}
    public void snakeTurnRight()
    {
        snake.turnRight();
    }
    public void snakeTurnDown()
    {
        snake.turnDown();
    }
    public void snakeTurnUp()
    {
        snake.turnUp();
    }



    public MoveDirection getMoveDirection()
    {return snake.getMoveDirection();}

    public void setMoveDirection(MoveDirection movieDirection)
    {snake.setMoveDirection(movieDirection);}


    public int snakeGivePositionX()
    {
       return snake.getPositionColumn();
    }

    public int snakeGivePositionY()
    {
        return  snake.getPositionRow();
    }

    public void skaleLengthMore()
    {   int i = snake.getLength()+1;
        snake.setLength(i);
    }

    public int getSnakeLengt()
    {
        return snake.getLength();
    }


    public Color mapGiveColor(int i, int j){

        return map.getMapColor(i,j).getColor();
    }


    public WorldMap returnMap(){

        return map;
    }


    public int[] returnTailX()
    {
        return snake.getTailX();
    }
    public int[] returnTailY()
    {
        return snake.getTailY();
    }

    public void snakeMove() {
        snake.snakeTheMove();
    }


}
