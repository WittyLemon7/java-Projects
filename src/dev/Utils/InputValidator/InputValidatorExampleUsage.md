````java
int radius = -5;
if (!InputValidator.isNonNegative(radius)) {
System.err.println("Radius cannot be negative");
}

String name = "  ";
if (InputValidator.isEmpty(name)) {
System.out.println("Name is required");
}

String input = "123.45";
if (InputValidator.isNumeric(input)) {
System.out.println("Valid number input");
}
````