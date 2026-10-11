# Login Page Using Java Servlets

## Question
Create a simple Login Page using HTML, CSS, and Java Servlets that accepts a username and password and displays a success or failure message based on the entered credentials.

## Technologies Used
- Java
- Jakarta Servlets
- HTML
- CSS
- Apache Tomcat 10.1

## Folder Structure
```text
MyApp/
├── index.html
├── HelloServlet.java
└── WEB-INF/
    ├── web.xml
    ├── classes/
    │   └── HelloServlet.class
    └── lib/
        └── jakarta.servlet-api-6.0.0.jar
```

## How to Compile

Open the terminal in the project root directory and execute:

```powershell
javac -cp ".\WEB-INF\lib\jakarta.servlet-api-6.0.0.jar" -d ".\WEB-INF\classes" .\HelloServlet.java
```

This generates `HelloServlet.class` inside `WEB-INF/classes`.

## How to Run
1. Place the `MyApp` folder inside Tomcat's `webapps` directory.
2. Ensure `web.xml` maps `HelloServlet` to `/login`.
3. Start Apache Tomcat.
4. Open the following URL:

   `http://localhost:8080/MyApp/`

5. Enter the username and password, then click **Login**.

**Test credentials:**
- Username: `admin`
- Password: `1234`

## Expected Output
- **Valid credentials:** `Login Successful!`
- **Invalid credentials:** `Invalid Username or Password!`