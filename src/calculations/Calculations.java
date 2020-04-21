package calculations;


public class Calculations {
    public static void main(String[] args) {
        System.out.println(2 + 2);
        int num = 8;
        System.out.println(num - 2);
        System.out.println("2" + "2");
        System.out.println("2" + 2);

        Square s = new Square();
        s.length = 5;

        Rectangle r = new Rectangle();
        r.length = 12;
        r.width = 2;

        System.out.println("Rectangle total sqm is " + area(r));
        System.out.println("Square total sqm is " + area(s));
       
    }

    public static double area(Square s) {
        return s.length * s.length;
    }

    public static double area(Rectangle r) {
        return r.length * r.width;
    }
}
