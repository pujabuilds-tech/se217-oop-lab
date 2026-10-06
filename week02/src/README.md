# SE 217 - Object Oriented Programming Lab

**Name:** Puja Karmoker
**ID:** 252-35-336
**Section:** F2

## Description

This repository contains my beginner-level Java practice programs for the course **SE 217 - Object Oriented Programming Lab**. Week 02 covers output, variables, operators, input, decisions, loops, patterns, arrays, strings and methods. Every program is plain Java (no packages, no external libraries) and works with Java 11 or newer. Each file has 3 to 5 small examples with short comments.

## Project Structure

```
.
├── README.md
├── .gitignore
└── week02
    └── src
        ├── HelloOutput.java
        ├── VariablesAndTypes.java
        ├── PrimitiveRanges.java
        ├── OperatorPractice.java
        ├── ReadFromKeyboard.java
        ├── IfElseCheck.java
        ├── GradeCalculator.java
        ├── SwitchMenu.java
        ├── ForLoopPractice.java
        ├── WhileLoopPractice.java
        ├── DoWhilePractice.java
        ├── StarPatterns.java
        ├── ArrayOperations.java
        ├── MatrixPractice.java
        ├── StringOperations.java
        ├── SplitAndTokens.java
        ├── MethodBasics.java
        ├── MethodOverloading.java
        └── MethodTasks.java
```

## How to Compile and Run

Open a terminal in the repository folder, then:

```
cd week02/src
javac *.java
java HelloOutput
```

Replace `HelloOutput` with any other class name (for example `java GradeCalculator`).

To keep the `.class` files in a separate folder (ignored by Git):

```
cd week02/src
javac -d ../out *.java
java -cp ../out HelloOutput
```

Programs that read input (`ReadFromKeyboard`, `IfElseCheck`, `GradeCalculator`, `SwitchMenu`, `DoWhilePractice`) will print a prompt before each question. Type your answer and press Enter.
