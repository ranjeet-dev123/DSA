# Searching Algorithms

This folder contains implementations of searching algorithms in C and Java.

## Algorithms

* Linear Search
* Binary Search

---

## 1. Linear Search

Linear Search checks each element one by one until the target element is found.

### Example

```text
Array:   [2, 3, 4, 10, 40]
Target:  10
Result:  Index 3
```

### Complexity

| Case         | Time Complexity |
| ------------ | --------------- |
| Best Case    | O(1)            |
| Average Case | O(n)            |
| Worst Case   | O(n)            |

Space Complexity: `O(1)`

---

## 2. Binary Search

Binary Search repeatedly divides a **sorted array** into two halves to find the target element.

### Example

```text
Array:   [2, 3, 4, 10, 40]
Target:  10
Result:  Index 3
```

### How It Works

For every iteration:

1. Find the middle element.
2. Compare the middle element with the target.
3. If both are equal, return the index.
4. If the middle element is smaller than the target, search the right half.
5. If the middle element is greater than the target, search the left half.
6. If the target is not present, return `-1`.

### Complexity

| Case         | Time Complexity |
| ------------ | --------------- |
| Best Case    | O(1)            |
| Average Case | O(log n)        |
| Worst Case   | O(log n)        |

Space Complexity: `O(1)`

### Important Condition

Binary Search works correctly only when the array is **sorted**.

---

## Languages

* C
* Java

## Learning Progress

* [x] Linear Search
* [x] Binary Search
* [ ] Bubble Sort
* [ ] Selection Sort
* [ ] Insertion Sort
* [ ] Linked List
* [ ] Stack
* [ ] Queue
* [ ] Tree
* [ ] Graph
