package by.itstep.javatraining.revision.task;

/*	Task 06. The Count of Min Number Digits [количество наименьших цифр числа]
 *
 *	Дано целое число. Необходимо определить, какое количество цифр
 *	заданного числа равны его наименьшей цифре с использованием эффективного алгоритма.
 *
 *	Примечание
 *	Постарайтесь при решении задания использовать только одну циклическую конструкцию.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 1234
 *	[output 1]: 1
 *
 *	[ input 2]: 4112
 *	[output 2]: 2
 *
 *	[ input 3]: 100
 *	[output 3]: 2
 *
 *	[ input 4]: -2222
 *	[output 4]: 4
 */


public class Task06 {
    public static int task06(long number) {
        if (number < 0) {
            number = -number;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        int min = (int) (number % 10);
        while (number > 0) {
            if (min == number % 10) {
                count++;
            } else if (number % 10 < min) {
                count = 1;
                min = (int) (number % 10);
            }
            number /= 10;
        }
        return count;
    }

}