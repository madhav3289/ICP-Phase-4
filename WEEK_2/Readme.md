# Week 2 — Stacks

## Topics Covered
- Stack Basics: push/pop/peek, array implementation
- Monotonic Stacks: next greater/smaller element, spans
- Stack-Based Parsing: parentheses validation, removal, backspace compare

## Structure
- Stack_Basic_Problem/: introductory stack problems
- Stack_Intermediate_Problems/: monotonic stack and pattern problems
- Challenges_Problem/: harder stack-based aggregation

## Problems
### Stack_Basic_Problem
- Backspace_String_Compare.java: Compare strings after processing backspaces.
- Baseball_Game.java: Score keeping using stack operations.
- Help_Classmates.java: Next smaller element to right (assist mapping).
- Next_Greater_Element_I.java: Next greater element for subset against superset.
- Remove_OuterMost_Parentheses.java: Strip outer layer from primitive parentheses.
- Reverse_Using_Stack.java: Reverse using explicit stack.
- Stack_Imp_Array.java: Array-based stack implementation.
- Valid_Parentheses.java: Classic parentheses validation.
- Valid_Parenthesis_String.java: Parentheses with wildcards `*` (flexible matching).

### Stack_Intermediate_Problems
- Asteroid_Collision.java: Resolve collisions using stack of directions/sizes.
- Daily_Temperatures.java: Next warmer day via monotonic decreasing stack.
- Largest_Rectangle_in_Histogram.java: Max rectangle with monotonic stack.
- Next_Greater_Element_2.java: Circular next greater using stack + mod index.
- Remove_K_Digits.java: Monotonic stack to form smallest number.
- Stock_Span_Problem.java: Price spans using decreasing stack of indices.
- Sum_of_subarray_minimums.java: Contribution technique with monotonic stack.
- Trapping_Rainwater.java: Water trapping via two pointers or stack variant.

### Challenges_Problem
- Sum_of_Total_Strength_of_Wizards.java: Subarray contributions with prefix sums + monotonic stacks.

## How To Run (Windows / Java)
```bash
# From repository root
cd WEEK_2/Stack_Basic_Problem
javac Valid_Parentheses.java
java Valid_Parentheses

# Another example
cd ../Stack_Intermediate_Problems
javac Daily_Temperatures.java
java Daily_Temperatures
```

Replace the class names above to run other files in their respective folders.