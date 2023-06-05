package KnigaUchota;

import java.util.Arrays;

public class knigaUchota {
    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    private static Employee[] employees = new Employee[10];

    public static void main(String[] arr) {

        employees[0] = new Employee("Тванов Игорь Валерьевич",
                1, 61600);
        employees[1] = new Employee("Хорошов Александор Семёнович",
                1, 67500);
        employees[2] = new Employee("Петрова Александра Михайлович",
                2, 62500);
        employees[3] = new Employee("Твардовский Павел Игоревич",
                2, 66900);
        employees[4] = new Employee("Носов Александор Павлович",
                3, 65500);
        employees[5] = new Employee("Утятин Сергей Петрович",
                3, 55500);
        employees[6] = new Employee("Малинников Андрей Юрьевич",
                4, 51400);
        employees[7] = new Employee("Митрохин Алексей Петрович",
                4, 53400);
        employees[8] = new Employee("Сегоглазова Анастасия Валерьевич",
                5, 45700);
        employees[9] = new Employee("Москвина Маргарита Семёновна",
                5, 66700);

        printAll();
        System.out.println("Сумма затрат на зарплату: " + sumSalary());
        minSalary();
        maxSalary();
        System.out.println("Средная трата на зарплату: " + averageSalary());
        personalName();


    }

    static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static void maxSalary() {
        int max = employees[0].getSalary();
        int workerMax = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                workerMax = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employees[workerMax]);

    }

    private static void minSalary() {
        int min = employees[0].getSalary();
        int worker = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                worker = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employees[worker]);

    }

    private static float averageSalary() {
        return (float) sumSalary() / employees.length;
    }

    static void personalName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());

        }
    }
}


