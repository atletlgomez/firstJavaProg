import java.util.ArrayList;
import java.util.Scanner;
public class FizzBuzz {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    /* 
    public ArrayList<Integer> Fizz() {
        for (int number: numbers)
    } 
    */
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("We are going to find the numbers divisible by 3 in the range you decide.");
        System.out.println("At what number do you want to start?");
        System.out.println(inputNum.nextLine());

        inputNum.close();
    }
}