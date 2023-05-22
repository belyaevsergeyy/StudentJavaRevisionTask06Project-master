package by.itstep.javatraining.revision.task;

/*	Task X. Unique Number Digits [уникальные цифры числа]
 *
 *	Дано целое число. Необходимо определить, все ли цифры числа уникальны,
 *	т.е. среди цифр числа нет повторяющихся.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено булевское значение - результат решения задания.
 *
 *	[ input 1]: 12345
 *	[output 1]: true
 *
 *	[ input 2]: 54321
 *	[output 2]: true
 *
 *	[ input 3]: 11111
 *	[output 3]: false
 *
 *	[ input 4]: 121
 *	[output 4]: false
 *
 *	[ input 5]: -12345
 *	[output 5]: true
 *
 *	[ input 6]: 0
 *	[output 6]: true
 */

import java.util.ArrayList;
import java.util.Collections;

public class TaskX {
    public static boolean taskX(long number) {
        if (number < 0) {
            number = -number;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (number > 0) {
            list.add((int) (number % 10));
            number /= 10;
        }
        if (list.size() < 2) {
            return true;
        }
        Collections.sort(list);
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
        return Collections.max(list1) == 1;
    }
}
