# Point Class

## Overview

The `Point` class is a fundamental geometric utility in Java that represents a point in 2D Cartesian coordinate space. This class provides essential functionality for working with points, including distance calculations, coordinate manipulation, and geometric operations commonly used in computer graphics, game development, and mathematical applications.

## Core Concepts

### Coordinate System

The `Point` class uses the standard Cartesian coordinate system where:

- **x-coordinate**: Horizontal position (positive values extend to the right)
- **y-coordinate**: Vertical position (positive values extend upward)
- **Origin (0,0)**: The reference point where both coordinates equal zero


### Mathematical Foundation

#### Distance Calculation

The class implements the **Euclidean distance formula** to calculate the straight-line distance between two points:

```
distance = √[(x₂ - x₁)² + (y₂ - y₁)²]
```

This formula is derived from the **Pythagorean theorem**, where the distance between two points forms the hypotenuse of a right triangle.

#### Vector Operations

Points can be treated as position vectors from the origin, enabling:

- **Translation**: Moving a point by adding/subtracting coordinate values
- **Scaling**: Multiplying coordinates by a factor to resize distances from origin
- **Reflection**: Negating coordinates to mirror points across axes


## Class Structure

### Fields

```java
private double x;  // x-coordinate
private double y;  // y-coordinate
```


### Key Methods

#### Constructors

- `Point()`: Creates point at origin (0,0)
- `Point(double x, double y)`: Creates point at specified coordinates


#### Accessor Methods

- `getX()`: Returns x-coordinate
- `getY()`: Returns y-coordinate
- `setX(double x)`: Updates x-coordinate
- `setY(double y)`: Updates y-coordinate


#### Geometric Operations

- `distanceTo(Point other)`: Calculates Euclidean distance to another point
- `distanceFromOrigin()`: Calculates distance from (0,0)
- `translate(double dx, double dy)`: Moves point by specified offsets
- `scale(double factor)`: Scales coordinates by multiplication factor


#### Utility Methods

- `toString()`: Returns string representation "(x, y)"
- `equals(Object obj)`: Compares points for coordinate equality
- `hashCode()`: Generates hash for collections usage


## Mathematical Examples

### Distance Calculation

For points A(3, 4) and B(6, 8):

```
distance = √[(6-3)² + (8-4)²]
distance = √[3² + 4²]
distance = √[9 + 16]
distance = √25 = 5
```


### Translation

Moving point P(2, 3) by vector (4, -1):

- New x = 2 + 4 = 6
- New y = 3 + (-1) = 2
- Result: P'(6, 2)


### Scaling

Scaling point P(3, 4) by factor 2:

- New x = 3 × 2 = 6
- New y = 4 × 2 = 8
- Result: P'(6, 8)


## Usage Scenarios

### Game Development

- Character positioning and movement
- Collision detection between objects
- Pathfinding calculations


### Computer Graphics

- Pixel positioning on screen
- Drawing geometric shapes
- Image transformation operations


### Data Analysis

- Plotting data points on charts
- Clustering algorithms
- Statistical distance measurements


## Performance Considerations

- **Double precision**: Uses `double` type for accuracy in mathematical operations
- **Immutable operations**: Methods like `translate()` modify the existing point rather than creating new instances
- **Efficient distance calculation**: Avoids unnecessary object creation in distance computations


## Best Practices

1. **Validation**: Consider adding bounds checking for coordinate values if needed
2. **Precision**: Be aware of floating-point precision limitations in equality comparisons
3. **Null safety**: Always check for null parameters in methods accepting other Point objects
4. **Documentation**: Include units of measurement in method documentation when applicable

This Point class serves as a building block for more complex geometric operations and provides a solid foundation for 2D coordinate-based programming in Java.