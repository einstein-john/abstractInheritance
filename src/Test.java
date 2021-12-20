import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Employee jack = new Employee("Jack",70,30);
        Student suzan = new Student("Suzan",19,20);
        suzan.setSchoolName("Cyprus International University (CIU) ");
        String Output = "";
        Person [] personArray = {jack,suzan};
            for (Person eachPerson : personArray){
                Output += "NAME: " + eachPerson.fullName + "\n";
                Output += "Weekly Income: " + eachPerson.calculateWeeklyIncome() + "\n";
                Output += "Monthly Income: "+  eachPerson.calculateMonthlyIncome() + "\n\n";

            }
        JOptionPane.showMessageDialog(null,Output);

            Output = "Name: " + jack.fullName + "\n" + "Yearly Income: " + jack.calculateYearlyIncome() + "\n\n"
            +"Name: " + suzan.fullName + "\n" + "Birth year: " + suzan.calculateBirthYear() + "\n";

            JOptionPane.showMessageDialog(null,Output);





    }
}
