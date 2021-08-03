public class Chapter4 {

    public static void main (String[] args) {
        int hourOfDay = 10;
        int hour = 10;
        int morningGreetingCount = 0;
        int greetingCount = 0;

        //Control flow statements break up flow of execution - uses decision making
        //looping and branching

        //IF statement with {} allows for multiple statements based on evaluation
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }

        //IF statement without {}
        if (hour < 11)
            System.out.println("Morning");
        greetingCount++;
        //Above, if statement only applies to printing the statement - always increments

        System.out.println(morningGreetingCount);
        System.out.println(greetingCount);

        //ELSE statement
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }
        //Prevents redundant and repetitive code, no need for multiple ifs
        //branching between the 2 options

        //ELSEIF
        if (hourOfDay < 11){
            System.out.println("Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }
        //Important to note that order matters in if/else
        //Needs to have a condition in order to compile - watch for = being used instead of ==


        //SWITCH statement - used when multiple possible branches
        //Can evaluate: int, byte, short, char, enum and var
        //Cannot evaluate: boolean (too small a range) and floating point numbers (too wide a range)

        System.out.println("Switch 1");
        int dayOfTheWeek = 6;
        switch (dayOfTheWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
        //break statements terminate switch and return flow to enclosing statement
        //default not at end - not required unless going to have pathways that reach multiple sections of switch
        //in single execution

        System.out.println("Switch 2");
        var dayOfWeek = 6;
        //var allowed as resolves to int
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }

        //break statements removed so when dayOfWeek is 5, code will jump to default
        //block then execute preceding case statements in order until it finds break or finishes switch
        //The order of case/default now important - putting default at end would cause only
        //one word output
        System.out.println("Switch 3");
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Weekday");
                break;
        }
        //exam creators are fond of switch statements with missing breaks!!

        //Acceptable case values
        //Values in case statement need to be compile-time constant values of same data type as the switch
        //Only literals, enums or finals of same data type

        /*
        final int getCookies() { return 4; }
         void feedAnimals() {
            final int bananas = 1; //final so valid
            int apples = 2; // not final so even though value is known its invalid
            int numberOfAnimals = 3;
            final int cookies = getCookies();
            switch (numberOfAnimals) {
                case bananas:
                case apples:  // DOES NOT COMPILES
                case getCookies():  // DOES NOT COMPILE
                case cookies :  // DOES NOT COMPILE
                case 3 * 5 :
            }
        }
         */

/*
    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test": --compiles as string literal
            return 52; -- example of how return statement can be used to exit switch early

        case middleName:  // DOES NOT COMPILE -- middleName not constant
             id = 5;
            break;
         case suffix: -- compiles as suffix is final
            id = 0;
            break;
          case lastName:    // DOES NOT COMPILE -- its final but not constant as passed to function
             id = 8;
             break;
             ---- final 3 dont have a matching type of string---
          case 5:           // DOES NOT COMPILE
             id = 7;
             break;
          case 'J':         // DOES NOT COMPILE
             id = 10;
             break;
          case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE
             id=15;
             break;
        }
       return id;
    }
 */

        //switch statements dont need to have any cases
    /*
        switch (variableToTest) { <-- curly brace required
            case constantExp1:
            --branch for case1
            break; <--optional
            case constantExp2:
            break;

            default: <--optional. May appear anywhere within switch
            --branch for default
        }
     */
        //swtich statements support numeric promotion

        /*
        short size = 4;
        final int small = 15;
        final int big = 1_000_000; -- too big to fit into a short without
        //explicit cast so wont compile
        switch(size) {
            case small:
            case 1+2 :
            case big:  // DOES NOT COMPILE
        }
         */


        System.out.println("While Loops");
        //A loop is repetitive control structure that executes a statement multiple times
        WhileLoops whileLoops = new WhileLoops();
        whileLoops.count();
        whileLoops.whileStatement();
        whileLoops.eatCheese(6);
        whileLoops.doWhileExample();

        //IMPORTANT to remember with all loops is make sure they terminate
    }
}
