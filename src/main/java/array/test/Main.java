package array.test;

import array.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(5);
        array.addElement("Diego");

        System.out.println(array.getSize());;
        System.out.println(array);
    }
}
