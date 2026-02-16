import java.util.Scanner;
void main() {

    IO.println("Hello and welcome!");
    Scanner input = new Scanner (System.in);
    for (int i = 1; i <= 5; i++) {
        IO.println("i = " + i);
    }

    IO.println("Enter a number:");
    int number = input.nextInt();


    if (number % 2 == 0) {
        IO.println("The number is Even.");
    } else {
        IO.println("The number is Odd.");
    }

    int factorial = 1;
    for (int j = 1; j <= number; j++) {
        factorial *= j;
    }

    IO.println("Factorial of " + number + " is: " + factorial);

    int sum = 0;
    for (int k = 1; k <= number; k++) {
        sum += k;
    }

    IO.println("Sum from 1 to " + number + " is: " + sum);
}
