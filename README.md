# Java Programming Practice Repository

A comprehensive collection of Java programs demonstrating fundamental programming concepts, algorithms, problem-solving techniques, and game development. This repository tracks a structured learning progression from basic syntax through recursion and practical applications.

---

## 📁 Directory Structure

### **Day_01** — Core Fundamentals
Essential Java concepts and basic algorithms covering:
- **Geometry**: Area and perimeter calculations for shapes (Circle, Rectangle, Hexagon, Polygon)
- **Conversions**: Temperature conversion (Fahrenheit ↔ Celsius), unit conversions (inches to meters)
- **Array Operations**: Addition, swapping, and manipulation of array elements
- **String Manipulation**: Sentence reversal and string processing
- **Number Theory**: Sum of digits, divisibility checks, binary operations (addition, subtraction, multiplication)
- **Arithmetic**: Multiplication tables generation

**Key Files**: `Circle.java`, `Rectangle.java`, `TempConvert.java`, `Addarray.java`, `ReverseSentence.java`

---

### **Day_02** — Recursion & Advanced Algorithms
Intermediate-level problems focusing on recursive thinking and complex algorithms:
- **Recursion Fundamentals**: Factorial and recursive sum calculations
- **Number Sequences**: Fibonacci sequence generation using recursion
- **Puzzle Algorithms**: Magic square construction and validation
- **String Processing**: Roman numeral conversion
- **Multiplication Techniques**: Advanced multiplication algorithms

**Key Files**: `Factorial.java`, `FibonacciCalculator.java`, `MagicSquare.java`, `RomanConversion.java`

---

### **Day_3** — Introductory Programs
Basic introductory programs marking the beginning of the learning journey.

**Key Files**: `hello.java` (Hello World program)

---

### **Game** — Application Development
Interactive game implementation showcasing integration of multiple programming concepts:

**Tic-Tac-Toe (`TicTacToe.java`)**
- Two-player game with a 3×3 board
- Win/draw detection algorithm
- Turn-based game loop
- User input validation and menu-driven interface
- Board state management and display

---

### **practice** — Algorithm & Problem-Solving Practice
Diverse collection of practice problems covering various programming concepts:

#### Number Algorithms
- Prime number checking (`Primecheck.java`)
- Fibonacci sequence (iterative approach) (`Fibonacci.java`, `Findfibonacci.java`)
- Odd/even classification (`Oddeven.java`)

#### String Operations
- Palindrome detection (`Palindrome.java`)
- String comparison (`Comparestring.java`)
- ASCII operations (`Ascii.java`)

#### Data Structures & Arrays
- Array averaging (`Array_avg.java`)
- Array manipulation (`Array.java`)
- Rotated array operations (`Rotated.java`)

#### Mathematical Concepts
- Leap year detection (`Leapyear.java`)
- Compound interest calculations (`Compound_Interest.java`)
- Binary conversion (`Binary.java`)

#### Object-Oriented Programming
- **Calculator** (`Calculator.java`) — Demonstrates inheritance and method organization
- **Basic Operations** (`Add.java`, `Swap.java`)

---

### **Star_Patterns** — Pattern Printing & Nested Loop Mastery
Programs demonstrating nested loop control and algorithmic pattern generation:

- **Triangle Patterns**: Left-aligned (`LeftTrianglePrint.java`), right-aligned (`RightTrianglePrint.java`), inverted (`Downtriangle.java`)
- **Diamond Patterns**: Multiple implementations (`DiamondShapePrint.java`, `DiamondStar.java`)
- **Complex Patterns**: Triangle with special formatting (`TriangleStar.java`), Pascal's triangle (`PascalTriangle.java`)
- **Pyramid**: Standard pyramid pattern (`PyramidPrint.java`)

---

## 🎯 Learning Progression

This repository demonstrates a structured learning path:

### **Phase 1: Fundamentals (Day_01 & practice basics)**
- Variables, data types, and basic operations
- Loops (for, while) and conditionals
- Arrays and array operations
- String manipulation
- Method creation and organization

### **Phase 2: Intermediate Concepts (practice & Day_02)**
- Object-Oriented Programming (classes, inheritance)
- Nested loops and pattern generation
- Complex algorithms (prime checking, palindromes)
- Mathematical computations

### **Phase 3: Advanced Topics (Day_02 & Game)**
- Recursion and recursive problem-solving
- Game logic and state management
- Integration of multiple concepts
- User interaction and input handling

### **Phase 4: Applied Development (Game)**
- Complete application development (Tic-Tac-Toe)
- Game loop design
- Win/loss/draw scenarios
- Turn-based logic

---

## 🚀 Quick Start

