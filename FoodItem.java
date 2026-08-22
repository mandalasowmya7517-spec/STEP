 import java.util.Scanner;
class FoodItem {
    int item_id;
    String item_name;
    int price;
    int quantity;
    double subtotal;
    void order() {
        Scanner sc = new Scanner(System.in);
             System.out.println("enter no of items:");
             int n=sc.nextInt();
             for(int i=0;i<n;i++) {
                     System.out.println("enter id of the food item:");
                     item_id=sc.nextInt();
                     sc.nextLine();
                     System.out.println("enter food item name:");
                     item_name=sc.nextLine();
                     System.out.println("enter price of the food item:");
                     price=sc.nextInt();
                     System.out.println("enter quantity:");
                     quantity=sc.nextInt();
                     subtotal = subtotal + (quantity*price);
      
             }
             sc.close();
    }
    void calculateBill() {
        double subtotal = quantity*price;
         System.out.println("subtotal: "+ subtotal);
         System.out.println("delivery=0");
         System.out.println("finalbill: "+ subtotal);

    }
    void calculateBill(double discount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the discount amount:");
        discount=sc.nextDouble();
        sc.close();
        double subtotal = quantity * price;
        double discountAmount = subtotal * discount / 100;
        double finaLBill= subtotal - discountAmount;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discountAmount);
        System.out.println("finalbill" + finaLBill);
    }
    void calculateBill(double discount,double deliveryCharge) {
    double subtotal = quantity * price;
    double discountAmount = subtotal * discount / 100;

    if (subtotal > 1000) {
        deliveryCharge = 0;
        double finaLBill = subtotal-discountAmount+deliveryCharge;
    } else {
        deliveryCharge = 50;
        double finaLBill = subtotal-discountAmount+deliveryCharge;
    }

    System.out.println("Subtotal: " + subtotal);
    System.out.println("Discount: " + discountAmount);
    System.out.println("Delivery Charge: " + deliveryCharge);
    System.out.println("FinalBill: " +  finaLBill);

    }
public static void main(String[] args) {
      FoodItem f1 = new FoodItem();
    f1.order();
    f1.calculateBill();
}
}