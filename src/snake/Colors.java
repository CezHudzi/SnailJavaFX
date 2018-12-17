package snake;

import javafx.scene.paint.Color;

public enum Colors {

    APPLE( Color.RED),
    GRASS( Color.GREEN);

    private final Color color;

    Colors (Color color){
        this.color=color;
    }

    public Color getColor() {
        return color;
    }
}
