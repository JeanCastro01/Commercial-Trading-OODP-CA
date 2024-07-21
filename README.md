## Introduction

This project is designed to simulate the sales of products between three companies using Object-Oriented Design Patterns. The simulation involves:

- **BIG-A** producing product A
- **BIG-B** producing product B
- **BIG-C** producing product C

Each company trades its native product with the other two companies. The simulation manages 50 depots per company, each with varying stock levels of native and external products. The program adheres to best practices in Object-Oriented software development and demonstrates knowledge of Object-Oriented programming principles.

## Specific Requirements

The program implements the following rules and features:

- Random generation of companies and depots with initial allowances, stock levels (native and external), and prices (products and delivery).
- Depots have product prices and delivery prices between 1 and 10.
- Depots have an initial cash allowance between 50 and 100.
- Each depot trades with all depots from other companies.
- Minimum and maximum stock levels for native and external products are enforced.
- A detailed menu is presented after the simulation, allowing users to view:
  - All transactions
  - Transactions for a particular company
  - Detailed information about each depot for a given company, including:
    - Own product stock
    - Foreign product stock
    - Cash balance

## Design Patterns Used

- **MVC (Model-View-Controller):** Organizes the program structure with clear separation of concerns.
  - **Model:** Represents companies, products, and depots.
  - **View:** Interacts with the user and saves data to a `.txt` document.
  - **Controller:** Manages all transactions in the system.

- **Abstract Factory:** Used for creating related objects without specifying their concrete classes, facilitating the development of models.

- **Singleton:** Ensures a single method to provide all information when saving data to a `.txt` file.

## Project Structure

- **Mymain:** Main Java project entry point.
- **abstractFactory:** Implements the Abstract Factory design pattern.
- **company:** Contains company-related classes.
- **controller:** Implements the Controller component of the MVC pattern.
- **depots:** Contains classes related to depot management.
- **factory:** Supports the creation of various objects.
- **products:** Manages product-related classes.
- **saveToFile:** Implements Singleton design pattern for saving data.
- **view:** Manages user interaction and display.

## Usage

To run the simulation, follow these steps:

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/yourusername/commercial-trading-simulation.git
    cd commercial-trading-simulation
    ```

2. **Build the Project:**
    Use your preferred IDE or command line to compile the source code.

3. **Run the Application:**
    Execute the main class to start the simulation.

4. **View Simulation Results:**
    Use the provided menu to explore detailed transaction and depot information.

## Example

Here's an example command to start the simulation:

```bash
java -cp bin Mymain
