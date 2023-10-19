public class program2 {
    public static void main(String[] args) {
        // Java arithmetic operators
        System.out.println("\nJava Arithmetic Operators:");

        int a = 5, b = 10, result; // declaring variables

        result = a + b; // addition
        System.out.println("Addition = " + result);

        result = a - b; // subtraction
        System.out.println("Subtraction = " + result);

        result = a * b; // multiplication
        System.out.println("Multiplication = " + result);

        result = a / b; // division
        System.out.println("Division = " + result);

        result = a % b; // modulus division
        System.out.println("Modulus Division = " + result);

        // Java Assignment Operators
        System.out.println("\nJava Assignment Operators:");

        // assigning value using =
        int var = a; // declaring a new variable named var
        System.out.println("The value of variable 'var' is assigned as " + var);

        // assigning value using += i.e. (var = var + a;)
        var += a;
        System.out.println("The value of var using += operator is " + var);

        // assigning value using -= i.e. (var = var - a;)
        var -= a;
        System.out.println("The value of var using -= operator is " + var);

        // assigning value using *= i.e. (var = var * a;)
        var *= a;
        System.out.println("The value of var using *= operator is " + var);

        // assigning value using /= i.e. (var = var / a;)
        var /= a;
        System.out.println("The value of var using /= operator is " + var);

        // Java Relational Operators
        System.out.println("\nJava Relational Operators:");

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);
        // Equal to (==) operator
        System.out.println("a == b is " + (a == b));
        // Not equal to (!=) operator
        System.out.println("a != b is " + (a != b));
        // Greater than (>) operator
        System.out.println("a > b is " + (a > b));
        // Less than (<) operator
        System.out.println("a < b is " + (a < b));
        // Greater than or equal to (>=) operator
        System.out.println("a >= b is " + (a >= b));
        // Less than or equal to (<=) operator
        System.out.println("a <= b is " + (a <= b));

        // Java Logical Operators
        System.out.println("\nJava Logical Operators:");
        // AND operator (&&)
        System.out.println("The AND operation for (5 > 3) && (8 > 5) is " + ((5 > 3) && (8 > 5))); // true
        System.out.println("The AND operation for (5 > 3) && (8 < 5) is " + ((5 > 3) && (8 < 5))); // false
        // OR operator (||)
        System.out.println("The OR operation for (5 < 3) || (8 > 5) is " + ((5 < 3) || (8 > 5))); // true
        System.out.println("The OR operation for (5 > 3) || (8 < 5) is " + (5 > 3)); // true
        System.out.println("The OR operation for (5 < 3) || (8 < 5) is " + ((5 < 3) || (8 < 5))); // false
        // NOT operator (!)
        System.out.println("The NOT operation for (!(5 == 3)) is " + (!(5 == 3))); // true
        System.out.println("The NOT operation for (!(5 > 3)) is " + (!(5 > 3))); // false

        // Java Unary Operators (increment/decrement)
        System.out.println("\nJava Unary Operators (increment/decrement):");

        // declaring variables
        int result1, result2;

        // original value
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        // pre-increment operator
        result1 = ++a;
        System.out.println("After pre-incrementing a: " + result1);
        // pre-decrement operator
        result2 = --b;
        System.out.println("After pre-decrementing b: " + result2);
        // post-increment operator
        result1 = a++;
        System.out.println("After post-incrementing a: " + result1);
        // post-decrement operator
        result2 = b--;
        System.out.println("After post-decrementing b: " + result2);

        // Java instanceof Operator
        System.out.println("\nJava instanceof Operator:");

        String str = "test string";
        boolean result3;

        // checks if str is an instance of
        // the String class
        result3 = str instanceof String;
        System.out.println("Is str an object of String? " + result3);

        // Java ternary operator
        System.out.println("\nJava ternary operator");
        System.out.println("a is " + a + " and b is " + b);
        int max = (a > b) ? a : b;
        System.out.println("The maximum of a and b is: " + max);
    }
}
