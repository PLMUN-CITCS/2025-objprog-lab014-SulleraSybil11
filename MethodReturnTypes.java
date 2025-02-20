public class MethodReturnTypes {
    public static void main(String[] args) {  //Defining the main method
        displayWelcomeMessage();

        int value1 = 20;
        int value2 = 30;  //Declaring a variable using int


        double result = calculateAverage(value1, value2);


System.out.println("The average is: " + result);  //Printing the variables

}


public static void displayWelcomeMessage() {
     System.out.println("Welcome to our program!");  //Printing the welcoming messeage
   }


    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;  //Declaring a calculated area using int

        return average;
  
    }
}
