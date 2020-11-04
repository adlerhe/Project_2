package draft;

import java.awt.Graphics;

public class Paddle {

    // Position of the paddle's center
    int x;
    int y;

    public Paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.drawRect(this.x - 10, this.y - 40, 20, 80);
    }

    // Up is negative because Java coordinates

    public void up() {
        this.y -= 30;
    }

    public void down() {
        this.y += 30;
    }

}