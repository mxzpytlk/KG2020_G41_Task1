import java.awt.*;

public class Sun implements Drawable {
    private int x;
    private int y;
    private int r;
    private int R;
    private int countRay;
    private Color color;

    Sun(int x, int y, int r, int R, int countRay, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.R = R;
        this.countRay = countRay;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(color);
        gr.fillOval(x - r, y - r, r + r, r + r);

        double da = 2 * Math.PI / countRay;
        for (int i = 0; i < countRay; i++) {
            int dx1 = (int) (r *  Math.cos(da * i) + x);
            int dy1 = (int) (r * Math.sin(da * i) + y);
            int dx2 = (int) (R *  Math.cos(da * i) + x);
            int dy2 = (int) (R *  Math.sin(da * i) + y);
            gr.drawLine(dx1, dy1, dx2, dy2);
        }
    }
}
