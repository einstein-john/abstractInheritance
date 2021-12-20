public class Student extends Person{
    private String schoolName;

    public Student(String fName, int a, long allowance) {
        super(fName, a, allowance);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int calculateBirthYear(){
        int birthYear;
        birthYear = currentYear - age;
        return birthYear;
    }

    @Override
    public double calculateWeeklyIncome() {
        return allowance * 7;
    }

    @Override
    public double calculateMonthlyIncome() {
        return allowance * 30;
    }
}
