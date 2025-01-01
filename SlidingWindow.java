import java.util.*;
public class SlidingWindow{
  public static int smallestSubArray(int nums[], int target){
    int start = 0;
    int sum = 0;
    int minLen = nums.length;
    for(int i = 0; i<nums.length; i++){
      sum += nums[i];
      while(sum>=target){
        minLen = Math.min(minLen, i - start + 1);
        sum -= nums[start];
        start++;
      }
    }
    return minLen;
  }
  
  public static int longestSubStringLen(String s){
    int start = 0;
    int maxSize = 0;
    HashSet<Character> hashSet = new HashSet<>();
    for(int i = 0; i<s.length(); i++){
      char currentChar = s.charAt(i);
      while(hashSet.contains(currentChar)){
        hashSet.remove(currentChar);
        start++;
      }
      hashSet.add(currentChar);
      maxSize = Math.max(maxSize, i - start + 1);
    }
    return maxSize;
  }
  
  public static void main(String args[]){
    int nums[] = { 3, 5, 1, 4, 6, 3, 2, 4, 5};
    int target = 9;
    System.out.println(smallestSubArray(nums, target));
    
    // Longest Subtring size of string
    String s = "abcabcabb";
    System.out.println(longestSubStringLen(s));
  }
}