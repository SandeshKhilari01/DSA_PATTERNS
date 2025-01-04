import java.util.*;
class IntervalOverLappingPattern{
  public static int noOverLap(int[][] intervals){
    int count = 0;
    int prevEnd = Integer.MIN_VALUE;
    Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
    
    for(int[] interval : intervals){
      if(interval[0]<prevEnd){
        count++;
      } else {
        prevEnd = interval[1];
      }
    }
    return count;
  } 
  public static void main(String args[]){
    int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
    System.out.println(noOverLap(intervals));
  }
}