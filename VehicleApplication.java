import java.util.Scanner;

public class VehicleApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tyres: ");
        int numberOfTyres = scanner.nextInt();

        Vehicle vehicle;

        switch (numberOfTyres) {
            case 2:
                vehicle = new Bike();
                break;
            case 4:
                vehicle = new Car();
                break;
            default:
                vehicle = new Vehicle();
        }

        vehicle.display();
        scanner.close();
    }
}
