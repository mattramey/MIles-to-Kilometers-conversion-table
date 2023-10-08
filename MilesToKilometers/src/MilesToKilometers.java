public class MilesToKilometers {
    public static void main(String[] args) throws Exception {

        // display miles and kilometers \t is used as a tab space
        System.out.println("Miles\tKilometers");

       //initialize for loop with a condition of miles <= 10, declare variable miles 
        
        for (int miles = 1; miles <= 10; miles ++){

            //declare variable kilometers = miles * 1.609, this will convert miles into kilometers
            double kilometers = miles * 1.609;

            // display table
            System.out.println(miles + "\t" + kilometers);
        }
    }
}
