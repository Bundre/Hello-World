import java.util.Scanner;

public class MileageIfElse {
	public static void main(String[] args) {

		int CarMileage;
		String name;
		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("What is the brand/model of your car?");
			name = input.nextLine();

			System.out.println("What is the Total Mileage of your car?");
			CarMileage = input.nextInt();

			if (CarMileage < 10000) {
				System.out.println("You just need a change oil and check brakes");
				System.out.println("------------------------");
				System.out.println("Do you have another car? (yes or no)");
				Scanner carInput2 = new Scanner(System.in);
				String car2 = carInput2.next();

				if (car2.equals("yes")) {
					continue;
				} else {
					System.out.println("End of repair!!");
					break;
				}
			} else if (CarMileage < 20000) {
				System.out.println("Check Aux fan, radiator leak and battery");
				System.out.println("------------------------");
				System.out.println("Do you have another car? (yes or no)");
				Scanner carInput2 = new Scanner(System.in);
				String car2 = carInput2.next();

				if (car2.equals("yes")) {
					continue;
				} else {
					System.out.println("End of repair!!");
					break;
				}
			} else if (CarMileage < 50000) {
				System.out.println("Check Timing Belt and Suspension Parts");
				System.out.println("------------------------");
				System.out.println("Do you have another car? (yes or no)");
				Scanner carInput2 = new Scanner(System.in);
				String car2 = carInput2.next();

				if (car2.equals("yes")) {
					continue;
				} else {
					System.out.println("End of repair!!");
					break;
				}
			} else {
				System.out.println("Inspect Engine and if there's a big problem, top or general overhaul it");
				System.out.println("------------------------");
				System.out.println("Do you have another car? (yes or no)");
				Scanner carInput2 = new Scanner(System.in);
				String car2 = carInput2.next();

				if (car2.equals("yes")) {
					continue;
				} else {
					System.out.println("End of repair!!");
					break;

				}

			}

		}
	}
}