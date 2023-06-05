package KnigaUchota;


public class Employee {
    private int id;
    public String Fio;
    public int departament;
    public int salary;
    private static int idCounter;


    public Employee(String Fio, int departament, int salary) {
        this.Fio = Fio;
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



    public String getFio() {
        return Fio;
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
                "id=" + id + ". Ф.И.О.: " + Fio + ' ' +
                ". Отдел:" + departament +". Зарплата: " + salary;
    }
}


