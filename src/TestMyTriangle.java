public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t = new MyTriangle(6, 1, 2, 2, 3, 3);
        System.out.println(t);
        System.out.println(t.getPerimeter());
        t.printType();
    }
}
