import java.util.Calendar;

public abstract class Person {
    protected String fullName;
    protected int age;
    protected long allowance;
    protected long salary;
    protected int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public Person() {
    }

    public Person(String fName, int a, long allowance) {
        this.fullName = fName;
        this.age = a;
        this.allowance = allowance;
    }
    public Person(String FName,long salary,int a){
        this.fullName = FName;
        this.salary = salary;
        this.age = a;
    }

    public abstract double calculateWeeklyIncome();

    public abstract double calculateMonthlyIncome();

}
