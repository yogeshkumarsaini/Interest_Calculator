# 💰 Interest Calculator 

A **menu-driven Java application** to calculate **Simple Interest** and **Compound Interest** using a **pure Object-Oriented Programming (OOP)** approach.  
The project supports **monthly, quarterly, and yearly compounding** and stores all calculations in a **history list**.

---

## 🚀 Features

- ✅ Simple Interest calculation  
- ✅ Compound Interest calculation  
  - Monthly compounding  
  - Quarterly compounding  
  - Yearly compounding  
- 📜 Stores calculation history using `List`
- 🧱 Pure OOP design (separate classes)
- ⚠️ Custom exception handling
- 📊 Menu-driven console interface
- 🧪 Beginner-friendly & interview-ready

---

## 🧮 Formulas Used

### Simple Interest
```
SI = (P × R × T) / 100
```

### Compound Interest
```
CI = P × (1 + R / (100 × N))^(N × T) − P
```

Where:
- `P` = Principal amount  
- `R` = Rate of interest  
- `T` = Time (in years)  
- `N` = Compounding frequency  
  - Monthly → 12  
  - Quarterly → 4  
  - Yearly → 1  

---

## 📁 Project Structure

```
interestcalculator/
│
├── InterestCalculator.java // Main class (UI & menu)
├── InterestService.java // Business logic & calculations
├── InterestRecord.java // Model class (history records)
├── InvalidInputException.java // Custom exception
```

---

## 🧠 Concepts Used

- Object-Oriented Programming (OOP)
- Encapsulation
- Custom Exceptions
- Lists (`ArrayList`)
- Menu-driven programs
- `Math.pow()` for calculations
- Exception handling (`try-catch`)
- Clean code & separation of concerns

---

## ▶️ How to Run

1. Clone the repository
   ```bash
   git clone https://github.com/yogeshkumarsaini/interest-calculator-java.git
2. Navigate to the project folder
   ```bash
   cd interest-calculator-java
3. Compile the files
   ```bash
   javac *.java
4. Run the application
   ```bash
   java InterestCalculator
   
---

## 📜 Sample Menu

```markdown
📊 Interest Calculator
1. Simple Interest
2. Compound Interest
3. View History
4. Exit
```
