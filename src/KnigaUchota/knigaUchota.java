package KnigaUchota;

import java.util.Arrays;

public class knigaUchota {
    public static void printAllArr(Employee[] arr) {   // Распечатать весь массив
        for (Employee employee : arr) {
            if (employee != null) {                     // Печатаем только заполненые строки массива
                System.out.println(employee + " ");
            }
        }
    }

    public static void main(String[] arr) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Тванов", "Игорь", "Валерьевич",
                1, 61600);
        employees[1] = new Employee("Хорошов", "Александор", "Семёнович",
                1, 67500);
        employees[2] = new Employee("Петрова", "Александра", "Михайлович",
                2, 62500);
        employees[3] = new Employee("Твардовский", "Павел", "Игоревич",
                2, 66900);
        employees[4] = new Employee("Носов", "Александор", "Павлович",
                3, 65500);
        employees[5] = new Employee("Утятин", "Сергей", "Петрович",
                3, 55500);
        employees[6] = new Employee("Малинников", "Андрей", "Юрьевич",
                4, 51400);
        employees[7] = new Employee("Митрохин", "Алексей", "Петрович",
                4, 53400);
        employees[8] = new Employee("Сегоглазова", "Анастасия", "Валерьевич",
                5, 45700);
        employees[9] = new Employee("Москвина", "Маргарита", "Семёновна",
                5, 66700);


        System.out.println(employees[5]);
        printAllArr(employees);


    }


}
