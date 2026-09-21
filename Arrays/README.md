# 📦 Arrays

<div align="center">

![Arrays](https://img.shields.io/badge/DSA-Arrays-blue?style=for-the-badge)
![C](https://img.shields.io/badge/C-Implementation-blue?style=for-the-badge\&logo=c)
![Java](https://img.shields.io/badge/Java-Implementation-orange?style=for-the-badge\&logo=openjdk)

</div>

## 📖 Introduction to Arrays

An **array is a linear data structure that stores multiple elements of the same data type in contiguous memory locations. Each element is accessed using an index.**

### Example

```text
Index:    0     1     2     3     4
        ┌─────┬─────┬─────┬─────┬─────┐
Array:  │ 10  │ 20  │ 30  │ 40  │ 50  │
        └─────┴─────┴─────┴─────┴─────┘
```

```text
arr[0] = 10
arr[1] = 20
arr[2] = 30
arr[3] = 40
arr[4] = 50
```

### Important Properties

* Linear data structure
* Stores elements of the same data type
* Elements are stored in contiguous memory
* Index generally starts from `0`
* Provides fast random access
* Array size is fixed in C and Java basic arrays

---

# 1️⃣ Array Traversal

### Definition

**Array traversal is the process of visiting each element of an array one by one.**

Example:

```text
10 → 20 → 30 → 40 → 50
```

### Complexity

| Operation | Time   |
| --------- | ------ |
| Traversal | `O(n)` |

📁 Programs:

* `Basics/traversal.c`
* `Basics/traversal.java`

---

# 2️⃣ Array Insertion

### Definition

**Array insertion is the process of adding a new element at a specific position in an array.**

Example:

```text
Before:

10  20  30  40

Insert 25 at index 2

After:

10  20  25  30  40
```

Elements may need to be shifted to create space.

### Complexity

| Position  | Time    |
| --------- | ------- |
| Beginning | `O(n)`  |
| Middle    | `O(n)`  |
| End       | `O(1)`* |

`*` When free space is available and no shifting is required.

📁 Programs:

* `Operations/insertion.c`
* `Operations/insertion.java`

---

# 3️⃣ Array Deletion

### Definition

**Array deletion is the process of removing an element from a specific position in an array.**

Example:

```text
Before:

10  20  30  40  50

Delete 30

After:

10  20  40  50
```

Elements after the deleted element are shifted to the left.

### Complexity

| Position  | Time    |
| --------- | ------- |
| Beginning | `O(n)`  |
| Middle    | `O(n)`  |
| End       | `O(1)`* |

📁 Programs:

* `Operations/deletion.c`
* `Operations/deletion.java`

---

# 4️⃣ Array Update

### Definition

**Array update means changing the value of an existing element at a particular index.**

Example:

```text
Before:

10  20  30  40

arr[2] = 35

After:

10  20  35  40
```

### Complexity

```text
Time: O(1)
```

📁 Programs:

* `Operations/update.c`
* `Operations/update.java`

---

# 5️⃣ Array Searching

### Definition

**Array searching is the process of finding whether a particular element exists in an array and determining its position if it exists.**

For an unsorted array, **Linear Search** can be used.

Example:

```text
Array:  10  20  30  40  50
                    ↑
                  Search 40
```

### Complexity

```text
Best Case:    O(1)
Worst Case:   O(n)
Average Case: O(n)
```

📁 Programs:

* `Searching/linear_search.c`
* `Searching/linear_search.java`

---

# 6️⃣ Array Rotation

### Definition

**Array rotation is the process of shifting array elements from one position to another while maintaining their relative order.**

### Left Rotation

```text
Before:

10  20  30  40  50

After left rotation by 1:

20  30  40  50  10
```

### Right Rotation

```text
Before:

10  20  30  40  50

After right rotation by 1:

50  10  20  30  40
```

📁 Programs:

* `Techniques/rotation.c`
* `Techniques/rotation.java`

---

# 7️⃣ Array Reversal

### Definition

**Array reversal is the process of arranging the elements of an array in the opposite order.**

Example:

```text
Before:

10  20  30  40  50

After:

50  40  30  20  10
```

### Complexity

```text
Time:  O(n)
Space: O(1)
```

📁 Programs:

* `Techniques/reversal.c`
* `Techniques/reversal.java`

---

# 8️⃣ Two Pointer Technique

### Definition

**The Two Pointer Technique uses two indices or pointers to process an array efficiently, usually from opposite ends or from different positions.**

Example:

```text
10  20  30  40  50
↑                 ↑
left             right
```

The pointers can move toward each other depending on the problem.

### Common Uses

* Reverse an array
* Pair sum
* Remove duplicates
* Sorted array problems

### Typical Complexity

```text
Time: O(n)
```

📁 Programs:

* `Techniques/two_pointer.c`
* `Techniques/two_pointer.java`

---

# 9️⃣ Prefix Sum

### Definition

**Prefix Sum is an array technique where each position stores the sum of all elements from the beginning of the array up to that position.**

Example:

```text
Original:

1   2   3   4   5

Prefix Sum:

1   3   6   10  15
```

Calculation:

```text
prefix[0] = 1
prefix[1] = 1 + 2 = 3
prefix[2] = 1 + 2 + 3 = 6
prefix[3] = 1 + 2 + 3 + 4 = 10
prefix[4] = 1 + 2 + 3 + 4 + 5 = 15
```

### Main Advantage

Prefix Sum helps answer range-sum queries efficiently.

### Complexity

Building Prefix Sum:

```text
O(n)
```

Range Sum Query:

```text
O(1)
```

📁 Programs:

* `Techniques/prefix_sum.c`
* `Techniques/prefix_sum.java`

---

# 🔟 Sliding Window

### Definition

**Sliding Window is a technique used to process a fixed or variable-size portion of an array while moving the window across the array.**

Example:

```text
Array:

1   2   3   4   5   6
┌─────────┐
│ 1  2  3 │
└─────────┘
    ↓ Move

1   2   3   4   5   6
    ┌─────────┐
    │ 2  3  4 │
    └─────────┘
```

Instead of calculating every window from scratch, we reuse the previous window's result.

### Common Uses

* Maximum sum subarray of size `k`
* Minimum sum window
* Longest subarray problems
* Substring problems

### Typical Complexity

```text
O(n)
```

📁 Programs:

* `Techniques/sliding_window.c`
* `Techniques/sliding_window.java`

---

# 🧪 Practice Problems

## 1. Find Maximum Element

**Definition:** Find the largest element present in an array.

```text
Example:

10  25  7  40  15

Maximum = 40
```

📁 `Practice/maximum.c`
📁 `Practice/maximum.java`

---

## 2. Find Minimum Element

**Definition:** Find the smallest element present in an array.

```text
10  25  7  40  15

Minimum = 7
```

---

## 3. Find Second Largest

**Definition:** Find the second largest distinct element in an array.

```text
10  40  20  50  30

Largest = 50
Second Largest = 40
```

---

## 4. Reverse an Array

```text
Before:

10  20  30  40

After:

40  30  20  10
```

---

## 5. Rotate an Array

Rotate an array left or right by a given number of positions.

---

## 6. Remove Duplicates

**Definition:** Remove repeated elements from an array while keeping the required unique elements.

Example:

```text
Before:

10  20  10  30  20

After:

10  20  30
```

---

## 7. Move Zeroes

**Definition:** Move all zero elements to the end while maintaining the relative order of non-zero elements.**

Example:

```text
Before:

0  1  0  3  12

After:

1  3  12  0  0
```

---

## 8. Merge Arrays

**Definition:** Combine the elements of two arrays into a single array.

Example:

```text
Array 1:

10  20  30

Array 2:

40  50  60

Merged:

10  20  30  40  50  60
```

---

# 📊 Array Complexity Summary

| Operation           | Time Complexity |
| ------------------- | --------------: |
| Access              |          `O(1)` |
| Update              |          `O(1)` |
| Traversal           |          `O(n)` |
| Search              |          `O(n)` |
| Insertion           |          `O(n)` |
| Deletion            |          `O(n)` |
| Reversal            |          `O(n)` |
| Prefix Sum Creation |          `O(n)` |

---

# 📌 Learning Progress

* [ ] Introduction to Arrays
* [ ] Array Traversal
* [ ] Array Insertion
* [ ] Array Deletion
* [ ] Array Update
* [ ] Array Searching
* [ ] Array Rotation
* [ ] Array Reversal
* [ ] Two Pointer Technique
* [ ] Prefix Sum
* [ ] Sliding Window

### Practice

* [ ] Find Maximum Element
* [ ] Find Minimum Element
* [ ] Find Second Largest
* [ ] Reverse an Array
* [ ] Rotate an Array
* [ ] Remove Duplicates
* [ ] Move Zeroes
* [ ] Merge Arrays

---

## 🎯 Goal

Build a strong understanding of arrays before moving to:

```text
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
Advanced DSA
```
