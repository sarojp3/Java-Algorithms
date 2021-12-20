//Enums are a special class that represents a group of constants(unchangeable constants, like final variables).
//We can access enum constants using dot(.) operator.
//Enums are used when we values we know that aren't going to change like month, days, colors,etc.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Enums {
    enum Level{
        LOW, MEDIUM, HIGH
    }
    public static void main(String[] args){
        //Using Date Time package to get date and time
        LocalDateTime myDateTime = LocalDateTime.now();

        System.out.println("Befor formatting: " + myDateTime);

        //Formatting Date Time output:
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); //HH gives 24hr format and small give 12hrs format.
        String formattedDateTime = myDateTime.format(myFormat);
        System.out.println("After Formatting: " + formattedDateTime);


        Level myVar = Level.HIGH;
        System.out.println(myVar);

        for(Level myVars : Level.values()){  //Looping through variables in enum. Level.values() returns the array of all enum constants.
            System.out.println(myVars);
        }
    }
}
