public class Main {

    public static void main(String[] args){
        NumSum sumNumbers = new NumSum();
        int [] example = {1,5,8,6,7};
        int target = 10;
        sumNumbers.numSum(example, target);

        NumSum sumNumbers1 = new NumSum();
        int [] example1 = {1,3,4,5,6,8,9,15,21,35,65,87,13};
        int target1 = 100;
        sumNumbers1.numSum(example1, target1);
    }
}
