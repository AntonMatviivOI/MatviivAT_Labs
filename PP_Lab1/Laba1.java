package Univer;

import java.util.Scanner;

class FNumber {
    private int index;     // номер числа у послідовності
    private long value;    // значення числа

    public FNumber(int index, long value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public long getValue() {
        return value;
    }

    public boolean isCubeMinusOne() {
        long a = value + 1;                 // додаємо 1
        long w = Math.round(Math.cbrt(a));  // кубічний корінь
        return w * w * w == a;              // перевірка
    }

    public String toString() {
        return "F(" + index + ") = " + value;
    }
}

