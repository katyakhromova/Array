import static src.Lesson.firstMethod;

import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        firstMethod();

        //#1
        /*1. Необходимо создать 2 массива из 10 случайных целых чисел в диапазоне от [0;10] каждый
        2. Необходимо вычислить  среднее арифметическое элементов каждого массива,
        если для первого массива среднеарифметическое значение оказалось больше, то выведите это через (sout),
        либо вывести что их среднеарифметические значения равны.
         */

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = (int) (Math.random() * 11);
            array2[i] = (int) (Math.random() * 11);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 10; i++) {
            average1 += array1[i];
            average2 += array2[i];
        }

        average1 = average1 / 10;
        average2 = average2 / 10;

        if (average1 > average1) {
            System.out.println("Среднее арифметическое первого массива (" + average1 + ") больше, чем среднее арифметическое " +
                    "второго массива (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое первого массиваy (" + average1 + ") меньше, чем среднее арифметическое " +
                    "второго массива (" + average2 + ")");
        } else {
            System.out.println("Среднее арифметическое двух массивов равны (" + average1 + ")");
        }
    }
}

