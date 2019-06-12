import java.util.HashMap;

/**
 * Accepted 
 * Runtime: 2ms - faster than 99.20% of Java submissions
 * Memory usage: 38MB - less than 98.03% of Java submissions
 */
 
public class TwoSum {
  public static void main(String [] args) {
    int [] array = {2,7,11,15};
    int [] solution = twoSum(array, 9);
    System.out.println("Solution: [" + solution[0] + " " + solution[1] + "]");
  }
  
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int [] answer = new int[2];
    
    for(int i = 0; i < nums.length; i++) {
      if(map.containsKey(nums[i])) {
        answer[0] = map.get(nums[i]);
        answer[1] = i;
        return answer;
      }
      map.put((target - nums[i]), i);
    }
    return answer;
  }
}
