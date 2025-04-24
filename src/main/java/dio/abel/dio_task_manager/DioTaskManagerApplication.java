package dio.abel.dio_task_manager;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DioTaskManagerApplication {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Board Task Manager");
			System.out.println("1. Create New Board");
			System.out.println("2. Select Board");
			System.out.println("3. Delete Board");
			System.out.println("4. Log Out");
			System.out.println("Your Alternative?");
			String alternative = scanner.nextLine();

			if (!alternative.matches("^[0-9]+$"))
				continue;

			int choice = Integer.parseInt(alternative);

			switch (choice) {
				case 1: {
					System.out.println("Creating New Board");
					break;
				}
				case 2: {
					System.out.println("Selecting Board");
					break;
				}
				case 3: {
					System.out.println("Deleting Board");
					break;
				}
				case 4: {
					System.out.println("Log outing...");
					return;
				}
				default:
					System.out.println("Invalid alternative");
			}
		}
	}

}
