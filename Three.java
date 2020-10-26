public class Three
{
    public static void main(String args[]){
        int sumOfSquare = 0;
        int squareOfSum = 0;
        int runningSum;
        for(int i = 1; i <= 100; i++){
            runningSum = i*i;
            sumOfSquare += runningSum;
        }
        System.out.println("Sum of square: " + sumOfSquare);
        for(int i = 1; i <= 100; i++){
            squareOfSum += i;
        }
        squareOfSum = squareOfSum * squareOfSum;
        System.out.println("Square of sum: " + squareOfSum);
        System.out.println("Difference between the two: " + (squareOfSum - sumOfSquare));
    }
}
