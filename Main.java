import java.util.Scanner;
/**
 *This program will mimic the chart on the google doc
 * @author Jackson 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  //create a scanner for user input
  Scanner input = new Scanner(System.in);

  //ask the user if that animal has feathers
  System.out.println("Does the animal have feathers?");
  String featherAnswer = input.nextLine();

  //check to see feather status
  if(featherAnswer.equals("yes")){
    //check if animal swims
    System.out.println("Does the animal swim?");
    String animalSwim = input.nextLine();

    if(animalSwim.equals("yes")){
      System.out.println("This is a duck");
    }else if(animalSwim.equals("no")){
      System.out.println("This is a hen");
    }
  }else if(featherAnswer.equals("no")){
    //check if animal has legs
    System.out.println("Does the animal have legs?");
    String animalLegs = input.nextLine();

    if(animalLegs.equals("yes")){
      System.out.println("This is a lizard");
    }else if(animalLegs.equals("no")){
      System.out.println("This is a snake");
    }
  }


    
  }
}
