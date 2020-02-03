/**
 *
 */
class  ColMetSor {
   public static void main(String[] args) {
 
      String[] food = {"bananas", "mangos", "cabbage", "salmon", "pasta"};
      List<String> l1 = Arrays.asList(food);
      
      Collections.sort(l1);
      System.out.printf("%s\n", l1);
      
      Collections.sort(l1, Collections.reverseOrder());
      System.out.printf("%s\n", l1);
      
 
   }  
}