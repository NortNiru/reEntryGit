package self_test;

class Main {
    public static void main(String[] args) {
        Sum summaryObj = new Sum(10,11);
        String message = "Hello, my young apprentice.";
        System.out.printf("%s%n", message);
        summaryObj.summary(5, 2);
        summaryObj.summary();
        System.out.println("End.");
    }
}
