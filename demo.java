import java.util.*;

class Employee {
	String name;
	int id;
	int age;
	int salary;
	String desig;

	Employee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the id");
		id = sc.nextInt();
		System.out.println("Enter the age");
		age = sc.nextInt();
	}

	public void display() {
		System.out.println("The name is:" + name);
		System.out.println("The id is:" + id);
		System.out.println("The age is:" + age);
		System.out.println("The salary is:" + salary);
		System.out.println("The desig is:" + desig);
	}
}

class Developer extends Employee {
	Developer() {

		salary = 50000;
		desig = "Developer";
	}
}

class Manager extends Employee {
	Manager() {
		salary = 40000;
		desig = "Manager";
	}
}

class Demo {
	public static void main(String args[]) {
		Developer d = null;
		Manager m = null;
		do {

			System.out.println("1)Create");
			System.out.println("2)Display");
			System.out.println("3)Raise Salary");
			System.out.println("4)Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the choice");
			int ch = sc.nextInt();

			if (ch == 1) {

				System.out.println("1)Developer");
				System.out.println("2)Manager");
				int choice = sc.nextInt();
				if (choice == 1) {
					d = new Developer();
					// d.display();
				} else {
					m = new Manager();

				}

			} else if (ch == 2) {
				System.out.println("1) Print the Developer");
				System.out.println("2)Print the Manager");
				int choice = sc.nextInt();
				if (choice == 1) {
					d.display();
				} else {
					m.display();

				}
			} else if (ch == 3) {
				System.out.println("1)Raize the salary of Developer");
				System.out.println("2)Raize the salary of Manager");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("The salary of developer previously" + d.salary);
					d.salary = (5 * d.salary / 100) + d.salary;
					d.display();
				} else {
					System.out.println("The salary of Manager previously" + m.salary);
					m.salary = (2 * m.salary / 100) + m.salary;
					m.display();
				}
			} else if (ch == 4) {
				System.exit(0);
			}
		} while (true);
	}
}
