public class Repeated {
    // Creating the function to perform the sum of the digits
    public int repeatedSum(int num){
        // Indicating that the number was received
        System.out.println("The received number was: " + num);
        
        // Loop to extract the digits
        while (num >= 10){
            // Logic of the process
            int sum = 0;
            int originalNum = num; // Saving the original number
            while (num > 0){
                sum += num % 10; // Adding the last digit to the sum
                num /= 10; // Removing the last digit
            }
            System.out.println("Sum of the digits of " + originalNum + " = " + sum);
            // If the sum still has more than one digit, updates num with the sum of the digits
            if (sum >= 10) {
                num = sum; 
            } else {
                // Returns if there is only one digit
                System.out.println("The repeated sum of the digits of " + originalNum + " is: " + sum);
                return sum; 
            }
        }
        // Returns num if it has only one digit
        System.out.println("The repeated sum of the digits of " + num + " is: " + num);
        return num; 
    }
}
