import static src.Lesson.secondMethod;

import java.util.Random;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        secondMethod();

        //#2
        /*Для выполнения задания понадобиться Scanner s = new Scanner(System.in);
        Необходимо ввести 10 значений с клавиатуры  и сохранить их в array, после этого вывести на экран.*/

        Scanner k = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел для массива: ");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = k.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

