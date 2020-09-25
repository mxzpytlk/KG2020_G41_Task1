import java.awt.*;

public class Wood implements Drawable, Comparable<Wood> {
    private int height, width, topX, topY;

    Wood(int height, int width, int topX, int topY) {
        this.height = height;
        this.width = width;
        this.topX = topX;
        this.topY = topY;
    }
    public int getHeight() {
        return height;
    }

    public int getTopY() {
        return topY;
    }

    @Override
    public void draw(Graphics2D gr) {
        Triangle t1 = new Triangle(new Point(topX, topY),
                new Point(topX - width / 2, topY + height / 3),
                new Point(topX + width / 2, topY + height / 3), new Color(0x009C1A));

        Triangle t2 = new Triangle(new Point(topX, topY + height * 2 / 9),
                new Point(topX - width / 2, topY + height * 2 / 3),
                new Point(topX + width / 2, topY + height * 2 / 3), new Color(0x009C1A));

        Triangle t3 = new Triangle(new Point(topX, topY + height * 4 / 9),
                new Point(topX - width / 2, topY + height),
                new Point(topX + width / 2, topY + height), new Color(0x009C1A));

        t3.fill(gr);
        t3.setColor(Color.BLACK);
        t3.draw(gr);
        t2.fill(gr);
        t2.setColor(Color.BLACK);
        t2.draw(gr);
        t1.fill(gr);
        t1.setColor(Color.BLACK);
        t1.draw(gr);

        gr.setColor(new Color(0x714500));
        gr.fillRect((int) (topX - width * 0.2), topY + height, (int) (width * 0.4), (int) (height * 0.2));
    }

    @Override
    public int compareTo(Wood wood) {
        return  height + topY - wood.getHeight() - wood.getTopY();
    }
}
