import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class FizzBuzz {
    
    public static int[] createRange(int theStart, int theEnd) {
        int[] newRange = new int[theEnd - theStart + 1 ];
            for (int i = 0; i < newRange.length; i++) {
                newRange[i] = theStart + i;
            }
            return newRange;
        }
    
     
    public static ArrayList<Object> Fizz(int[] numbers) {
            ArrayList<Object> fizzies = new ArrayList<Object>();
            for (int number: numbers) {
                if (number % 3 == 0) {
                    fizzies.add("Fizz");
                    continue;
                }
                fizzies.add(number);
            }
            return fizzies;
            } 
        
        
            public static void main(String[] args) {
                Scanner inputNum = new Scanner(System.in);
                System.out.println("We are going to find the numbers that are divisible by 3 in the range you decide.");
                System.out.println("At what number do you want to start?");
                int start = inputNum.nextInt();
                System.out.println("What number do you want to end at?");
                int end = inputNum.nextInt();
                int[] rangeArr = createRange(start, end);
                ArrayList<Object> fizzArr = FizzBuzz.Fizz(rangeArr);
            System.out.println("We will start at " + start + " and end at " + end + ".");
            System.out.println("This is the range");
            System.out.println(Arrays.toString(rangeArr));
            System.out.println(fizzArr);
        inputNum.close();
    }
}