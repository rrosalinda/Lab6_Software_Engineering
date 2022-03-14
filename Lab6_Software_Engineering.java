import java.util.Scanner;

public class Lab6_Software_Engineering {

        public static void main(String[] args) {
            double number1, number2, resultAdd = 0;

            Scanner input =  new Scanner(System.in);

            System.out.print("Number 1: ");
            number1 = input.nextDouble();

            System.out.print("Number 2: ");
            number2 = input.nextDouble();

            resultAdd = number1 + number2;


            System.out.print("Addition Result: " + resultAdd);
        }

}
