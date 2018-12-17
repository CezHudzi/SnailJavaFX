package snake;


import java.awt.*;
import java.util.Random;
import java.util.concurrent.*;


import javafx.application.Application;

import javafx.collections.ObservableList;

import javafx.event.EventHandler;

import javafx.scene.Node;

import javafx.scene.Scene;

import javafx.scene.input.KeyCode;

import javafx.scene.input.KeyEvent;

import javafx.scene.layout.GridPane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

import static java.util.concurrent.TimeUnit.*;


public class SnakeGameInterface extends Application {


//TODO END CODE REFACTOR
// MAKE WALLS && NEW RANDOM APPLE && ADD EXIT ON CLOSE && SNAKE CAN "EAT" ITSELF


    Game gra = new Game();


    @Override

    public void start(Stage primaryStage) throws Exception {


        int sceneWidth = 460;

        int sceneHeight = 460;

        int rowNum = 20;

        int colNum = 20;


        final GridPane grid = new GridPane();

        Random rand = new Random();

        Color[] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED};


        Thread student = new Thread() {

            @Override
            public void run() {

                System.out.println("ttk");

            }
        };


        student.start();

        //TODO PUT THIS IN METOD  PROPABLY IT IS THIS SAME AS PRINT
        for (int row = 0; row < rowNum; row++) {

            for (int col = 0; col < colNum; col++) {

                int n = rand.nextInt(4);

                Rectangle rec = new Rectangle();

                rec.setWidth(sceneWidth / colNum);

                rec.setHeight(sceneHeight / rowNum);


                rec.setFill(gra.mapGiveColor(row, col));

                GridPane.setRowIndex(rec, row);

                GridPane.setColumnIndex(rec, col);

                grid.getChildren().addAll(rec);

            }

        }


        Scene scene = new Scene(grid, sceneWidth, sceneHeight);


        primaryStage.setTitle("Grid");

        primaryStage.setScene(scene);

        primaryStage.show();


        scene.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {

            @Override

            public void handle(KeyEvent event) {

                keyPressed(event.getCode(), grid, gra.snakeGivePositionX(), gra.snakeGivePositionY(), gra.returnMap());

            }

        });


        //  printSnake(grid, gra.snakeGivePositionX(), gra.snakeGivePositionY());


        // TODO PROPLABLY UNNESESERY AND IT IS PRINTSNAKE
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 20; col++) {


                if (gra.snakeGivePositionX() == col && gra.snakeGivePositionY() == row) {
                    Rectangle rectangle = getNodeByRowColumnIndex(row, col, grid);
                    rectangle.setFill(Color.PINK);
                } else {
                    Rectangle rectangle = getNodeByRowColumnIndex(row, col, grid);
                    rectangle.setFill(gra.mapGiveColor(row, col));
                }
            }
        }


        Runnable runnable = () -> {
            gra.snakeMove();
            printSnake(grid, gra.snakeGivePositionX(), gra.snakeGivePositionY(), gra.returnMap());
            printTail(grid, gra.snakeGivePositionX(), gra.snakeGivePositionY(), gra.returnMap());

            //TODO PUT THIS TO SOME METHOD
            if (gra.mapGiveColor(gra.snakeGivePositionY(), gra.snakeGivePositionX()).equals(Color.RED)) {
                gra.returnMap().setMapColor(gra.snakeGivePositionY(), gra.snakeGivePositionX(), Colors.GRASS);
                gra.skaleLengthMore();
            }


        };

        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 0, 200, TimeUnit.MILLISECONDS);


    }


    public static void main(String[] args) {


        launch(args);

    }


    private void keyPressed(KeyCode code, GridPane grid, int snakePosX, int snakePosY, WorldMap map) {


        if (code == KeyCode.UP) {


            gra.setMoveDirection(MoveDirection.UP);
            //DEBUG PRINT
            System.out.println(gra.snakeGivePositionY() + "  " + gra.snakeGivePositionX());


        }


        if (code == KeyCode.DOWN) {


            gra.setMoveDirection(MoveDirection.DOWN);
            //DEBUG PRINT
            System.out.println(gra.snakeGivePositionY() + "  " + gra.snakeGivePositionX());

        }

        if (code == KeyCode.LEFT) {

            gra.setMoveDirection(MoveDirection.LEFT);
            //DEBUG PRINT
            System.out.println(gra.snakeGivePositionY() + "  " + gra.snakeGivePositionX());


        }

        if (code == KeyCode.RIGHT) {

            gra.setMoveDirection(MoveDirection.RIGHT);
            //DEBUG PRINT
            System.out.println(gra.snakeGivePositionY() + "  " + gra.snakeGivePositionX());


        }

        //DEBUG PRINT
        System.out.println(gra.getSnakeLengt());
    }

    //TODO WHY printSnake and printTail are separete METOD
    //TODO CHECK HOW TO SPELL 'SEPARETE"
    private void printSnake(GridPane grid, int snakePositionX, int snakePositionY, WorldMap map) {

        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 20; col++) {

                if (snakePositionX == col && snakePositionY == row) {
                    Rectangle rectangle = getNodeByRowColumnIndex(row, col, grid);
                    rectangle.setFill(Color.PINK);
                } else {
                    Rectangle rectangle = getNodeByRowColumnIndex(row, col, grid);
                    rectangle.setFill(map.getMapColorColor(row, col));
                }
            }
        }
    }


    private void printTail(GridPane grid, int snakePositionX, int snakePositionY, WorldMap map) {

        int[] XX = gra.returnTailX().clone();
        int[] YY = gra.returnTailY().clone();

        for (int i = XX.length - 1; i >= (XX.length - gra.getSnakeLengt()); i--) {
            Rectangle rectangle = getNodeByRowColumnIndex(XX[i], YY[i], grid);
            rectangle.setFill(Color.BLUE);
        }
    }

    //TODO NOT USE PROBABLY REMOVE
    private static Rectangle getNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {

        Node result = null;

        ObservableList<Node> children = gridPane.getChildren();


        for (Node node : children) {

            if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {

                result = node;

                break;

            }

        }

        if (result == null) {

            throw new IllegalArgumentException("Ivalid grid coordinates: " + row + " " + column);

        }


        return (Rectangle) result;

    }


}