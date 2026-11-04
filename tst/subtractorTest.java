public class subtractorTest {
    public static void main(String[] args) {
        subtractor obj = new subtractor();

        if (obj.subtract(10, 5) == 5) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
