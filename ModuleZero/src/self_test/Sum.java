package self_test;

public class Sum {
    private int termX;
    private int termY;
    public Sum(int termX, int termY) {
        this.termX = termX;
        this.termY = termY;
    }
    public void summary(int termX, int termY) {
        int result = termX + termY;
        System.out.println("This is a Sum acquired with method " + result + '.');
    }
    public void summary() {
        int result = this.termX + this.termY;
        System.out.printf("This is a result received by default values summary: %d%n", result);
    }
}
