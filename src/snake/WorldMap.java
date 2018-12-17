package snake;

import javafx.scene.paint.Color;

public class WorldMap {

   private Colors[][] map;

    public WorldMap() {
        this.map = new Colors[][]{
                {Colors.APPLE, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.APPLE,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.APPLE,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS},
                {Colors.APPLE, Colors.APPLE,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS,Colors.GRASS, Colors.GRASS}
        };
    }


    public Colors getMapColor(int x,int y) {
        return map[x][y];
    }


    public Color getMapColorColor(int x, int y) {
        return map[x][y].getColor();
    }


    public void setMapColor(int x, int y,Colors color) {
        this.map[x][y] = color;
    }


    public Colors[][] getMap() {
        return map;
    }
}
