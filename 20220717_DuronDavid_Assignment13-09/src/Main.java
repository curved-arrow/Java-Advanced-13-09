public class Main {
    public static void main(String[] args) {
        // Create three Circle objects
        Circle firstCircle = new Circle(5, "red", true);
        Circle secondCircle = new Circle(5, "green", false);
        Circle thirdCircle = new Circle(4, "green", false);

        // Display results
        System.out.println("firstCircle radius: " + firstCircle.getRadius());
        System.out.println("secondCircle radius: " + secondCircle.getRadius());
        System.out.println("secondCircle radius: " + thirdCircle.getRadius());

        System.out.println("firstCircle is " + (firstCircle.equals(secondCircle) ? "" : "not ") +
                "equal to secondCircle");

        System.out.println("firstCircle is " + (firstCircle.equals(thirdCircle) ? "" : "not ") +
                "equal to thirdCircle");
    }
}