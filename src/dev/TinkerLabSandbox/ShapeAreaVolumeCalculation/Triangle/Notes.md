
# ShapeAreaVolumeCalculation: Triangle \& Pyramid Classes

## Overview

This Java package models geometric triangles, tetrahedrons (triangular-based pyramids where all faces are equilateral), and general triangular pyramids. The classes focus on **object-oriented design**, robust validation, and implementation of classic geometric formulas with real-world relevance.

## Class Summaries

### 1. **Triangle**

- **Purpose:** Represents a generic triangle defined by its three sides.
- **Key Features:**
    - Validates positive side lengths and triangle inequality.
    - Computes the perimeter and area (using Heron's formula).
    - Identifies whether a triangle is equilateral.

**Core Math:**

- **Triangle Inequality:** The sum of any two sides must be greater than the third.
- **Perimeter:**
  \$ P = a + b + c \$
- **Area (Heron's Formula):**
  \$ s = \frac{a + b + c}{2} \$
  \$ Area = \sqrt{ s(s - a)(s - b)(s - c) } \$
  Where \$ a \$, \$ b \$, and \$ c \$ are the side lengths and \$ s \$ is the semi-perimeter.


### 2. **Pyramid (as Regular Tetrahedron)**

- **Purpose:** Models a tetrahedron, a pyramid with a triangular base where all edges are equal (all faces are equilateral triangles).
- **Inheritance:** Extends the Triangle class (all three sides equal).
- **Key Features:**
    - Takes a single edge length for construction.
    - Computes surface area and volume with tetrahedral formulas.

**Tetrahedron Math:**

- **Surface Area:**
  \$ Surface Area = 4 \times (area of one equilateral triangle) \$
  Each face area:
  \$ Triangle Area = \frac{\sqrt{3}}{4} a^2 \$
- **Volume:**
  \$ V = \frac{a^3}{6\sqrt{2}} \$
  Where \$ a \$ is the edge length.


### 3. **General Triangular Pyramid (Triangular-Based Pyramid)**

- **Purpose:** Models a pyramid with any triangle as its base and a given height (distance from base to apex).
- **Inheritance:** Extends the Triangle class using three side lengths for the base.
- **Key Features:**
    - Constructor takes three sides and a **pyramid height** (not triangle height).
    - Computes the volume using the area from Triangle and the given apex height.
    - Surface area calculation is only simple if all faces are equilateral; otherwise, it requires additional side/slant data.

**General Pyramid Math:**

- **Volume:**
  \$ V = \frac{1}{3} \times (base area) \times (pyramid height) \$
  Where base area is computed using Heron's formula from the Triangle class.
- **Surface Area (Optional – for regular bases):**
  \$ Surface Area = base area + \sum lateral triangle areas \$
  For regular tetrahedrons, it's simply \$ 4 \times (area of one face) \$.


## Code Structure and OOP Logic

- **Strong Validation:** All constructors check for positive side lengths, pyramid heights, and triangle validity.
- **Inheritance Use:** The Pyramid (tetrahedron and general version) leverages Triangle logic for base area and validation.
- **Extendable Base:** Use of Triangle as a superclass lets you extend to other 3D shapes or polygons as bases in the future.
- **Encapsulated Methods:** Area, perimeter, and volume are accessed through named methods ensuring clarity and correctness.
- **Clear Overrides:** `toString()` methods give detailed summary strings for quick debugging or output.


## Example Usage

```java
// Regular tetrahedron (all sides 6.0)
Pyramid regularTetra = new Pyramid(6.0);
System.out.println(regularTetra); // Outputs side, volume, surface area

// General triangular pyramid (base sides 7, 8, 9; height 10)
Pyramid generalPyramid = new Pyramid(7.0, 8.0, 9.0, 10.0);
System.out.println(generalPyramid); // Outputs base sides, height, volume
```


## When To Use Each Class

| You Need To Model… | Use… |
| :-- | :-- |
| Any triangle (2D) | `Triangle` |
| Regular tetrahedron (3D) | `Pyramid(double side)` |
| Any triangular base + height (3D) | `Pyramid(double sideA, double sideB, double sideC, double pyramidHeight)` |

## Key Mathematical Resources

- Heron's formula for triangle area
- Tetrahedron volume and surface area: see standard geometry textbooks or reputable math resources


## Extending for Career Growth

- Add interfaces like `Shape2D` and `Shape3D` with `.calculateArea()` and `.calculateVolume()`.
- Implement additional validation in setters (to keep triangles always valid after construction).
- Document all methods using JavaDoc for future collaboration.

**This README helps you and future collaborators immediately understand design choices, logic, and the math underlying these Java geometric shapes, making your codebase robust, readable, and career-ready!**

Let me know if you’d like a sample main class for demo/testing, or if you want diagrams or UML to go along with this documentation.

