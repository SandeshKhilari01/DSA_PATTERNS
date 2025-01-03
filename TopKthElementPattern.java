import java.util.*;
class TopKthElementPattern{
  public static int greatorKth(int[] nums, int k){
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for(int num : nums){
      minHeap.offer(num);
      if(minHeap.size()>k){
        minHeap.poll();
      }
    }
    return minHeap.peek();
  }
  public static void main(String args[]){
    int nums[] = {3, 2, 1, 5, 6};
    int k = 1;
    int ans = greatorKth(nums, k);
    System.out.println(ans);
  }
}