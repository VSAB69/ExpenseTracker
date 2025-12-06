import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    System.out.print("Enter note: ");
                    String note = sc.nextLine();

                    manager.addExpense(cat, amt, date, note);
                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    manager.deleteExpense(id);
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n=========== EXPENSE TRACKER ===========");
        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. Delete Expense");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
    }
}
