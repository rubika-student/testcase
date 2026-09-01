public class testcase {

    // Addition
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     TEST CASE DONE BY RUBIKA");
        System.out.println("================================");

        // ================= ADDITION TEST CASES =================
        System.out.println("\n--- ADDITION TEST CASES ---");

        // Test Case 1
        if (add(2, 3) == 5)
            System.out.println("Test Case 1 - Addition PASSED");
        else
            System.out.println("Test Case 1 - Addition FAILED");

        // Test Case 2
        if (add(-5, 5) == 0)
            System.out.println("Test Case 2 - Addition PASSED");
        else
            System.out.println("Test Case 2 - Addition FAILED");

        // Test Case 3
        if (add(-5, -3) == -8)
            System.out.println("Test Case 3 - Addition PASSED");
        else
            System.out.println("Test Case 3 - Addition FAILED");


        // ================= SUBTRACTION TEST CASES =================
        System.out.println("\n--- SUBTRACTION TEST CASES ---");

        // Test Case 4
        if (subtract(10, 5) == 5)
            System.out.println("Test Case 4 - Subtraction PASSED");
        else
            System.out.println("Test Case 4 - Subtraction FAILED");

        // Test Case 5
        if (subtract(5, 5) == 0)
            System.out.println("Test Case 5 - Subtraction PASSED");
        else
            System.out.println("Test Case 5 - Subtraction FAILED");

        // Test Case 6
        if (subtract(-5, 3) == -8)
            System.out.println("Test Case 6 - Subtraction PASSED");
        else
            System.out.println("Test Case 6 - Subtraction FAILED");


        // ================= MULTIPLICATION TEST CASES =================
        System.out.println("\n--- MULTIPLICATION TEST CASES ---");

        // Test Case 7
        if (multiply(4, 5) == 20)
            System.out.println("Test Case 7 - Multiplication PASSED");
        else
            System.out.println("Test Case 7 - Multiplication FAILED");

        // Test Case 8
        if (multiply(10, 0) == 0)
            System.out.println("Test Case 8 - Multiplication PASSED");
        else
            System.out.println("Test Case 8 - Multiplication FAILED");

        // Test Case 9
        if (multiply(-3, 5) == -15)
            System.out.println("Test Case 9 - Multiplication PASSED");
        else
            System.out.println("Test Case 9 - Multiplication FAILED");


        // ================= DIVISION TEST CASES =================
        System.out.println("\n--- DIVISION TEST CASES ---");

        // Test Case 10
        if (divide(10, 2) == 5)
            System.out.println("Test Case 10 - Division PASSED");
        else
            System.out.println("Test Case 10 - Division FAILED");

        // Test Case 11
        if (divide(5, 2) == 2.5)
            System.out.println("Test Case 11 - Division PASSED");
        else
            System.out.println("Test Case 11 - Division FAILED");

        // Test Case 12
        if (divide(-10, 2) == -5)
            System.out.println("Test Case 12 - Division PASSED");
        else
            System.out.println("Test Case 12 - Division FAILED");


        System.out.println("\n================================");
        System.out.println("       TESTING COMPLETED");
        System.out.println("================================");
    }
}