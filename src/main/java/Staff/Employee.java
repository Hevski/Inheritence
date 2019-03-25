package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(Double value){
        if (value > 0){
            this.salary += value;
        }
    }

    public int payBonus(){
        return this.salary / 100 * 1;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}



