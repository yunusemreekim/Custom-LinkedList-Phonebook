# CUSTOM LINKED LIST PHONEBOOK
A console-based contact management application built with Java.
This project demonstrates the implementation of a Custom Singly
Linked List data structure from scratch, avoiding Java's built-in 
Collections Framework (**ArrayList**, **LinkedList**, etc.) to showcase a
deep understanding of memory management and algorithms.
## Project Overview
The primary goal of this project is to manage dynamic data using
Nodes and Pointers. It features an auto-sorting algorithm that 
inserts contacts in alphabetical order directly during the 
creation process.
### Features
- **Custom Data Structure:** Manual implementation of Node and 
Head references.
- **Sorted Insertion:** Contacts are automatically added 
in **alphabetical order** (A-Z).
- **Efficient Deletion:** Logic to modify pointers for removing 
nodes from the beginning, middle, or end of the list.
- **Robust Input Handling:** Includes try-catch blocks to handle 
InputMismatchException, ensuring the application doesn't crash on 
invalid user input.
- **Case-Insensitive Search:** Search and delete operations work 
regardless of capitalization (e.g., "Bob" vs "bob").
## Project Structure
sorted_phonebook/ \
```
PhoneBookProject/
├── src/
│   ├── Main.java        # Entry point, menu loop, and Exception Handling
│   ├── PhoneBook.java   # Core logic (add, delete, print, sort)
│   ├── Node.java        # The building block of the list (Data + Next Pointer)
│   └── Contact.java     # Data model holding Name and Phone Number
└── README.md
```
## Code Snippet: Pointer Manipulation
The following logic demonstrates how a new node is inserted
between two existing nodes to maintain alphabetical order:
``` 
// Logic to insert a node in the middle of the list
while (current.next != null && name.compareTo(current.next.data.name) > 0) {
current = current.next; // Traverse until the correct spot is found
}
// Update pointers
newNode.next = current.next;
current.next = newNode;
```
## How to Run
1. Clone the repository:
```
git clone https://github.com/yunusemreekim/Custom-LinkedList-Phonebook.git
```
2. Open the project in your IDE (IntelliJ IDEA, Eclipse, or VS Code).
3. Run the Main.java file.
4. Follow the on-screen menu instructions.
## Author
**YUNUS EMRE EKİM**
- Computer Engineering Student at **Istanbul Medeniyet University**
- Focus: Data Structures, Algorithms, and Java Development

