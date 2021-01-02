
public class VariableHidingTest {
	private static int i = 0;
    private static int j = 0;
    public static void main(String[] args) {
        int i = 2;
        int k = 3;

        // What is this thing, that appears to be like an initializer block inside the main method?
        {
            int j = 3;
            System.out.println("i + j is " + i + j);
        }

        k = i + j;

        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }

}
