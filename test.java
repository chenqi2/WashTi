public class test {
   public static void main(String[] args) {
      double a = 1000000000;
      double b = 0.0000001;
      for (int i = 1; i <= 1000000; i++){
      a = a + b;
      }
      double result = a - 1000000000;
      byte c = 'cy'; 
      System.out.println("Final result is: "+ result);
      System.out.println("c is: "+ c );
   }
}