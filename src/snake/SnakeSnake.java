package snake;






//TODO RENAME SnakeSnake to NORMAL NAME && CLEAN CODE && MINIMALIZE

public class SnakeSnake {

private int positionRow;
private int positionColumn;
private int length;

private int[] tailX;
private int[] tailY;
private MoveDirection moveDirection;

    public MoveDirection getMoveDirection() {
        return moveDirection;
    }

    public void setMoveDirection(MoveDirection moveDirection) {
        this.moveDirection = moveDirection;
    }

    public SnakeSnake(int positionRow, int positionColumn) {
        this.positionRow = positionRow;
        this.positionColumn = positionColumn;
        this.length = 0;
        this.tailY=new int[1];
        this.tailX=new int[1];

    }


    public int[] getTailX() {
        return tailX;
    }

    public int[] getTailY() {
        return tailY;
    }


    public int getPositionRow() {
        return positionRow;
    }

    public int getPositionColumn() {
        return positionColumn;
    }

    public int getLength() {
        return length;
    }

    public void setPositionRow(int positionRow) {
        this.positionRow = positionRow;
    }

    public void setPositionColumn(int positionColumn) {
        this.positionColumn = positionColumn;
    }

    public void setLength(int length) {

        this.length = length;




    }


    public void turnLeft()
    {
        tailX = push(tailX, positionRow);
        tailY = push(tailY, positionColumn);
        this.positionColumn--;

    }
    public void turnRight()
    {
        tailX = push(tailX, positionRow);
        tailY = push(tailY, positionColumn);
        this.positionColumn++;
    }
    public void turnUp()
    {
        tailX = push(tailX, positionRow);
        tailY = push(tailY, positionColumn);
        this.positionRow--;
    }
    public void turnDown()
    {
        tailX = push(tailX, positionRow);
        tailY = push(tailY, positionColumn);
        this.positionRow++;
    }


    private static int[] push(int[] array, int push) {



        int[] longer = new int[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }

    public void snakeTheMove() {

        if (moveDirection == MoveDirection.UP)
        {this.turnUp();}
        else if (moveDirection == MoveDirection.DOWN)
        {this.turnDown();}

        else if (moveDirection == MoveDirection.RIGHT)
        {this.turnRight();}
        else if (moveDirection == MoveDirection.LEFT)
        {this.turnLeft();}





    }
}
