package org.example;

import java.util.*;

public class Main {
    private static ArrayList<Integer> lst = new ArrayList<>(randomList(15, 10, 100));

    public static void main(String[] args) {
        /*
         * TODO: Задача №1
         * Пусть дан произвольный список целых чисел, удалить из него четные числа
         * (в языке уже есть что-то готовое для этого)
         */
        System.out.printf("%s => %s\n", lst, getOddValuesList(lst));

        /*
         * TODO: Задача №2
         * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
         * среднее арифметическое из этого списка.
         */
        System.out.printf("%s => %s", lst, getMinMaxArithmetiMeanList(lst));
    }

    /**
     * <h3>Возвращает минимальное, максимальное
     * и среднее арифметическое из списка</h3>
     *
     * @param lst произвольный список целых чисел
     * @return словарь ключ/значение
     */
    private static Map<String, Integer> getMinMaxArithmetiMeanList(ArrayList<Integer> lst) {
        Map<String, Integer> res = new LinkedHashMap<>();
        res.put("Минимальное значение", Collections.min(lst));
        res.put("Максимальное значение", Collections.max(lst));
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        res.put("Среднее арифметическое", sum / lst.size());
        return res;
    }

    /**
     * <h3>Возвращает список из нечетных значений</h3>
     *
     * @param lst произвольный список целых чисел
     * @return список из нечетных значений
     */
    public static ArrayList<Integer> getOddValuesList(ArrayList<Integer> lst) {
        ArrayList<Integer> oddValues = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++)
            if (lst.get(i) % 2 != 0) {
                oddValues.add(lst.get(i));
            }
        return oddValues;
    }

    /**
     * <h3>Рандомный список</h3>
     *
     * @param len    - длинна списка
     * @param minval - минимальнаый диапазон значения
     * @param maxval - максимальный диапазон значения
     * @return - рандомный список
     */
    public static ArrayList<Integer> randomList(int len, int minval, int maxval) {
        ArrayList<Integer> lst = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < len; index++) {
            lst.add(random.nextInt(minval, maxval));
        }
        return lst;
    }
}
