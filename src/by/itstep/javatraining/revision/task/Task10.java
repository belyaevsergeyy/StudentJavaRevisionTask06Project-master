package by.itstep.javatraining.revision.task;

/*	Task 10. The Largest Sequence of Number Digits [наибольшая последовательность цифр числа]
 *
 *	Дано целое число. Необходимо определить, какое наибольшее число подряд идущих
 *	цифр заданного числа равны друг другу. Если не нашлось ни одной пары, тройки
 *	и т.д. подряд идущих цифр, равных друг другу, то программа должна вывести число 1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[Sample function input 1]: 123456
 *	[Sample function output 1]: 1
 *
 *	[Sample function input 2]: 1234567789
 *	[Sample function output 2]: 2
 *
 *	[Sample function input 3]: 1122233335
 *	[Sample function output 3]: 4
 *
 *	[Sample function input 4]: 0
 *	[Sample function output 4]: 1
 *
 *	[Sample function input 5]: -15
 *	[Sample function output 5]: 1
 */

import java.util.ArrayList;
import java.util.Collections;

public class Task10 {
    public static int task10(long number) {
        if (number < 0) {
            number = -number;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (number > 0) {
            list.add((int) (number % 10));
            number /= 10;
        }
        if (list.size() < 2) {
            return 1;
        }
        int count = 1;
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)){
                count++;
            } else {
                list1.add(count);
                count = 1;
            }
        }
        list1.add(count);
        return Collections.max(list1);
    }
}