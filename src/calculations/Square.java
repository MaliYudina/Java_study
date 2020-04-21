/**
 * This module describes square parameters and method for
 * the further area calculation
 */

package calculations;

public class Square {
    public double length;

    public Square(double len) {
        this.length = len;
    }

    public double area() {
        return this.length * this.length;
    }
}
