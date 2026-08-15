# 🎓 Student Grade Calculator

A simple **Student Grade Calculator** developed in Java. The program takes marks for **English, Urdu, and Computer**, calculates the student's total marks and percentage, and then determines the corresponding grade.

## 🚀 Features

- Takes marks for 3 subjects.
- Calculates total obtained marks.
- Calculates the overall percentage.
- Assigns a grade based on the percentage.
- Validates marks to ensure they are within the allowed range.
- Displays an invalid input message when marks are outside the valid range.

## 🛠️ Technologies Used

- **Java**
- `Scanner`
- Variables and data types
- Conditional statements (`if-else`)
- Arithmetic operations
- User input

## 📂 Project Structure

```text
Student-Grade-Calculator/
│
├── Main.java
└── README.md
```

## 📊 Subjects

The calculator uses the following subjects:

| Subject | Maximum Marks |
|---|---:|
| English | 100 |
| Urdu | 100 |
| Computer | 100 |
| **Total** | **300** |

## 📝 Grading Criteria

| Percentage | Grade |
|---:|:---|
| 90% and above | A+ |
| 80% – 89% | A |
| 70% – 79% | B |
| 60% – 69% | C |
| 50% – 59% | D |
| Below 50% | Fail |

## ▶️ How to Run

### 1. Open the Project

Open the project in a Java-supported IDE such as:

- IntelliJ IDEA
- Eclipse
- VS Code
- NetBeans

### 2. Compile the Program

```bash
javac Main.java
```

### 3. Run the Program

```bash
java Main
```

## 🎮 Example Output

```text
--- Student Grade Calculator ---

Enter Obtained Marks of English (out of 100):
85

Enter Obtained Marks of Urdu (out of 100):
78

Enter Obtained Marks of Computer (out of 100):
92

Your obtained marks : 255/300
Your percentage: 85.0%

-- Your grade is A --
```

## ⚠️ Input Validation

The program checks that each subject's marks are within the valid range.

Valid marks:

```text
1 - 100
```

If the user enters a value outside this range, the program displays:

```text
--- Invalid Number Input ---
```

## 📚 Learning Objectives

This project demonstrates the following Java concepts:

- Taking user input using `Scanner`
- Declaring and using variables
- Integer and floating-point calculations
- Arithmetic operators
- `if-else if-else` statements
- Input validation
- Percentage calculation
- Basic grading logic

## 🔮 Future Improvements

Possible improvements for future versions:

- Add more subjects.
- Add student name and roll number.
- Calculate individual subject grades.
- Handle non-numeric input using exception handling.
- Add a menu-based interface.
- Add multiple student records.
- Store student results in a file or database.

## 👨‍💻 Project Information

**Project:** Student Grade Calculator  
**Language:** Java  
**Type:** Console Application