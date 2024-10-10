
public class Test {
    public static void main(String[] args)
    {
        Employee EMP = new Employee();

        FullTimeJob FT = new FullTimeJob("Google", "Manager", 2020, 4, 30, 2025, 2, 3, 20, 40);
        FT.DisplayJobDetails();
        FT.AssessingJobSatisfaction();
        System.out.print("The Duration of the job in days is ");
        System.out.println(FT.CalculatingJobDuration());
        
        PartTimeJob PT = new PartTimeJob("Walmart", "Assistant Manager ", 2014, 1, 3, 2014, 12, 21, 15, 030);
        PT.DisplayJobDetails();
        PT.AssessingJobSatisfaction();
        System.out.print("The Duration of the job in days is ");
        System.out.println(PT.CalculatingJobDuration());

        ContractJob C = new ContractJob("Best Buy", "Contractee", 2018, 4, 14, 2018, 10, 14, 17, 6);
        C.DisplayJobDetails();
        C.AssessingJobSatisfaction();
        System.out.print("The Duration of the job in days is ");
        System.out.println(C.CalculatingJobDuration());
    }
}
