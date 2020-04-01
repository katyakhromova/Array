package src;

public class Lesson {

    public static void main(String[] args) {
        arr();
        array1();
        array2();
    }

    public static void arr() {
        boolean[] arr = new boolean[1000];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void array1() {
        int[] array1 = new int[3];

        array1[0] = 5;
        array1[1] = 17;
        array1[2] = 350;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        /*for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }*/
    }

    public static void array2() {
        int[][] array2 = new int[2][2];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void firstMethod() {
        System.out.println();
    }

    public static void secondMethod() {
        System.out.println();
    }

    public static void thirdMethod() {
        System.out.println();
    }

    public static void fourthMethod() {
        System.out.println();
    }
}

