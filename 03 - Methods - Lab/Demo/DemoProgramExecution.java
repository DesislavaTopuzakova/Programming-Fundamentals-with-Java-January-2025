package Methods_Lab;

public class DemoProgramExecution {
    public static void main(String[] args) {
        System.out.println("before method executes");
        printLogo();
        System.out.println("after method executes");
    }
    public static void printLogo() {
        System.out.println("Company Logo");
        System.out.println("http://www.companywebsite.com");
        printName();

    }
    public static void printName() {
        System.out.println("Company Name");
        System.out.println("Bosch");

    }


}
