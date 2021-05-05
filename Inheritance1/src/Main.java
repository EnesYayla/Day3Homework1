
public class Main {

	public static void main(String[] args) {
		StudentLogger studentLogger = new StudentLogger();
		studentLogger.log();

		InstructorLogger instructorLogger = new InstructorLogger();
		instructorLogger.log();

		UserLogger userLogger = new UserLogger();
		userLogger.log();

		System.out.println(" ");
		System.out.println("---------------------------");

		CustomerManager customerManager = new CustomerManager();
		customerManager.logMultiple(studentLogger);
		customerManager.logMultiple(new StudentLogger()); // new "Veri Tipi" þeklinde yazýlýrsa o veri tipine ait bir
														  // öðe oluþturulmaya gerek kalmaz

		System.out.println(" ");
		System.out.println("---------------------------");

		customerManager.logMultiple(userLogger);
		customerManager.logMultiple(new UserLogger());

		System.out.println(" ");
		System.out.println("---------------------------");

		customerManager.logMultiple(instructorLogger);
		customerManager.logMultiple(new InstructorLogger());

		System.out.println(" ");
		System.out.println("---------------------------");

	}

}
