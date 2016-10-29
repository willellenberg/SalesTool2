package gitTutorial;

public class Main {

   public static void main(String[] args) {
       SalesData data = new SalesData();
       displayGreeting();
       data.display();
   } //End main


  private static void displayGreeting() {
           System.out.println("Hello Happy Sales People");
           System.out.println("This App Shows Sales Data");
           System.out.println("-------------------------");
           System.out.println("Test one");
           System.out.println("Test two");
  } //End displayGreeting

}  //End class Main