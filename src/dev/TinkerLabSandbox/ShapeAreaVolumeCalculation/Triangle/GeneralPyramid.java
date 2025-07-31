package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Triangle;

//this calculate for regular pyramid

public class GeneralPyramid extends Triangle {

        private double heightFromBase; // height from triangle base (NOT the side) to pyramid apex

        public GeneralPyramid(double sideA, double sideB, double sideC, double heightFromBase) {
            super(sideA, sideB, sideC);
            if (heightFromBase <= 0) {
                throw new IllegalArgumentException("Height must be positive.");
            }
            this.heightFromBase = heightFromBase;
        }

        public double calculateVolume() {
            return (1.0 / 3.0) * super.calculateArea() * heightFromBase;
        }

        // Surface area: base area + area of 3 lateral triangles (you'd need their slant heights)
        // Omitted for now—gets complex unless all faces are equilateral.

        @Override
        public String toString() {
            return "TriangularPyramid{" +
                    "sides=[" + getSideA() + "," + getSideB() + "," + getSideC() + "]" +
                    ", heightFromBase=" + heightFromBase +
                    ", volume=" + calculateVolume() +
                    '}';
        }


}
