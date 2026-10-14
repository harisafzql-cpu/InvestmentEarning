import java.util.*;

public class investment {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Buying Price: ");
        double buyingPrice = sc.nextDouble();

        int day = 1;
        double closingPrice;

        while(true) {
            System.out.println();
            System.out.print("Enter your closing price for day" + day + ": ");
            closingPrice = sc.nextDouble();
            double earnings = closingPrice - buyingPrice;

            if(earnings > 0) {
                System.out.println("Earned amount: $" + earnings);
            }
            else if(earnings < 0) {
                System.out.println("Lost amount: $" + earnings);
            } else{
                System.out.println("Today ended with Break Even!");
            }
            day += 1;
        }
    }
}
