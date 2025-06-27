public class MainTest {
    public static void main(String[] args) {
        String expected = "Hello, DevOps!";
        String actual = getGreeting();

        if (expected.equals(actual)) {
            System.out.println("✅ Test passed");
        } else {
            System.out.println("❌ Test failed");
        }
    }

    public static String getGreeting() {
        return "Hello, DevOps!";
    }
}
