//employeeprofession class

public class employeeprofession extends employee {

    private String profession;
    private int salary;

    employeeprofession(String name, int age, String profession, int salary){
        super(name,age);
        this.profession=profession;
        this.salary=salary;
    }

    //public void departmentname() {
    //    System.out.println("\n Nursing Department");
    //}

    public String toString(){
        return this.name + this.age + this.profession + this.salary;
    }
}