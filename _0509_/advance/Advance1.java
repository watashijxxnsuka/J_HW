package _0509_.advance;

import java.time.LocalDate;

public class Advance1 {
    public static void main(String[] args) {

        LocalDate wedding = LocalDate.of(2001, 12, 19);

        if (wedding.isLeapYear()) {
            wedding = wedding.plusDays(1);

        }

        LocalDate anniver2022 = LocalDate.of(2022, wedding.getMonth(), wedding.getDayOfMonth());
        System.out.println("2022년의 결혼기념일: " + anniver2022);


    }
}
