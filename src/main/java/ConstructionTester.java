import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      double taxRate;//Sales tax.
      int windows;
      int boards;//AKA lumber
      double total;//Subtotal
      double grandTotal;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the sales tax rate: ");
      taxRate = in.nextDouble();
      System.out.println("How many boards do you need? ");
      boards = in.nextInt();
      System.out.println("How many windows do you need? ");
      windows = in.nextInt();
      Construction cost = new Construction(8, 11, taxRate);
      total = cost.lumberCost(boards) + cost.windowCost(windows);
      System.out.println("Total: " + total);
      grandTotal = cost.grandTotal(total);
      System.out.print("Grand Total: " + grandTotal);
    }
}