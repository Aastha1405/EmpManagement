 👩‍💻 Employee Management System
A full-stack Employee Management web application built with **Spring Boot**, **React**, and **MySQL**. It allows users to perform full CRUD operations on employee data through a user-friendly interface and RESTful APIs.

🚀 Tech Stack

- **Frontend:** React.js, JavaScript, Axios  
- **Backend:** Spring Boot, Java, JPA, Hibernate  
- **Database:** MySQL (managed via MySQL Workbench)  
- **Tools:** IntelliJ IDEA (Backend), VS Code (Frontend), Git & GitHub  
- **Architecture:** MVC (Model-View-Controller)

🎯 Features
- Create, Read, Update, and Delete (CRUD) employee records
- REST API integration between the frontend and the backend
- Clean UI using React components and hooks
- Layered backend architecture (Controller → Service → Repository)
- Responsive and modular frontend
- Validation and error handling
- Integrated with MySQL database

  📁 Project Structure
employee-management/
│
├── backend/ # Spring Boot backend
│ └── src/main/java/...
│
├── frontend/ # React frontend
│ └── src/components/...
│
├── .gitignore
├── README.md
├── pom.xml
└── package.json


⚙️ How It Works

1. **Frontend (React):** Users interact with a responsive UI to manage employee data.
2. **Backend (Spring Boot):** Receives API calls, handles logic, and communicates with the database.
3. **Database (MySQL):** Stores all employee data and communicates via JPA/Hibernate.

📦 Run Locally

1. **Clone the repository**
2. **Start Backend (IntelliJ)**
- Open `/backend` in IntelliJ
- Configure `application.properties` with your MySQL credentials
- Run the Spring Boot app
3. **Start Frontend (VS Code)**
```bash
cd frontend
npm install
npm start

