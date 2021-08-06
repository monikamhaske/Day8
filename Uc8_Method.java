package EmployeeWage;

public class Uc8_Method {
	public static void main(String[] args) {
        calculateWage("FlipKart", 25, 20, 200);
        calculateWage("Mintra", 50, 25 ,250 );
        calculateWage("Amazon", 75, 30, 300);
	}
static void calculateWage(String companyName, int WagePerHr, int WorkingDays, int WorkingHrs) {
		int FULLTIME=8;
		int PARTTIME=4;
		int day=0;
		int empHr=0;
		int wage = 0;
		System.out.println("Details of " + companyName + " employee Wage");
        System.out.println("Wage per hour:" + WagePerHr);
        System.out.println("Maximum working days:" + WorkingDays);
        System.out.println("Maximum working hours:" + WorkingHrs);																		

		while (day <= 19) {
			int n = (int) (Math.random() * 10) % 3;
		switch (n) {
		case 1:
			System.out.println("present FullTime");
			wage = (wage + (WorkingHrs * FULLTIME));

            empHr=(empHr+ FULLTIME);
			day++;
			break;
		case 2:
			System.out.println("present PartTime");
			wage = (wage + (WorkingHrs * PARTTIME));

			empHr=(empHr+ PARTTIME);

			day++;
			break;
		default:
			System.out.println("absent");
		    day++;
			if( empHr == 100)
				break;
		}
		 }
		System.out.println("total wage of a month is: " +wage);
		System.out.println("Employee Hour: " +empHr);
		System.out.println("Employee Work Day: " +day + "\n");

	}


	}




