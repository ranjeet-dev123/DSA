# 💻 Programming Fundamentals

<div align="center">

![Programming](https://img.shields.io/badge/Programming-Fundamentals-blue?style=for-the-badge)
![C](https://img.shields.io/badge/C-Programming-blue?style=for-the-badge\&logo=c)
![Java](https://img.shields.io/badge/Java-Programming-orange?style=for-the-badge\&logo=openjdk)

</div>

This section covers the **programming fundamentals** required before moving deeper into Data Structures and Algorithms.

The concepts are implemented using **C and Java** wherever applicable.

---

## 📚 Topics

| #  | Topic                     | C | Java | Status    |
| -- | ------------------------- | - | ---- | --------- |
| 1  | Variables and Data Types  | ✅ | ✅    | Completed |
| 2  | Input / Output            | ✅ | ✅    | Completed |
| 3  | Operators                 | ✅ | ✅    | Completed |
| 4  | Conditional Statements    | ✅ | ✅    | Completed |
| 5  | Loops                     | ✅ | ✅    | Completed |
| 6  | Functions                 | ✅ | ✅    | Completed |
| 7  | Recursion                 | ✅ | ✅    | Completed |
| 8  | Pointers                  | ✅ | —    | Completed |
| 9  | Structures                | ✅ | —    | Completed |
| 10 | Dynamic Memory Allocation | ✅ | —    | Completed |

---

## 1️⃣ Variables and Data Types

Variables are named memory locations used to store data.

### Common Data Types

* `int` – Integer values
* `float` – Decimal values
* `double` – Higher precision decimal values
* `char` – Single character
* `boolean` – `true` or `false` in Java

**Programs:**

* `Variables_DataTypes/variables.c`
* `Variables_DataTypes/variables.java`

---

## 2️⃣ Input / Output

Input allows a program to receive data from the user, while output displays information.

### C

Uses:

```c
scanf()
printf()
```

### Java

Uses:

```java
Scanner
System.out.println()
```

**Programs:**

* `Input_Output/input_output.c`
* `Input_Output/input_output.java`

---

## 3️⃣ Operators

Operators are symbols used to perform operations on values.

### Types

* Arithmetic Operators
* Relational Operators
* Logical Operators
* Assignment Operators
* Increment / Decrement Operators
* Conditional Operator

**Programs:**

* `Operators/operators.c`
* `Operators/operators.java`

---

## 4️⃣ Conditional Statements

Conditional statements execute different blocks of code depending on a condition.

### Types

* `if`
* `if-else`
* `else-if`
* Nested `if`
* `switch`

**Programs:**

* `Conditional_Statements/conditional.c`
* `Conditional_Statements/conditional.java`

---

## 5️⃣ Loops

Loops are used to repeatedly execute a block of code.

### Types

* `for`
* `while`
* `do-while`

**Programs:**

* `Loops/loops.c`
* `Loops/loops.java`

---

## 6️⃣ Functions

A function is a reusable block of code designed to perform a specific task.

Functions help with:

* Code reusability
* Modularity
* Better program organization
* Easier debugging

**Programs:**

* `Functions/functions.c`
* `Functions/functions.java`

---

## 7️⃣ Recursion

Recursion is a technique where a function calls itself to solve a smaller version of the same problem.

A recursive function generally contains:

1. **Base Case**
2. **Recursive Case**

Example problems:

* Factorial
* Fibonacci
* Sum of numbers

**Programs:**

* `Recursion/recursion.c`
* `Recursion/recursion.java`

---

## 8️⃣ Pointers

A pointer is a variable that stores the **memory address of another variable**.

Pointers are important in C for:

* Dynamic memory allocation
* Arrays
* Linked Lists
* Trees
* Graphs
* Passing addresses to functions

**Program:**

* `Pointers/pointers.c`

> Java does not provide direct pointer manipulation like C.

---

## 9️⃣ Structures

A structure in C is a user-defined data type that groups different types of data under one name.

Example:

```c
struct Student {
    int id;
    char name[50];
    float marks;
};
```

Structures are useful for representing records and are important for understanding data structures.

**Program:**

* `Structures/structures.c`

---

## 🔟 Dynamic Memory Allocation

Dynamic memory allocation allows memory to be allocated during program execution.

### Important C Functions

* `malloc()`
* `calloc()`
* `realloc()`
* `free()`

Dynamic memory is especially important for implementing:

* Linked Lists
* Stacks
* Queues
* Trees
* Graphs

**Program:**

* `Dynamic_Memory_Allocation/dynamic_memory.c`

---

## 🎯 Learning Goal

The purpose of this section is to build a strong programming foundation before implementing advanced Data Structures and Algorithms.

### Learning Flow

```text
Programming Fundamentals
          ↓
       Arrays
          ↓
      Searching
          ↓
       Sorting
          ↓
     Linked List
          ↓
        Stack
          ↓
        Queue
          ↓
       Recursion
          ↓
       Hashing
          ↓
        Trees
          ↓
         Heap
          ↓
        Graphs
          ↓
     Advanced DSA
```

---

## 🛠️ Languages

* C
* Java

## 📌 Status

**Programming Fundamentals: Completed ✅**

Next: **Arrays → Searching → Sorting → Linked List → Stack → Queue**
