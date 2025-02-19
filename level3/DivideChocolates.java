import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of chocolates:");
        int numberOfChocolates = input.nextInt();

        System.out.println("Number of children:");
        int numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + "  and the number of remaining chocolates are: " + remainingChocolates);
    }
}