import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        // ItemDiscountServices itemDiscountServices = new ItemDiscountServices();
        // itemDiscountServices.main();
        // ElectricityProblem electricityProblem = new ElectricityProblem();
        // electricityProblem.main();
        // Panlindrome panlindrome = new Panlindrome();
        // panlindrome.main();
        // AmstongNumber amstongNumber = new AmstongNumber();
        // amstongNumber.main();
        // NumberFormat numberFormat = new NumberFormat();
        // numberFormat.main();
        // NeonNumber neonNumber = new NeonNumber();
        // neonNumber.main();
        // BiggestNumber biggestNumber = new BiggestNumber();
        // biggestNumber.main();
        // MatrixArrayCalcualtor matrixArrayCalcualtor = new MatrixArrayCalcualtor();
        // matrixArrayCalcualtor.main();
        ShortenString shortenString = new ShortenString();
        shortenString.main();
    }
}

class ItemDiscountServices {
    // A cloth showroom has announced the following festival discount on the
    // purchase items based on the total cost of the item purchase. Write a code to
    // input the total cost and we have to compute and display the amount to be
    // paid.

    public void main() {
        System.out.println("Enter the total cost of the item purchase");
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int discount = calculateDiscount(cost);
        int amountToBePaid = calculateAmountToBePaid(cost, discount);
        System.out.println("The amount to be paid is " + amountToBePaid);
        System.out.println("The discount is " + discount);
        sc.close();
    }

    private int calculateDiscount(int cost) {
        int discount = 0;
        if (cost < 2000) {
            discount = (cost * 5) / 100;
        } else if (cost < 5000) {
            discount = (cost * 25) / 100;
        } else if (cost < 10000) {
            discount = (cost * 35) / 100;
        } else if (cost >= 10000) {
            discount = (cost * 50) / 100;
        } else {
            discount = 0;
        }
        return discount;
    }

    private int calculateAmountToBePaid(int cost, int discount) {
        return cost - discount;
    }
}

class ElectricityProblem {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed");
        double units = sc.nextDouble();
        double bill = calculateBill(units);
        System.out.println("The bill amount is " + bill);
        sc.close();
    }

    private double calculateBill(double units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * .80;
        } else if (units <= 200) {
            bill = units * 1;
        } else {
            bill = units * 1.25;
        }
        bill += 50;
        return bill;
    }
}

abstract class Calculator {
    abstract double area();

    abstract double perimeter();

    abstract double diagonal();
}

class Rectangle extends Calculator {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    double diagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2));
    }
}

class Square extends Calculator {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }

    @Override
    double diagonal() {
        return Math.sqrt(2) * side;
    }
}

class Circle extends Calculator {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double diagonal() {
        return 2 * radius;
    }
}

class FindAreaPeriAndDiag {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice (1 - Rectangle, 2 - Square, 3 - Circle)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter the length and breadth");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, breadth);
                System.out.println("The area is " + rectangle.area());
                System.out.println("The perimeter is " + rectangle.perimeter());
                System.out.println("The diagonal is " + rectangle.diagonal());
                break;
            }
            case 2: {
                System.out.println("Enter the side");
                double side = sc.nextDouble();
                Square square = new Square(side);
                System.out.println("The area is " + square.area());
                System.out.println("The perimeter is " + square.perimeter());
                System.out.println("The diagonal is " + square.diagonal());
                break;
            }
            case 3: {
                System.out.println("Enter the radius");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("The area is " + circle.area());
                System.out.println("The perimeter is " + circle.perimeter());
                System.out.println("The diagonal is " + circle.diagonal());
                break;
            }
        }
        sc.close();
    }
}

class Panlindrome {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        Panlindrome panlindrome = new Panlindrome();
        System.out.println(
                "The string " + str + " is " + ((panlindrome.isPalindrome(str)) ? "a palindrome" : "not a palindrome"));
        sc.close();
    }

    private boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

class AmstongNumber {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("The number " + number + " is "
                + ((isAmstrong(number)) ? "an amstrong number" : "not an amstrong number"));
        sc.close();
    }

    boolean isAmstrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum == number;
    }
}

class SumOfDigits {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("The sum of digits of " + number + " is " + sumOfDigits(number));
        sc.close();
    }

    int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}

class ReverseNumber {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("The reverse of " + number + " is " + reverseNumber(number));
        sc.close();
    }

    int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}

class Factorial {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));
        sc.close();
    }

    int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

class Fibonacci {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("The fibonacci series upto " + number + " is ");
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        sc.close();
    }

    int fibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

class PrimeNumber {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println(
                "The number " + number + " is " + ((isPrime(number)) ? "a prime number" : "not a prime number"));
        sc.close();
    }

    boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}

class PrimeNumberUptoN {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("The prime numbers upto " + number + " are ");
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }

    boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}

class NumberFormat {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        numFormat(number);
        sc.close();
    }

    void numFormat(int num) {
        for (; num > 0; num -= 2) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}

class NeonNumber {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println(
                "The number " + number + " is " + ((isNeon(number)) ? "a neon number" : "not a neon number"));
        sc.close();
    }

    boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        return sum == number;
    }
}

class BiggestNumber {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The biggest number is " + biggestNumber(arr));
        sc.close();
    }

    int biggestNumber(int[] arr) {
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
}

class MatrixArrayCalcualtor {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of apples: ");
        int row = sc.nextInt();
        int arr[][] = new int[row][];
        System.out.println("Enter the number of apples in each row: ");
        for (int i = 0; i < row; i++) {
            int col = sc.nextInt();
            arr[i] = new int[col];
            System.out.println("Enter the number of apples in row " + (i + 1) + ": ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The total number of apples are " + totalApples(arr));
        sc.close();
    }

    int totalApples(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr[i]).length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}

class ArrayCompartibilityCheck {
    public void main() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][5];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the elements of the row " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array is " + ((isCompatible(arr)) ? "compatible" : "not compatible"));
        sc.close();
    }

    boolean isCompatible(int[][] arr) {
        if (arr[0].length != arr[1].length) {
            return false;
        }
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[0][i] >= arr[1][i]) {
                return false;
            }
        }
        return true;
    }
}

class MaximumInEachRow {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        int[][] arr = new int[row][];
        System.out.println("Enter the number of elements in each row: ");
        for (int i = 0; i < row; i++) {
            int col = sc.nextInt();
            arr[i] = new int[col];
            System.out.println("Enter the elements of row " + (i + 1) + ": ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The maximum elements in each row are: ");
        for (int i = 0; i < row; i++) {
            System.out.println(maximum(arr[i]));
        }
    }

    int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
        }
        return max;
    }
}

class ShortenString {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The shortened string is " + shortenString(str));
        sc.close();
    } 

    String shortenString(String str) {
        String[] words = str.split("");
        String result = words[0] + words.length + words[words.length - 1];
        return result;
    }
}