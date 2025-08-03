<img src="https://r2cdn.perplexity.ai/pplx-full-logo-primary-dark%402x.png" class="logo" width="120"/>

# Bedroom Composition Project – README

## Overview

This Java project demonstrates strong use of **object-oriented design**, with a focus on **composition**—building complex objects (`Room`) from simpler, reusable classes (such as `Lamps`, `Beds`, `Curtains`, `Ceilings`, and `bedroomWalls`). The user interacts with the program through the console, entering details to configure each aspect of their bedroom.

Each class embodies real-world bedroom items and contains robust data validation to promote reliable object creation and manipulation.

## Class Explanations

### 1. `Lamps`

- Models a lamp in the bedroom.
- **Fields:** `style` (String), `batteryPowered` (boolean), `globeRating` (int, must be 0–5).
- **Validation:** Style must not be null/empty; globe rating must not be negative.
- **Behavior:** Can be turned on with a simple method (`turnOn`).


### 2. `Beds`

- Represents a bed.
- **Fields:** Style, pillow count, bed sheet count, quilt count, height.
- **Validation:** All numeric fields must be non-negative (height must be positive); style must not be null/empty.
- **Includes:** Getters/setters with validations for safe updates.


### 3. `Curtains`

- Models curtains in the room.
- **Fields:** Style, length, number of curtains.
- **Validation:** Style must not be null/empty; length and number must be non-negative.


### 4. `Ceilings`

- Describes the ceiling.
- **Fields:** Paint color, height.
- **Validation:** Paint color must not be null/empty; height must be positive.


### 5. `bedroomWalls`

- Represents all four walls collectively.
- **Fields:** Material descriptions for north, south, east, and west walls; a shared wall color.
- **Validation:** No wall or color can be null.


### 6. `Room`

- **The main composite object.**
- **Fields:** Room name, plus instances of all the above components.
- **Composition:** Each `Room` is built from these separate class objects.
- **Methods:** Includes `displayRoomDetails()` for formatted output of all room properties.


## Main Method Logic

- Greets the user and collects each attribute for all room components via the console using a `Scanner`.
- For each component (`Lamps`, `Beds`, etc.), the method prompts for the necessary details, creates the objects, and validates input.
- Builds a `Room` instance from all gathered objects.
- Displays a descriptive summary of the user’s customized bedroom.
- Uses proper resource management (scanner closed at the end).


## Best Practices Demonstrated

- **Encapsulation \& validation:** All setters and constructors rigorously enforce data integrity.
- **Composition:** Complex objects are made by assembling smaller, focused classes.
- **User Input Handling:** Error-prone areas highlighted for further enhancement, such as parsing numbers and validating data.
- **Readability \& maintainability:** Code is modular, with clear property names and single-responsibility classes.


## Future Enhancement Note

This foundational version models bedroom components and user interaction via console input. As you advance, you can extend the project with features like a `Carpet` class, cost fields, or even a mock payment/checkout system—ideal for practicing larger-scale system design and exploring real-world software architecture concepts.

