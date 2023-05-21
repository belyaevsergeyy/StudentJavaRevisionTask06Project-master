package by.itstep.javatraining.revision.task;

/*	Task 05. Max Number Digit [максимальная цифра числа]
 *
 *	Дано целое число. Необходимо найти максимальную цифру заданного числа
 *	с использованием эффективного алгоритма.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должна быть возвращена максимальная цифра числа.
 *
 *	[ input 1]: 987_654_321
 *	[output 1]: 9
 *
 *	[ input 2]: 12345
 *	[output 2]: 5
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -15
 *	[output 4]: 5
 */


import java.util.ArrayList;
import java.util.Collections;

public class Task05 {
    public static int task05(long number) {
        if (number < 0) {
            number = -number;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        while (number > 0) {
            list.add((int) (number % 10));
            number /= 10;
        }
        return Collections.max(list);
    }
}