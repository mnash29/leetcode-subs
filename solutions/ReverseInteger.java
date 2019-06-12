

public class ReverseInteger {
    public static void main(String [] args) {
        int solution = reverse(-321);
        System.out.println(solution);
    }
  
    public static int reverse(int x) {
      
          long sum = 0;
          
          while(x != 0) {
              sum = sum * 10;
              sum += x%10;
              x = x/10;
          }
        
          if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
              return 0;
          }
        
          return (int)sum;
    }
}