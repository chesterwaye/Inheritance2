import java.util.Scanner;

class Adder extends Arithmetic {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    Adder giveSum = new Adder();

    System.out.print("Enter the first number: ");
    int num1 = keyboard.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = keyboard.nextInt();

    int mySum = giveSum.add(num1, num2);

    System.out.println("My superclass is:Arithmetic " + '\n' + mySum);

  }

}
