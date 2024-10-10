
public class ContractJob extends Job {
    private double wage;
    private int numberOfHours;
    public ContractJob(String companyName, String position,  int syear, int smonth, int sday, int eyear, int emonth, int eday, double Hourlywage, int numberOfHoursPerDay)
    {
        super(companyName, position, syear, smonth, sday, eyear, emonth, eday);
        wage = Hourlywage;
        numberOfHours = numberOfHoursPerDay;
    }

    //Calculates the payment that the employee should recieve
    public double calculatePayment()
    {
        double salary = wage * numberOfHours * CalculatingJobDuration();
        return salary;
    }

    //Outputs a string depending on how many hours the employee works
    public String evaluateWorkLifeBalance()
    {
        double balance = numberOfHours + 5;
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
