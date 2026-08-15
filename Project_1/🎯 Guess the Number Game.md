# 🎯 Guess the Number Game

A simple **Guess the Number Game** developed in Java as **Project 1** for the DecodeLabs Java Internship.

The program generates a random number between **1 and 100** and asks the user to guess it. After each guess, the program provides a hint indicating whether the guessed number is larger or smaller than the generated number.

## 🚀 Features

- Generates a random number between 1 and 100.
- Takes user input using `Scanner`.
- Provides hints after each incorrect guess.
- Displays a success message when the correct number is guessed.
- Handles invalid input using `InputMismatchException`.
- Displays the randomly generated number after the game ends.

## 🛠️ Technologies Used

- **Java**
- `Scanner`
- `Math.random()`
- `InputMismatchException`
- Loops
- Conditional statements
- Exception handling

## 📂 Project Structure

```text
DecodeLabs_Java_P1/
│
├── DecodeLabs_Java_P1.java
└── README.md
```

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone <your-github-repository-url>
```

### 2. Open the Project

Open the project in any Java-supported IDE, such as:

- IntelliJ IDEA
- Eclipse
- VS Code
- NetBeans

### 3. Compile the Program

```bash
javac DecodeLabs_Java_P1.java
```

### 4. Run the Program

```bash
java DecodeLabs_Java_P1
```

## 🎮 How to Play

1. The program generates a random number between **1 and 100**.
2. Enter your guess when prompted.
3. The program will tell you whether your guess is:
   - **LARGER** than the generated number
   - **SMALLER** than the generated number
4. Continue guessing until you find the correct number.
5. When the correct number is guessed, the program displays a success message.

### Example

```text
Guess my number (1-100):
50
Your number is SMALLER than mine

Guess my number (1-100):
75
Your number is LARGER than mine

Guess my number (1-100):
63
WOOHOOO... Correct!

My number was: 63
```

## ⚠️ Invalid Input Handling

The program uses `InputMismatchException` to handle invalid input.

For example, if the user enters text instead of a number:

```text
Guess my number (1-100):
hello

--- Invalid Number Entered ---
```

## 📚 Learning Objectives

This project demonstrates basic Java programming concepts, including:

- Variables and data types
- `Scanner` for user input
- `Math.random()` for generating random numbers
- `if-else` conditions
- `do-while` loops
- Exception handling
- Basic problem-solving and program logic

## 👨‍💻 Internship Project

**Program:** DecodeLabs Java Internship  
**Project:** Project 1 – Guess the Number Game  
**Language:** Java

## 📌 Future Improvements

Possible improvements for future versions:

- Add a limited number of attempts.
- Add difficulty levels.
- Add a score system.
- Allow the user to play multiple rounds.
- Add a restart option.
- Display the number of attempts used.