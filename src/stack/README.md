# Stack Data Structure

---

This program implements the Stack Data Structure. The `Stack` class 
implements the `StackADT` interface. 

**StackADT class** has the following methods:
- push()
- pop()
- peek()
- isEmpty()
- size()
- clear()

---

**ParenthesesMatching** class implements the Stack-based algorithm. It 
checks if the given expression or sequence of parentheses, brackets and 
curly braces are well-formed. 

Here is the example of the program running
```text
Enter input: {[()()]()}
The input is balanced
```
```text
Enter input: {[()(]}
The input is unbalanced
```

PS: For now the ParenthesesMatching program will check an expression that 
only has parentheses, brackets and curly braces. The integers will be 
considered as an error to program.