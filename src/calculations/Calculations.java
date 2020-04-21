/**
 * This module calculates rectangle and square sizes
 */

package calculations;


public class Calculations {
    public static void main(String[] args) {
        System.out.println(2 + 2);
        int num = 8;
        System.out.println(num - 2);
        System.out.println("2" + "2");
        System.out.println("2" + 2);

        Square s = new Square(5);

        Rectangle r = new Rectangle(6, 12);

        System.out.println("Rectangle total sqm is " + r.area());
        System.out.println("Square total sqm is " + s.area());

    }


}
