package by.itstep.javatraining.revision.task;

/*	Task 07. The Double Max [вторая максимальная цифра]
 *
 *	Дано целое число. Необходимо определить вторую по величине цифру данного числа,
 *	т.е. цифру, которая будет наибольшим, если из числа удалить наибольшую цифру.
 *	Если нет такой цифры, то должно быть возвращено число -1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 12345
 *	[output 1]: 4
 *
 *	[ input 2]: -56789
 *	[output 2]: 8
 *
 *	[ input 3]: 11111
 *	[output 3]: -1
 *
 *	[ input 4]: 0
 *	[output 4]: -1
 */

import java.util.ArrayList;
import java.util.Collections;

public class Task07 {
    public static int task07(long number) {
        if (number < 0) {
            number = -number;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (number == 0) {
            list.add(0);
        }
        while (number > 0) {
            list.add((int) (number % 10));
            number /= 10;
        }
        int max = Collections.max(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max){
                list.remove(i);
                i--;
            }
        }
        if (list.isEmpty()){
            return -1;
        }
        return Collections.max(list);
    }
}
