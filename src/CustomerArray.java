import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6,12, 21,43,2,4,7};

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];

            }
        }
        System.out.println("\nНаибольшее значение массива: " + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("\nНаименьшее значение массива: " + min);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println("\nСумма всех значений массива: " + sum);

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average = array[i] + average;
        }
        System.out.println("\nСреднее арифметическое массива: " + (average/array.length));

        int odd;
        System.out.print("\nНечетные числа массива: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                odd = array[i];
                System.out.print(" " + odd);
            }
        }


    }
}
