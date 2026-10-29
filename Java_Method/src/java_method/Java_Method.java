/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_method;

/**
 *
 * @author jesumike
 */
public class Java_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(OddEven(1));
        System.out.println(classifyTriangle(5,5,5));
    }

    static int OddEven(int Number) {
        if (Number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static int classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0
                || (long) a + b <= c
                || (long) a + c <= b
                || (long) b + c <= a) {
            return 0;
        } else if (a == b && b == c) {
            return 1;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 3;
        }

    }
}
