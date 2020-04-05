import static src.Lesson.thirdMethod;

public class Third {

    public static void main(String[] args) {

        //#3
        //Найти самое маленькое и самое большое значение в array и вывести их на экран. Возьмите размер array = 8.

        int[] array = {5, 4, 36, 2, 7, 0, 9, 3};
        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue <= array[i]) {
                maxValue = array[i];
            }

            if (minValue >= array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("Самое большое значение в массиве " + "array" + " " + maxValue);
        System.out.println("Самое маленькое значение в массиве " + "array" + " " + minValue);
    }
}


