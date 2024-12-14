package self_test;

public class Main {
    public static void main(String[] args) {
        Sum summaryObj = new Sum(10,10);
        String message = "Hello, my young apprentice.";
        System.out.printf("%s%n", message);
        summaryObj.summary(1, 2);
        summaryObj.summary();
        System.out.println("End.");
    }
}
