import java.io.*;
import java.util.*;

public class ExpenseManager {

    private List<Expense> expenses = new ArrayList<>();
    private final String filePath = "expenses.csv";

    public ExpenseManager() {
        loadFromCSV();
    }

    public void addExpense(String category, double amount, String date, String note) {
        int id = expenses.size() == 0 ? 1 : expenses.get(expenses.size() - 1).getId() + 1;
        Expense e = new Expense(id, category, amount, date, note);
        expenses.add(e);
        saveToCSV();
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("\nNo expenses recorded.\n");
            return;
        }

        System.out.println("\n------------------- Expense List -------------------");
        System.out.printf("%-5s %-12s %-10s %-12s %-20s\n", "ID", "Category", "Amount", "Date", "Note");
        System.out.println("-----------------------------------------------------");

        for (Expense e : expenses) {
            System.out.printf("%-5d %-12s %-10.2f %-12s %-20s\n",
                    e.getId(), e.getCategory(), e.getAmount(), e.getDate(), e.getNote());
        }

        System.out.println("-----------------------------------------------------\n");
    }

    public void deleteExpense(int id) {
        boolean removed = expenses.removeIf(e -> e.getId() == id);
        if (removed) {
            saveToCSV();
            System.out.println("Expense deleted successfully!");
        } else {
            System.out.println("No expense found with that ID.");
        }
    }

    public void loadFromCSV() {
        File file = new File(filePath);

        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                expenses.add(Expense.fromCSV(line));
            }

        } catch (IOException e) {
            System.out.println("Error loading CSV: " + e.getMessage());
        }
    }

    public void saveToCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Expense e : expenses) {
                bw.write(e.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving CSV: " + e.getMessage());
        }
    }
}
