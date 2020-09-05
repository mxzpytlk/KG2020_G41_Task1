import java.awt.*;

public class Triangle implements Drawable {
    private Point a, b, c;
    private Color color;

    Triangle(Point a, Point b, Point c, Color color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(color);
        int[] xCords = {a.x, b.x, c.x};
        int[] yCords = {a.y, b.y, c.y};
        gr.fillPolygon(xCords, yCords, 3);
    }
}
