

public class FullTimeJob extends Job {

    private double wage;
    private int numberOfHours;
    public FullTimeJob(String companyName, String position,  int syear, int smonth, int sday, int eyear, int emonth, int eday, double Hourlywage, int numberOfHoursPerWeek)
    {
        super(companyName, position, syear, smonth, sday, eyear, emonth, eday);
        wage = Hourlywage;
        numberOfHours = numberOfHoursPerWeek;
    }

    //Calculates the monthly salary of the employee
    public double calculateSalary()
    {
        double salary = wage * numberOfHours * 4;
        return salary;
    }

        //Outputs a string depending on how many hours the employee works
    public String evaluateWorkLifeBalance()
    {
        double balance = numberOfHours + 10;
        if(balance < 40)
        {
            return "Excellent";
        }
        if(balance < 60)
        {
            return "Moderate";
        }
        return "Poor";
    }
}
