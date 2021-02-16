package task4;
/*4.	Составить программу, печатающую значение true,
 если указанное высказывание является истинным, и false —
 в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

public class Task4 {
    public static boolean calculateEven(int a, int b, int c, int d) {
        int count = 0;
        int[] numbers = {a, b, c, d};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
                if (count == 2) {
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }
}
