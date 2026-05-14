# software-design-homework
## Project Description
This project is a campus food ordering system developed in Java.
The system allows students to order food and receive notifications using different notification types such as:
- Email
- SMS
- Push Notification
The project was refactored using design patterns.
## Design Patterns Used
### Factory Pattern
The Factory Pattern is used to create notification objects without directly creating them inside the service class.
### Singleton Pattern
The Singleton Pattern is used in the AppConfig class to manage shared configuration values such as:
- University name
- Delivery fee
- System version
## Project Structure
src/
- app
- config
- factory
- notification
- service
## How to Run
1. Open the project in Eclipse IDE.
2. Run Main.java as Java Application.
3. The console will display notification messages.
## Expected Output
The system prints:
- Order information
- Delivery fee
- Notification messages
for different notification types.
