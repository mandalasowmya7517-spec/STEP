 import java.util.Scanner;

class ElectricityBill {

    int charge = 100;

    void calculateBill(int Bill) {
        System.out.println("Electricity Bill: " + Bill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElectricityBill B = new ElectricityBill();

        System.out.println("Enter units:");
        int units = sc.nextInt();

        int Bill;

        if (units <= 100) {
            Bill = (units * 2) + 100;
            B.calculateBill(Bill);
        }
        else if (units <= 200) {
            Bill = (100 * 2) +100 + (units - 100) * 3 ;
            B.calculateBill(Bill);
        }
        else if (units <= 500) {
            Bill = (100 * 2) + (100 * 3) +  100 +(units - 200) * 5 ;
            B.calculateBill(Bill);
        }
        else {
            Bill = (100 * 2) + (100 * 3) + (300 * 5)+100
                   + (units - 500) * 7 + 100;
            B.calculateBill(Bill);
        }

        sc.close();
    }
}