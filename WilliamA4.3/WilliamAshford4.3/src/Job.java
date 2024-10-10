import java.time.LocalDate;
import java.util.Scanner;

public abstract class Job {
    private String companyName;
    private String position;
    private LocalDate startDate;
    private LocalDate endDate;
    private int Jobsatisfaction;

    public Job(String companyName, String position, int syear, int smonth, int sday, int eyear, int emonth, int eday)
    {
        this.companyName = companyName;
        this.position = position;
        this.startDate = LocalDate.of(syear, smonth, smonth);
        this.endDate = LocalDate.of(eyear, smonth, emonth);
    }

    //Prints out what company the employee is from and the position that they were in
    public void DisplayJobDetails()
    {
        System.out.println("Company: " + companyName + "   Position: " + position);
    }

    //Calculates the number of day the employee has worked for the company 
    public int CalculatingJobDuration()
    {
        int sy = startDate.getYear();
        int ey = endDate.getYear();
        int sm = startDate.getMonthValue();
        int em = endDate.getMonthValue();
        int sd = startDate.getDayOfMonth();
        int ed = endDate.getDayOfMonth();
        int result = ((ey - sy)*365) + ((em - sm)*30) + (ed - sd);
        return result;
    }

    //Assesses the job statifaction of the employee by asking the user a question that they must enter a number between 1 and 10
    Scanner myObj = new Scanner(System.in);
    public void AssessingJobSatisfaction()
    {
        System.out.println("Enter how satisfied the employee is with their job using a scale from 1-10.");
        Jobsatisfaction = myObj.nextInt();
    }
}
