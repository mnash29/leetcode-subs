import java.util.HashMap;

/**
 * Accepted
 * Runtime: 64ms
 * Memory: 37.4MP less than 95.94% of java submissions.
 **/
 
public class LongestSubstring {
    public static void main(String [] args) {
        int solution = lengthOfLongestSubstring("abcdabb");
    }
    
    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int count = 0;
        char [] c = s.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        
        for(int i = 0; i < c.length; i++) {
            if(hashMap.containsKey(c[i])) {
                longest = (longest < count) ? count : longest;
                i = hashMap.get(c[i]);
                hashMap = new HashMap<>();
                count = 0;
            } else {
                hashMap.put(c[i], i);
                count++;
            }
        }
        return (longest < count) ? count : longest;
    }
}
