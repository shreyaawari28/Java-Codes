# Java Login Validation – Method Overloading Example Program

This repository contains a Java program that demonstrates a **login validation system** using **method overloading**, **user input**, and **conditional logic**.

The program is suitable for **beginners** learning OOP concepts along with basic authentication logic.

---

## 📌 Program Overview

The program validates user login credentials in **two stages**:

1. **Username + Password validation**
2. **Username + Password + OTP validation**

This is achieved using **method overloading**, where the same method name is used with different parameter lists.

---

## 🧪 Code Functionality

- Uses `Scanner` to take user input from the console
- Stores predefined credentials:
  - Username
  - Password
  - OTP
- Calls two overloaded `validate()` methods:
  - One method validates username and password
  - Another method validates username, password, and OTP
- Prints appropriate access messages based on validation result

---

## 🧠 Concepts Covered

- Object-Oriented Programming (OOP)  
- Method Overloading  
- Class and object creation  
- `final` keyword  
- User input using `Scanner`  
- String comparison using `equals()`  
- Wrapper class (`Integer`)  
- Conditional statements (`if-else`)  
- Console output using `System.out.println()`  

---

## 🖥️ Output

📸 **Console output showing login and access validation:**  

![Program Output](output.png)

---

## 📂 File Information

- `LoginValidation.java` — Java source code  
- `output.png` — Screenshot of the program output  
- `README.md` — Project documentation  

---

## ⚠️ Limitations

- Credentials are hardcoded
- No input validation (empty or invalid formats)
- No encryption or hashing for password
- OTP is static and not time-based
- Not suitable for real-world authentication systems

---

## 👨‍💻 Author

**Shreya Awari**  
📧 Email: shreyaawari31@gmail.com  
🌐 GitHub: https://github.com/shreyaawari28  

---

⭐ Star the repository if it helps you understand method overloading and basic login logic in Java.

