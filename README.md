# Appointment Management System

A web-based Appointment Management System built using Java, JSP, Servlets, and JDBC, enabling users to add, view, update, and delete appointment records with full database connectivity.

## Features
- Add new appointments
- View all appointment records
- Update existing appointment details
- Delete appointment records
- Persistent storage via JDBC-connected relational database

## Tech Stack
- Java
- JSP (JavaServer Pages)
- Servlets
- JDBC
- Relational Database (Oracle/MySQL)
- Apache Tomcat

## Typical Project Structure
src/
├── bean/        → Entity classes (e.g., Appointment.java)
├── dao/         → JDBC data access classes
├── servlets/    → Controller servlets (Add/View/Update/Delete)
├── util/        → DB connection utility, custom exceptions
WebContent/
├── *.jsp        → Add, View, Update, Delete pages
├── *.html       → Landing/result pages

## How to Run
1. Clone the repository
git clone https://github.com/shruthiramasamy5/Appointment-Management-System.git
2. Set up the database and update DB connection details in the util/config class
3. Build and deploy the project as a WAR to Apache Tomcat
4. Access via browser:
http://localhost:8080/<project-name>/

## Author
Shruthika R
