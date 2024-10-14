package self_test;

public class Main {
    public static void main(String[] args) {
        Sum summaryObj = new Sum(9,10);
        String message = "Hello, apprentice.";
        System.out.printf("%s%n", message);
        summaryObj.summary();
        summaryObj.summary(101, 202);
        System.out.println("End.");
    }
}
