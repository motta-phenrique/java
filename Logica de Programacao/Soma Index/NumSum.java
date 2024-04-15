public class NumSum {
    // Create the method with an array of nums and a target to be found as parameters
    public void numSum(int[] nums, int target){
        // Use a for loop to iterate through the array
        for (int i = 0; i < nums.length - 1; i++){
            // Check if the number is present in the array
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    System.out.println("Two elements within this array that sum to " + target + ": " + nums[i] + " and " + nums[j]);
                    return;
                }
            }
        }
        // If not found, return the message
        System.out.println("Unable to find elements that sum up to " + target);
    }
}
