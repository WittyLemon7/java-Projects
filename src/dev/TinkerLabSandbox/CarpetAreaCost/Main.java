package dev.TinkerLabSandbox.CarpetAreaCost;


public class Main {

    public static void main(String[] args) {

        //test case for Carpet area calculation
        Floor1 floor1 = new Floor1(5.0, 4.0);
        Carpet1 carpet1 = new Carpet1(2.0);
        CostCalculation calculator1 = new CostCalculation(floor1, carpet1);
        double totalCost1 = calculator1.calculateTotalCost();
        System.out.println("Total cost for Floor1: " + totalCost1);






    }
}






//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//    private static List<CostCalculation> roomCalculations = new ArrayList<>();
//
//    public static void main(String[] args) {
//        System.out.println("🏠 Professional Carpet Cost Calculator 🏠\n");
//
//        boolean continueCalculating = true;
//        while (continueCalculating) {
//            calculateSingleRoom();
//            continueCalculating = askToContinue();
//        }
//
//        displayFinalSummary();
//    }
//
//    private static void calculateSingleRoom() {
//        System.out.println("\n--- New Room Calculation ---");
//
//        // Get room dimensions with input validation
//        Floor1 floor = createFloorFromInput();
//
//        // Let user choose carpet type
//        Carpet1 carpet = createCarpetFromInput();
//
//        // Calculate and store
//        CostCalculation calculation = new CostCalculation(floor, carpet);
//        roomCalculations.add(calculation);
//
//        // Display result
//        displayRoomResult(calculation, roomCalculations.size());
//    }
//
//    private static Floor1 createFloorFromInput() {
//        double width, length;
//
//        while (true) {
//            try {
//                System.out.print("Enter room width (meters): ");
//                width = scanner.nextDouble();
//                System.out.print("Enter room length (meters): ");
//                length = scanner.nextDouble();
//
//                return new Floor1(width, length);
//            } catch (IllegalArgumentException e) {
//                System.out.println("❌ Error: " + e.getMessage());
//                System.out.println("Please enter positive values only.\n");
//            }
//        }
//    }
//
//    private static Carpet1 createCarpetFromInput() {
//        System.out.println("\nAvailable Carpet Types:");
//        CarpetType[] types = CarpetType.values();
//
//        for (int i = 0; i < types.length; i++) {
//            System.out.printf("%d. %s - $%.2f per sq meter\n",
//                    i + 1, types[i].getDisplayName(), types[i].getCostPerSqUnit());
//        }
//        System.out.println((types.length + 1) + ". Custom pricing");
//
//        System.out.print("\nChoose carpet type (1-" + (types.length + 1) + "): ");
//        int choice = scanner.nextInt();
//
//        if (choice >= 1 && choice <= types.length) {
//            return new Carpet1(types[choice - 1]);
//        } else if (choice == types.length + 1) {
//            System.out.print("Enter custom cost per sq meter: $");
//            double customCost = scanner.nextDouble();
//            return new Carpet1(customCost);
//        } else {
//            System.out.println("Invalid choice, using BASIC carpet.");
//            return new Carpet1(CarpetType.BASIC);
//        }
//    }
//
//    private static boolean askToContinue() {
//        System.out.print("\nCalculate another room? (y/n): ");
//        String response = scanner.next().toLowerCase();
//        return response.startsWith("y");
//    }
//
//    private static void displayFinalSummary() {
//        System.out.println("\n" + "=".repeat(50));
//        System.out.println("📊 FINAL SUMMARY REPORT");
//        System.out.println("=".repeat(50));
//
//        double grandTotal = 0;
//        double totalArea = 0;
//
//        for (int i = 0; i < roomCalculations.size(); i++) {
//            CostCalculation calc = roomCalculations.get(i);
//            double cost = calc.calculateTotalCost();
//            double area = calc.getFloor().getArea(); // You'd need to add this getter
//
//            System.out.printf("Room %d: %.1f sq meters = $%.2f\n",
//                    i + 1, area, cost);
//
//            grandTotal += cost;
//            totalArea += area;
//        }
//
//        System.out.println("-".repeat(30));
//        System.out.printf("Total Area: %.1f sq meters\n", totalArea);
//        System.out.printf("Grand Total: $%.2f\n", grandTotal);
//        System.out.printf("Average Cost per sq meter: $%.2f\n",
//                totalArea > 0 ? grandTotal / totalArea : 0);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//
//        // test case for Carpet area calculation
//        Floor1 floor1 = new Floor1(5.0, 4.0);
//        Carpet1 carpet1 = new Carpet1(2.0);
//
//        CostCalculation calculator1 = new CostCalculation(floor1, carpet1);
//        double totalCost1 = calculator1.calculateTotalCost();
//        System.out.println("Total cost for Floor1: " + totalCost1);
//
//    }
//}
