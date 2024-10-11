# Patient Management System

This is a Java-based project that provides a graphical user interface (GUI) for performing CRUD (Create, Read, Update, Delete) operations on Patient objects. The project uses Hibernate for Object-Relational Mapping (ORM) and MySQL for the database. It is built using Maven for dependency management.

&emsp;&emsp;[The image folder contains the screenshots for the project.](https://github.com/VenomousKnight/MedicalRecord/tree/master/Images)

## Features
 * Add a New Patient: Create a new patient and store their details in the database.

 * View Patient Records: Display the list of patients stored in the database in a table format.

 * Update Patient Information: Modify and update the details of an existing patient.

 * Delete Patient Record: Remove a patient’s record from the database.

 * Search Patient by SSN: Quickly find a patient using their Social Security Number (SSN).

## Technologies Used
 * Java: The programming language used to build the application.
 * Swing: For building the graphical user interface (GUI).
 * MySQL: The relational database used for storing patient records.
 * Hibernate: Used for ORM (Object Relational Mapping) to interact with the database.
 * Maven: For project management and dependency management.
 * JDBC: For connecting to the MySQL database.
   
## Project Setup
 Prerequisites
To run this project, you need to have the following installed on your machine:

 - Java JDK (Java Development Kit)
 - MySQL
 - Maven
 - Database Setup
 - Install and set up MySQL on your local machine.

Create a MySQL database for this project with the name patient.

Run the SQL script provided in the sql folder to create the required table(s):

CREATE TABLE patient( <br> &emsp;&emsp;&emsp;&emsp;
    ssn VARCHAR(11) PRIMARY KEY, <br>&emsp;&emsp;&emsp;&emsp;
    first_name VARCHAR(50), <br> &emsp;&emsp;&emsp;&emsp;
    last_name VARCHAR(50), <br> &emsp;&emsp;&emsp;&emsp;
    dob DATE, <br> &emsp;&emsp;&emsp;&emsp;
    phone_no VARCHAR(15), <br> &emsp;&emsp;&emsp;&emsp;
    address1 VARCHAR(100), <br> &emsp;&emsp;&emsp;&emsp;
    address2 VARCHAR(100), <br> &emsp;&emsp;&emsp;&emsp;
    city VARCHAR(50), <br> &emsp;&emsp;&emsp;&emsp;
    zipcode VARCHAR(10), <br> &emsp;&emsp;&emsp;&emsp;
    allergy1 VARCHAR(50), <br> &emsp;&emsp;&emsp;&emsp;
    allergy2 VARCHAR(50), <br> &emsp;&emsp;&emsp;&emsp;
    allergy3 VARCHAR(50), <br> &emsp;&emsp;&emsp;&emsp;
    photo VARCHAR(100) <br>
);


 * PatientSQL.java: Contains the Hibernate-based data access logic for the Patient object.
 * Patient.java: The entity class that maps to the patient table in the MySQL database.
 * PrinceipalFrame.java: The entry point of the application.
 
The hibernate.cfg.xml file contains configuration file for Hibernate to connect to MySQL.

## Troubleshooting
If you encounter any issues:

 * Make sure MySQL is running and that your connection settings in hibernate.cfg.xml are correct.
 * Ensure that you have the correct database table structure.
 * Check the log or console for detailed error messages.

## Contributing
Feel free to submit a pull request or open an issue if you want to contribute to this project.
