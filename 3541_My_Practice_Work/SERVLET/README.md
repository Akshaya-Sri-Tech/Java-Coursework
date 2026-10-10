# Student Registration System

## Question
Create a simple Student Registration System using Java Servlets that allows students to register by filling out a form and displays their details on a confirmation page.

## Technologies Used
- Java
- Jakarta Servlets
- HTML
- Apache Tomcat 10.1

## Folder Structure
```text
Student_Registeration_System/
├── index.html
├── Register.java
└── WEB-INF/
    ├── web.xml
    ├── classes/
    │   └── Register.class
    └── lib/
        └── jakarta.servlet-api-6.0.0.jar
```

## How to Compile

Open the terminal in the project root directory and execute:

```powershell
javac -cp ".\WEB-INF\lib\jakarta.servlet-api-6.0.0.jar" -d ".\WEB-INF\classes" .\Register.java
```

This compiles `Register.java` and generates `Register.class` inside `WEB-INF/classes`.

## How to Run
1. Place the project folder inside Tomcat's `webapps` directory.
2. Ensure `web.xml` maps the `Register` servlet to `/SRS-page`.
3. Start Apache Tomcat.
4. Open the following URL in your browser:

   `http://localhost:8080/Student_Registeration_System/`

5. Enter your name, register number, and CGPA, then click **Submit**.

## Expected Output
The confirmation response displays:
- Student Name
- Register Number
- CGPA

