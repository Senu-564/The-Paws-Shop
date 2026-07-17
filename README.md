# 🐾 The Paws Shop

A Java Swing desktop application developed for the **CSE4006 – Object Oriented Programming** module at the **International College of Business & Technology (ICBT)**.

This project was developed as part of the coursework assignment to demonstrate Object-Oriented Programming (OOP) concepts by implementing a role-based pet supplies management system with persistent file storage.

---

## 📖 Project Overview

**The Paws Shop** is a pet supplies management system designed to automate inventory management for a pet store. The application provides two user roles:

- **Cashier**
- **Manager**

Managers can perform all cashier operations and create new cashier accounts. The system stores all data using text files, allowing information to persist between application sessions.

---

## ✨ Features

### Cashier

- Login to the system
- View pet supplies
- Add new pet supplies
- Update pet supplies
- Delete pet supplies
- Search pet supplies by category
- Manage supplier information
- Download supplier and item data
- Logout

### Manager

- All Cashier features
- Create new cashier accounts

---

## 🛠 Technologies Used

- Java
- Java Swing
- Maven
- Object-Oriented Programming (OOP)
- File Handling
- NetBeans IDE

---

## 📚 OOP Concepts Applied

- ✔ Classes & Objects
- ✔ Abstraction
- ✔ Encapsulation
- ✔ Inheritance
- ✔ Polymorphism
- ✔ Method Overriding

---

## 📂 Project Structure

```text
PawsShop/
├── src/
│   ├── main/java/com/mycompany/pawsshop/
│   │   ├── data/
│   │   │   ├── User.java
│   │   │   ├── Manager.java
│   │   │   ├── Cashier.java
│   │   │   ├── Item.java
│   │   │   └── Supplier.java
│   │   ├── other/
│   │   │   └── DataPersistence.java
│   │   ├── ui/
│   │   │   ├── LoginFrame.java
│   │   │   ├── RegisterFrame.java
│   │   │   ├── ManagerFrame.java
│   │   │   ├── StoreFrame.java
│   │   │   └── SuppliersFrame.java
│   │   └── PawsShop.java
│   └── images/
│
├── items_data.txt
├── suppliers_data.txt
├── users.txt
├── downloaded_items_data.txt
├── downloaded_suppliers_data.txt
├── pom.xml
└── README.md
```

---

## 💾 Data Storage

The application stores data using text files.

| File | Description |
|------|-------------|
| `users.txt` | User account information |
| `items_data.txt` | Pet supplies inventory |
| `suppliers_data.txt` | Supplier records |
| `downloaded_items_data.txt` | Exported inventory data |
| `downloaded_suppliers_data.txt` | Exported supplier data |

---

## 🚀 Getting Started

### Requirements

- Java JDK 17 or later
- Maven 3.8+
- NetBeans IDE (recommended) or IntelliJ IDEA / Eclipse

### Clone the Repository

```bash
git clone https://github.com/Senu-564/PawsShop.git
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn exec:java
```

Or simply open the project in NetBeans and click **Run**.

---

## 🖥 Application Screens

- Login Screen
- Manager Authentication
- Cashier Registration
- Supplier Management
- Store Inventory Management

---

- Apply abstraction, encapsulation, inheritance, and polymorphism
- Implement file handling for data storage and retrieval
- Prepare a user manual for the developed application

---

Thank you for reviewing this project!