### **Prerequisites**
- Java Development Kit (JDK) 8 or higher
- Command line terminal or IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

### **Compiling Programs**
To compile a Java program:
```bash
cd "path/to/directory"
javac ProgramName.java
```

### **Running Programs**
To run a compiled Java program:
```bash
java ProgramName
```

### **Example: Running Tic-Tac-Toe**
```bash
cd Game
javac TicTacToe.java
java TicTacToe
```

### **Example: Running Pattern Programs**
```bash
cd Star_Patterns
javac PyramidPrint.java
java PyramidPrint
```

---

## 📚 Key Concepts Covered

| Concept | Difficulty | Location |
|---------|-----------|----------|
| Variables & Data Types | Beginner | `practice/Datatypes.java` |
| Arrays | Beginner | `Day_01/Addarray.java`, `practice/Array.java` |
| Loops & Patterns | Beginner-Intermediate | `Star_Patterns/` |
| String Manipulation | Beginner | `Day_01/ReverseSentence.java` |
| Object-Oriented Programming | Intermediate | `practice/Calculator.java` |
| Recursion | Intermediate | `Day_02/Factorial.java`, `Day_02/FibonacciCalculator.java` |
| Game Logic | Intermediate-Advanced | `Game/TicTacToe.java` |
| Mathematical Algorithms | Intermediate | `Day_02/MagicSquare.java`, `practice/Primecheck.java` |

---

## 📝 Notable Programs

### **Tic-Tac-Toe** (`Game/TicTacToe.java`)
A fully functional two-player game demonstrating:
- 2D array usage for board representation
- Win condition detection algorithms
- User input validation
- Game state management
- Console-based UI

### **Magic Square** (`Day_02/MagicSquare.java`)
Generates magic squares showcasing:
- Advanced array manipulation
- Mathematical pattern recognition
- Algorithm design and optimization

### **Fibonacci with Multiple Implementations** (`Day_02/FibonacciCalculator.java`, `practice/Fibonacci.java`)
Compares different approaches:
- Recursive implementation (elegant but potentially inefficient)
- Iterative implementation (efficient for large values)
- Educational value: Performance and algorithm comparison

### **Calculator** (`practice/Calculator.java`)
Demonstrates Object-Oriented Programming:
- Class design and inheritance
- Method organization
- State management

---

## 🔄 Learning Insights

1. **Progression from Procedural to Object-Oriented**: Early programs use procedural approaches, while later programs incorporate classes and methods.

2. **Multiple Implementations**: Fibonacci appears in different contexts (recursive, iterative, problem-finding), showing deliberate practice and comparison of approaches.

3. **Nested Loop Mastery**: The `Star_Patterns` directory systematically builds pattern-printing skills, essential for understanding algorithm complexity.

4. **Integration of Concepts**: The Tic-Tac-Toe game is a culmination of multiple learned concepts (arrays, loops, conditionals, user input, logic).

5. **Mathematical Problem-Solving**: Strong emphasis on number theory, geometry, and algorithms throughout the repository.

---

## 💡 How to Extend This Repository

- **Add more games**: Extend Game folder with other games (Snake, Hangman, etc.)
- **Advanced algorithms**: Add sorting algorithms, searching techniques, data structure implementations
- **Unit testing**: Create test classes to validate program correctness
- **Documentation**: Add JavaDoc comments to existing code
- **File I/O**: Create programs that read/write data to files
- **GUI applications**: Migrate console programs to graphical interfaces using Swing or JavaFX

---

## 📖 Recommended Study Order

For optimal learning, study in this order:

1. **Start**: `Day_01/` — Understand fundamentals
2. **Continue**: `practice/` — Apply concepts with diverse problems
3. **Next**: `Star_Patterns/` — Master nested loops and pattern generation
4. **Then**: `Day_02/` — Learn recursion and advanced algorithms
5. **Finally**: `Game/TicTacToe.java` — See concepts applied in a complete application

---

## 🛠️ Development Tools

This codebase can be developed and run using:
- **Command Line**: `javac` and `java`
- **VS Code**: With Java Extensions
- **IntelliJ IDEA**: Community Edition
- **Eclipse**: IDE
- **NetBeans**: Oracle's IDE
- **Online Editors**: JDoodle, Replit, OnlineGDB

---

## 📄 License

This is a personal learning repository. Feel free to use, modify, and learn from these programs.

---

## ✨ Summary

This repository represents a comprehensive journey through Java programming fundamentals and applied concepts. From basic arithmetic operations to complete game development, each program builds upon previously learned skills. The diverse collection of examples makes it an excellent resource for understanding core programming principles and their practical applications.

**Happy coding and learning! 🎉**
