# Bank Management System

A Java-based desktop application developed using Java Swing and JDBC to automate and manage banking operations efficiently. The project provides a secure and user-friendly interface for performing various banking activities such as account creation, deposit, withdrawal, balance enquiry, fast cash, mini statement generation, and PIN change.

## Features

- User Authentication System
- Account Creation
- Deposit and Withdrawal
- Fast Cash Facility
- Balance Enquiry
- Mini Statement Generation
- PIN Change Option
- Transaction History Management
- Secure Database Connectivity

## Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- Object-Oriented Programming (OOP)

## Tools & Libraries

- MySQL Connector JDBC Driver
- JCalendar Library
- IntelliJ IDEA / Eclipse / VS Code

## Database Setup

1. Create a MySQL database
2. Import the `bank_management_system.sql` file
3. Update database credentials in the Java code

## Project Structure

```bash
Bank Management System/
│── src/
│── icons/
│── database file.txt
│── mysql-connector-java-8.0.28.jar
│── jcalendar-tz-1.3.3-4.jar
```

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA / Eclipse
3. Configure the MySQL database
4. Add JDBC and JCalendar libraries
5. Run the main Java file

## Database Configuration

Update your MySQL username and password in the connection file before running the project.

Example:

```java
String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";
String username = "root";
String password = "your_password";
```

## Future Enhancements

- Online Banking Support
- OTP Verification
- Fund Transfer Module
- Mobile Banking Integration
- Admin Dashboard

## Author

Shruti Nilajkar
