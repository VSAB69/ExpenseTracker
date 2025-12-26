# 📘 Expense Tracker (Java, OOP, CSV Storage)

A simple but complete **console-based Expense Tracker** built using **Object-Oriented Programming in Java**.
This project demonstrates Java fundamentals such as **classes, objects, encapsulation, file handling, collections, and clean architecture**.
All expenses are stored locally in a **CSV file** for easy readability and persistence.

---

## 🚀 Features

* ➕ Add a new expense (category, amount, date, note)
* 📋 View all expenses in a formatted table
* ❌ Delete expense by ID
* 💾 Persistent CSV-based storage
* 🎯 Designed using clean OOP principles
* 🛠️ Easy to run in IntelliJ IDEA or any Java IDE

---

## 📁 Project Structure

```
ExpenseTracker/
 ├── src/
 │    ├── Expense.java
 │    ├── ExpenseManager.java
 │    └── Main.java
 ├── expenses.csv  (auto-generated on first run)
 └── README.md
```

---

## 🧱 Class Overview

### **Expense**

Represents a single expense item.
Fields: `id`, `category`, `amount`, `date`, `note`
Also contains CSV serialization/deserialization logic.

### **ExpenseManager**

Handles all business logic:

* Adding expenses
* Viewing expenses
* Deleting expenses
* Loading/saving CSV

### **Main**

Entry point containing menu and input handling.

---

## 🛠️ Prerequisites

Before running the project, ensure you have:

* **Java 17+** installed
* **IntelliJ IDEA (Community or Ultimate)**
* Git (optional, for version control)

---

## 📦 How to Setup & Run the Project in IntelliJ

### **1️⃣ Clone the Repository**

Open Git Bash or terminal:

```bash
git clone https://github.com/VSAB69/ExpenseTracker.git
cd ExpenseTracker
```

---

### **2️⃣ Open in IntelliJ**

* Open IntelliJ IDEA
* Click **File → Open**
* Select the **ExpenseTracker** folder
* IntelliJ will automatically detect it as a Java project

---

### **3️⃣ Configure Project SDK**

Inside IntelliJ:

```
File → Project Structure → Project
```

* Select **SDK: Java 17** or above
* Apply → OK

---

### **4️⃣ Run the Application**

Inside IntelliJ:

* Open `Main.java`
* Click **Run ▶**

OR use shortcut:

```
Shift + F10
```

On first run, `expenses.csv` will be automatically created.

---

## 🖥️ Program Menu (Console UI)

You will see:

```
=========== EXPENSE TRACKER ===========
1. Add Expense
2. View All Expenses
3. Delete Expense
4. Exit
Enter choice:
```

---

## 💾 CSV Storage Format

The CSV file (`expenses.csv`) stores data like:

```
1,Food,120.5,05-12-2025,Lunch with friend
2,Travel,50,05-12-2025,Auto fare
```

You can open it in Excel, Notepad, or any spreadsheet tool.

---

## 🧪 Sample Run

```
=========== EXPENSE TRACKER ===========
1. Add Expense
2. View All Expenses
3. Delete Expense
4. Exit
Enter choice: 1

Enter category: Food
Enter amount: 120.50
Enter date (DD-MM-YYYY): 05-12-2025
Enter note: Lunch with friend

Expense added successfully!
```

---

## 🧹 Future Enhancements 

The project can be extended with:

* Category-wise total spending
* Monthly reports
* Sorting & searching
* Data export to JSON or XML
* JavaFX GUI front-end
* User login system
* Chart visualization


---


