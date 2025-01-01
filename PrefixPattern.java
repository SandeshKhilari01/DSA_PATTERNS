import java.util.*;
public class PrefixPattern{

  // SubArray sum count equals to k
  public static int cntSumK(int nums[], int k){
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int cnt = 0;
    int prefixSum = 0;
    for(int num : nums){
      prefixSum += num;
      cnt += map.getOrDefault(prefixSum-k, 0);
      map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
    }
    return cnt;
  }
  
  // PrefixSum Array
  public static void prefixSum(int nums[]){
    int prefix[] = new int[nums.length];
    prefix[0] = nums[0];
    for(int i = 1; i<nums.length; i++){
      prefix[i] = prefix[i-1] + nums[i];
    }
    for(int num : prefix){
      System.out.print(num+" ");
    }
    // CALCULATE SUM OF SUBARRAY
    int L = 1, R = 2;
    int sum = prefix[R] - prefix[L-1];
    System.out.println();
    System.out.println("Sum of subArray from "+L+" to "+R+"is "+sum);
  }
  
  public static void main(String args[]){
    int nums[] = {1, 2, 3};
    int k = 3;
    System.out.println(cntSumK(nums, k));
    prefixSum(nums);
    
  }
}