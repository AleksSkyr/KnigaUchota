package KnigaUchota;


public class Employee {
    private int id;
    public String surname;

    public String name;
    public String patronymic;
    public int departament;
    public int salary;
    private static int idCounter;


    public Employee(String surname, String name, String patronymic, int departament, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        if (departament > 0 && departament < 6) {
            this.departament = departament;
        } else {
            throw new IllegalArgumentException("в нашей компании всего пять отделов");
        }
        this.salary = salary;
        this.id = ++idCounter;
    }


    public int getId() {
        return id;
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

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "id=" + id + ". Ф.И.О.: " + surname + " " + name + " " + patronymic + ' ' +
                ". Отдел:" + departament +". Зарплата: " + salary;
    }
}


