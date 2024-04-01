package week12;

import java.util.ArrayList;

//=================================================================================================
public class ExceptionalIntegers {
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        // declare ArrayList of type int

        int index;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (index = 0; index < args.length; index++) {
            Integer element;
            try {
                element = Integer.parseInt(args[index]);
                arrayList.add(element);
                System.out.println("Converter method says integer OK - " + args[index]);
            }
            catch (Exception e) {
                System.out.println("Catch block says the argument " + args[index] + " is ignored because " + args[index]);
            }
        } // end of the for loop

        System.out.println("\nVector contents are:");
        for (index = 0; index < arrayList.size(); index++) {
            System.out.println("Item " + index + " is " + arrayList.get(index));
        }



    } // end of the main method
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================