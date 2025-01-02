import java.util.*;

public class MonoatomicStackPattern{
  public static int[] nextGreater(int nums[]){
    Stack<Integer> stack = new Stack<>();
    int n = nums.length;
    int result[] = new int[n];
    for(int i = n-1; i>=0; i--){
      while(!stack.isEmpty() && stack.peek() <= nums[i]){
        stack.pop();
      }
      result[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(nums[i]);
    }
    return result;
  }
  public static void display(int nums[]){
    int n = nums.length;
    for(int i = 0; i<n; i++){
    System.out.print(nums[i]+" ");
    }
  }
  public static void main(String args[]){
    int nums[] = {2, 1, 5, 3, 6, 4, 7};
    int result[] = nextGreater(nums);
    display(result);
  }
}