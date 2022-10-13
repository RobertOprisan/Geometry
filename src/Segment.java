public class Segment {

    public Point startPoint;
    public Point endPoint;

    public Segment() {
        startPoint = new Point();
        endPoint = new Point();
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;

    }

    public double getModule() {
        int c1 = endPoint.getX() - startPoint.getX();
        int c2 = endPoint.getY() - startPoint.getY();
        double h =  Math.sqrt(c1 * c1 + c2 * c2);
        return h;
    }
    @Override
    public String toString() {
        return startPoint + " - " + endPoint;

    }

    public void setOffset(int offX, int offY) {
      /*  startPoint.setX(startPoint.getX() + offX );
        startPoint.setY(startPoint.getY() + offY );
        endPoint.setX(endPoint.getX() + offX );
        endPoint.setY(endPoint.getY() + offY );

       */ //Other way to do it
        startPoint.setX(offX);
        endPoint.setY(offY);
    }

}







