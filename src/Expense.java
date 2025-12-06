public class Expense {
    private int id;
    private String category;
    private double amount;
    private String date;
    private String note;

    public Expense(int id, String category, double amount, String date, String note) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    public int getId() { return id; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDate() { return date; }
    public String getNote() { return note; }

    public void setCategory(String category) { this.category = category; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDate(String date) { this.date = date; }
    public void setNote(String note) { this.note = note; }

    public String toCSV() {
        return id + "," + category + "," + amount + "," + date + "," + note;
    }

    public static Expense fromCSV(String line) {
        String[] p = line.split(",");
        return new Expense(
                Integer.parseInt(p[0]),
                p[1],
                Double.parseDouble(p[2]),
                p[3],
                p[4]
        );
    }
}
