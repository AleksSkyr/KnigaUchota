package KnigaUchota;


public class Employee {
    private int id;
    public String surname;

    public String name;
    public String patronymic;
    public int otdel;
    public int salary;  //ctavka


    public Employee(String surname, String name, String patronymic,
                    int otdel, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        if (otdel > 0 && otdel < 6) {
            this.otdel = otdel;
        } else {
            throw new IllegalArgumentException("в нашей компании всего пять отделов");
        }
        if (salary >= 0) {                                           // Не может быть отрицательной зарплаты
            this.salary = salary;
        }
        this.id = id++;
    }

    public int getId() {
        return id++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getOtdel() {
        return otdel;
    }

    public void getSalary() {
        if (salary >= 0) {
            this.salary = salary;
        }

    }
    @Override
    public String toString() {
        return "Сотрудник: " +
                "id: " + id + ", Ф.И.О.: " + surname + ' ' + name + ' ' + patronymic + ' ' +
                ", Отдел: " + otdel +
                ", Зарплата: " + salary + ' ' ;
    }
}


