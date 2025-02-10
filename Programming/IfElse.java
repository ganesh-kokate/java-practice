import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        int x = 0, y = 5, z = 10;

        x = y++ + --z - ++x * y--;
        y = x-- + --z + ++y;
        z = ++x - y-- + ++z;

        System.out.println("x: " + x); // What will be the value of x?
        System.out.println("y: " + y); // What will be the value of y?
        System.out.println("z: " + z);

    }
}
