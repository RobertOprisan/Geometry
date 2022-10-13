public class Polygon {
    public static final int NUM_POINTS = 100;
    private Point[] points;

    public Polygon() {
        points = new Point[NUM_POINTS];
        for (int i = 0; i < points.length; i++) {
            points[i] = null;
        }
    }

    public Polygon(Point[] points) {
        this.points = new Point[NUM_POINTS];
        for (int i = 0; i < this.points.length; i++) {
            if (i < points.length) {
                this.points[i] = points[i];
            } else {
                this.points[i] = null;
            }

        }

    }

    @Override
    public String toString() {
        String s = "";
        int i = 0;
        while (i < points.length && points[i] != null) {
            s += points[i] + "-";
            i++;

        }
        s += points[0];
        return s;
    }

    public double getLength() {
        int per = 1;
        Segment segment;
        double length = 0;
        while (per < points.length && points[per] != null) {
            Point c1 = points[per - 1];
            Point c2 = points[per];
            segment = new Segment(c1, c2);
            length += segment.getModule();
            per++;

        }
        segment = new Segment(points[per - 1], points[0]);
        length += segment.getModule();
        return length;
    }
}
