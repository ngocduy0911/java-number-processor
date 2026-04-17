public class NumberProcessor {

    public static int processNumber(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {   
            if (i % 2 == 0) {            
                result += i;             
            } else {
                result -= i;             
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = processNumber(n);
        System.out.println("Result = " + result);
    }
}
