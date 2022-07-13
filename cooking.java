public class MicrowaveCooking
{
    public static void main(String[] args)
    {
        //Use the Math class to generate a random integer between 0 and 60 to represent the number of seconds the roll will be microwaved.

        //Print out the number of seconds generated.

        //If the number is less than or equal to 20, print
        //Perfect cooking time!

        //If the number is greater than 20, print
        //Your roll will catch fire!
        
       // Generate a random number of seconds
       // between 0 and 60
        int seconds = (int)(Math.random() * 61);
       
       // Print the number of seconds
       System.out.println(seconds);
       
       // Use two if statements to print
       // whether the roll is fine or will catch fire
       if (seconds <= 20){
           System.out.println("Perfect cooking time!");
       }
       if (seconds > 20){
           System.out.println("Your roll will catch fire!");
       }
    }
}
