# GestionRondeAndroid

## Overview

GestionRondeAndroid is an Android app for tracking people using Bluetooth, designed for BKR Security.

## Setup

To launch the web project **Ronde_Backend** (developed with Spring Boot), you'll need:

- The latest version of Java 8
- Apache Maven version 3.1 or higher
- An IDE installed (recommended: IntelliJ IDEA, or you can use Apache NetBeans or Eclipse)

### Steps to Run

1. **Launch the Ronde_Backend Project:**
   - Open the project in your IDE.
   - Run the `Script.sql` file in MySQL Workbench or any MySQL platform. This script contains the creation of the database; tables will be created automatically when you run the web project.

2. **Start the Backend:**
   - Open the terminal in your IDE and navigate to the project directory.
   - Run the following command:
     ```bash
     mvn spring-boot:run
     ```

3. **Run the Android Project:**
   - Open the Android project in Android Studio.
   - Ensure your SDK version is greater than 24.
   - Connect using the admin account:
     - Email: `m@m`
     - Password: `m@m`
