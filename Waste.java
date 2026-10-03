import java.util.Scanner;

class Waste {
    
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste at point 1: ");
        double p1 = sc.nextDouble();

        System.out.print("Enter waste at point 2: ");
        double p2 = sc.nextDouble();

        double total = calculateTotalWaste(p1, p2);

        System.out.println("Total waste collected: " + total);
    }
}