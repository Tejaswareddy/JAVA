import java.util.Scanner;

class DiscountCapgemini {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int quantity_price = 100;
        System.out.println("Enter the number of quantities you want to buy");
        int quanBought = s.nextInt();
        int cost = quanBought * quantity_price;
        if (cost >= 1000) {
            System.out.println("You are eligible for 10% discount");
            int discount = cost * 10 / 100;
            int finalPrice = cost - discount;
            System.out.println("Discount Amount: " + discount);
            System.out.println("Final price after discount: " + finalPrice);
        } else {
            System.out.println("You are not eligible for discount");
            System.out.println("Amount to be paid: " + cost);
        }
        s.close();
    }
}
