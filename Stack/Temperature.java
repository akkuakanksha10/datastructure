package Stack;

import java.util.Arrays;
import java.util.Stack;

/*
 * @author akanksha
 */
public class Temperature {
    public static void main(String[] args) {
        int[] temps = {72,78,90,67,45,89,10};
        System.out.println("result "+ Arrays.toString(dailyTemperatures(temps)));
    }
    // method to find warm temp
    public static  int[] dailyTemperatures(int[] temperatures){
        int n= temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack =  new Stack<>();
        for(int i =0; i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }
}
