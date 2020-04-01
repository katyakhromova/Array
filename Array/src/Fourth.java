import static src.Lesson.fourthMethod;

public class Fourth {
    public static void main(String[] args) {
        fourthMethod();

        //#4
        /*Создайте массив размер которого = 10. Заполните его любимы числами.
        Скопируйте все значения этого массива в другой массив в обратном порядке (10, 9, 8 …)*/

        int[] array = new int[10];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println();

        int n = array.length;
        int temp;

        for (int i = 0; i < n / 2; i++) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}