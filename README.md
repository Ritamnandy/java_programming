# Java Practice Programs

This repository contains a collection of small Java programs created while learning core programming concepts. The code is organized by practice days and topics, covering beginner syntax, input/output, conditionals, loops, arrays, recursion, pattern printing, simple object-oriented examples, and a console Tic-Tac-Toe game.

Most programs are standalone console applications. They do not use packages, so each file can be compiled and run directly from its own directory.

## Repository Structure

```text
.
├── Day_01/          Basic Java programs and introductory problem solving
├── Day_02/          Recursion and intermediate algorithm practice
├── Day_3/           Simple class, method, and varargs examples
├── Game/            Console game projects
├── Star_Patterns/   Nested-loop pattern printing programs
└── practice/        Mixed practice problems for Java fundamentals
```

## Topics Covered

- Java class structure and `main` methods
- Variables, data types, arithmetic, and operators
- Console input using `Scanner`
- Conditional statements and loops
- Arrays and basic array operations
- String comparison and palindrome checks
- Number programs such as prime, Fibonacci, odd/even, and leap year checks
- Binary, Roman numeral, and unit conversion exercises
- Recursive factorial, Fibonacci, multiplication, and sum examples
- Pattern printing with nested loops
- Basic inheritance and method organization
- Console game flow with Tic-Tac-Toe

## Folder Overview

### `Day_01`

Introductory programs for arithmetic, geometry, conversions, arrays, strings, and binary operations.

Examples include:

- `Circle.java`, `Rectangle.java`, `Hexagon.java`, `Polygon.java` - shape calculations
- `TempConvert.java`, `Converter.java`, `ConvertInchestoMeters.java` - conversion programs
- `Addarray.java`, `Swaparray.java`, `UniqueNumbers.java` - array practice
- `BinaryAddition.java`, `BinarySubtraction.java`, `BinaryMultiplication.java` - binary arithmetic
- `ReverseSentence.java`, `SumOfDigits.java`, `MultiplicationTable.java` - common beginner exercises

### `Day_02`

Programs focused on recursion and more involved logic.

Examples include:

- `Factorial.java` - recursive factorial calculation
- `RecursiveSum.java` - recursive sum calculation
- `FibonacciCalculator.java` - Fibonacci using recursion
- `Multiply.java` - multiplication practice
- `MagicSquare.java` - magic square generation
- `RomanConversion.java` - Roman numeral conversion

### `Day_3`

Short programs for class basics, simple output, arithmetic methods, and varargs.

Examples include:

- `hello.java` - basic hello world style output
- `World.java` - simple class and output practice
- `sum.java` - arithmetic practice
- `sub.java` - varargs method that adds multiple numbers

### `Star_Patterns`

Pattern printing programs that practice nested loops and formatting.

Examples include:

- `LeftTrianglePrint.java`
- `RightTrianglePrint.java`
- `Downtriangle.java`
- `PyramidPrint.java`
- `DiamondStar.java`
- `DiamondShapePrint.java`
- `TriangleStar.java`
- `PascalTriangle.java`

### `practice`

A mixed set of Java exercises for daily practice and concept revision.

Examples include:

- `Primecheck.java`, `Printprime.java` - prime number programs
- `Fibonacci.java`, `Findfibonacci.java` - Fibonacci practice
- `Oddeven.java`, `Leapyear.java` - conditional logic programs
- `Array.java`, `Array_avg.java`, `Rotated.java`, `Findnum.java` - array programs
- `Palindrome.java`, `Comparestring.java`, `JavaString.java` - string programs
- `Binary.java`, `Ascii.java`, `Datatypes.java` - basic data representation programs
- `Calculator.java`, `Compound_Interest.java`, `Swap.java`, `Add.java` - methods and simple class examples

### `Game`

Contains a console-based game project.

- `TicTacToe.java` - two-player Tic-Tac-Toe with board display, turn handling, win checking, draw checking, and user input.

## Clone Repository

Clone this repository to your local machine:

```bash
git clone https://github.com/Ritamnandy/java_programming.git
cd java_programming
```

## How to Run

Make sure the Java Development Kit is installed:

```bash
java -version
javac -version
```

Compile and run any program from its folder:

```bash
cd Day_01
javac Circle.java
java Circle
```

Run the Tic-Tac-Toe game:

```bash
cd Game
javac TicTacToe.java
java TicTacToe
```

Run a pattern program:

```bash
cd Star_Patterns
javac PyramidPrint.java
java PyramidPrint
```

Because the programs are not organized into Java packages, run them from the folder where the `.java` file is located.

## Suggested Learning Order

1. Start with `Day_3/` and simple files in `practice/` to understand basic class structure and output.
2. Move to `Day_01/` for input, arithmetic, conversions, arrays, and strings.
3. Practice loops using `Star_Patterns/`.
4. Study `Day_02/` for recursion and intermediate algorithms.
5. Finish with `Game/TicTacToe.java` to see multiple concepts combined in one program.

## Notes

- The repository is intended for Java learning and practice, not as a single production application.
- Most files are independent programs with their own `main` method.
- Some files require user input from the terminal.
- Compiled `.class` files may appear after running `javac`; they can be regenerated at any time from the source files.

## Future Improvements

- Add comments or JavaDoc to explain each program.
- Add sample input/output examples for selected exercises.
- Group related programs into Java packages.
- Add tests for algorithms such as Fibonacci, prime checking, and conversions.
- Add more games or data structure examples.
