public class Rectangle extends Point {
    private int width;
    private int heigth;

    public Rectangle() {
        super();
        width = 0;
        heigth = 0;
    }

    public Rectangle(Point p, int newWidth, int newHeigth) {
        super(p.getX(), p.getY());
        width = newWidth;
        heigth = newHeigth;
    }

    public Rectangle(Point bottomLeft, Point upperRight) {
        super(bottomLeft.getX(), bottomLeft.getY());
        width = upperRight.getX() - bottomLeft.getX();
        heigth = upperRight.getY() - bottomLeft.getY();
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
    @Override
    public String toString() {
        return super.toString() + " width = " + width +
                " height = " + heigth;
    }

    public int getArea() {
        int area = heigth * heigth;
        return area;
    }

    public Point getPoint() {
        return new Point(getX(), getY());
    }

    public Point getTopLeftPoint() {
        return new Point(getX(), getY() + width);
    }

    public Point getTopRightPoint() {
        return new Point(getX() + width, getY() + heigth);
    }
    public Point getBottomRightPoint() {
        return new Point(getX() + width, getY());
    }
    public Point getBottomLeftPoint() {
        return new Point(getX(), getY());
    }


}
