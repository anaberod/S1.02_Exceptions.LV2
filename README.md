# S1.02_Exceptions.LV2
Description - Exercise Statement
This project is part of an introductory Java programming course and focuses on handling user input
and exceptions using the `Scanner` class. The main goal is to build a utility class called
`InputReader` that ensures the user inputs valid data, including numeric types, single characters,
strings, and yes/no decisions.
Each method:
- Displays a message prompting the user.
- Catches and handles exceptions such as `InputMismatchException`.
- In some cases, throws a custom exception (`InputException`) when input doesn't meet specific
conditions (e.g., entering more than one character).
---
Technologies Used
- Java 17 (or compatible version)
- JDK and JRE
- IntelliJ IDEA / Eclipse / NetBeans (any Java IDE)
- Terminal / Command line for compilation and execution
---
---
Requirements
- Java Development Kit (JDK) version 11 or higher
- A working Java compiler (`javac`) and runtime (`java`)
- Git (for cloning the repository)
- IDE or text editor for editing code
---
Installation
1. Clone the repository:
 git clone https://github.com/anaberod/S1.02_Exceptions.LV2.git
2. Navigate to the project folder:
 cd S1.02_Exceptions.LV2
3. Open the project in your preferred IDE (or use a terminal editor).
---
Execution
1. Compile the project:
 javac InputException.java InputReader.java TestInputReader.java
2. Run the test class:
 java TestInputReader
3. Follow the on-screen instructions to test all input methods.
---
Deployment
This project is educational and meant for local execution only. No production deployment required.
However, you may:
- Package it into a `.jar` file with:
 jar cfe InputReaderApp.jar TestInputReader *.class
- Run the `.jar` file with:
 java -jar InputReaderApp.jar
---
Contributions
Contributions are welcome for:
- Improving exception messages
- Adding localization (multi-language support)
- Extending input types (e.g., dates, email validation)
To contribute:
1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Open a pull request with a clear description.
---

