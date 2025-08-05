
# Animal Shelter System

A Java application demonstrating intermediate OOP, queue logic, and collection manipulation. The project models an animal shelter that manages *dogs*, *cats*, and *rabbits*—all adoptable on a “first in, first out” basis, either by specific type or by overall oldest arrival.

## **Problem Statement**

- The shelter holds only dogs, cats, and rabbits.
- People can adopt the “oldest” animal present (among all types), or
- People can request specifically the oldest dog, cat, or rabbit.
- Each animal is assigned an arrival order or timestamp to track who’s been in the shelter the longest.


## **Project Structure**

```
AnimalShelter/
├── Animal.java
├── Dog.java
├── Cat.java
├── Rabbit.java
├── AnimalShelter.java
└── Main.java
```


## **Core Components \& Logic**

### **1. Animal, Dog, Cat, and Rabbit Classes**

- **Animal.java:** A generic base class with shared properties such as `name` and `arrivalOrder` for all animals.
- **Dog.java, Cat.java, Rabbit.java:** Extend `Animal` to represent type, enabling type-based operations and inheritance.


### **2. AnimalShelter.java (Manager)**

- Maintains **three separate queues**:
    - `Dog` queue
    - `Cat` queue
    - `Rabbit` queue
- At `enqueue()`, each animal receives an incrementing sequence number to maintain ordering.
- **Key Methods:**
    - `enqueue(Animal animal)`: Adds dogs, cats, or rabbits to the right queue, assigning an order marker.
    - `dequeueAny()`: Compares the heads of all three queues (by arrival order) and adopts out the oldest animal.
    - `dequeueDog()`, `dequeueCat()`, `dequeueRabbit()`: Remove and return the oldest animal of each specific type.


### **3. Main.java**

- Example usage: initialize shelter, add a mix of dogs, cats, and rabbits, then demonstrate each adoption method.
- Clearly showcases the “oldest first” logic for both generic and type-based adoptions.


## **How the Logic Works**

- Each animal is placed into its own type queue upon arriving.
- The `arrivalOrder` ensures true “first-come, first-served” even across different species.
- `dequeueAny()` checks the first animal in each queue and selects the one with the lowest order value, ensuring global ordering.


## **Sample Usage**

```java
shelter.enqueue(new Dog("Fido"));
shelter.enqueue(new Rabbit("Nibbles"));
shelter.enqueue(new Cat("Whiskers"));
shelter.enqueue(new Dog("Buddy"));

shelter.dequeueAny();    // Returns Fido (oldest overall)
shelter.dequeueCat();    // Returns Whiskers
shelter.dequeueDog();    // Returns Buddy
shelter.dequeueRabbit(); // Returns Nibbles
```


## **Learning Outcomes**

- Practice and demonstration of **inheritance** (Dog, Cat, Rabbit all from Animal).
- Clear understanding of **collection management** with multiple queues, using LinkedList or Queue for efficient FIFO operations.
- Application of algorithmic thinking for prioritizing “oldest overall” across several categories.
- Clean, extensible design—easy to add more animal types or nuanced adoption rules.


## **Customization Ideas**

- Track additional data like health, breed, or personality for each animal.
- Extend for other animals or adoption priorities.
- Build a text or GUI menu for interactive user input.

**This rich, extensible project is excellent practice for mastering Java’s OOP and collection features, with an engaging real-world simulation twist.**

