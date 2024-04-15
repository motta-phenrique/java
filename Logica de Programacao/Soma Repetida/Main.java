public class Main {
    public static void main(String[] args) {
        Repeated repeated = new Repeated();
        int num = 547856988;

        int sumDigits = repeated.repeatedSum(num); // Calls the method
        
        // Displays the result of the repeated sum of the digits
        System.out.println("The repeated sum of the digits of " + num + " is: " + sumDigits);
    }
}
