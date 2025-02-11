# Kotlin List Manipulation and Mutability Issues

This repository demonstrates common issues that can arise when manipulating lists in Kotlin, particularly related to mutability and immutability. The `bug.kt` file shows code that might lead to unexpected results. The `bugSolution.kt` file provides corrected and safer approaches to the same tasks. 

**Key Issues:**

* **Modifying a list while iterating:**  Modifying a list (e.g., using `remove` or `add`) while iterating over it can cause unexpected behavior (index out of bounds exceptions or skipping elements). 
* **Immutability vs. Mutability:**  Understanding the difference between immutable lists (`listOf`) and mutable lists (`mutableListOf`) is critical for writing correct and predictable code. 

**Solutions:**

The solution file shows how to avoid these problems using proper techniques such as creating a new list for modifications.