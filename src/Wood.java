import java.awt.*;

public class Wood implements Drawable {
    private int height, width, topX, topY;

    Wood(int height, int width, int topX, int topY) {
        this.height = height;
        this.width = width;
        this.topX = topX;
        this.topY = topY;
    }

    @Override
    public void draw(Graphics2D gr) {
        Triangle t1 = new Triangle(new Point(topX, topY),
                new Point(topX - width / 2, topY + height / 3),
                new Point(topX + width / 2, topY + height / 3), new Color(0x009C1A));

        Triangle t2 = new Triangle(new Point(topX, topY + height / 3),
                new Point(topX - width / 2, topY + height * 2 / 3),
                new Point(topX + width / 2, topY + height * 2 / 3), new Color(0x009C1A));

        Triangle t3 = new Triangle(new Point(topX, topY + height * 2 / 3),
                new Point(topX - width / 2, topY + height),
                new Point(topX + width / 2, topY + height), new Color(0x009C1A));

        t1.draw(gr);
        t2.draw(gr);
        t3.draw(gr);

        gr.setColor(new Color(0x714500));
        gr.fillRect((int) (topX - width * 0.2), topY + height, (int) (width * 0.4), (int) (height * 0.2));
    }
}
