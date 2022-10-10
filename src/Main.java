public class Main {   // Save as "PrintNumberInWord.java"
    public static void main(String[] args) {
        int number = 7;  // Set the value of "number" here!

        System.out.println( "The number is / A megadott szám  az első módszerrel:");

        // Using nested-if
        if (number == 1) {   // Use == for comparison
            System.out.println( "one /Egy");
        } else if ( number == 2 ) {
            System.out.println( " Two /Kettő");
        } else if ( number == 3 ) {
            System.out.println( "Three /Harom");
        } else if ( number == 4 ) {
            System.out.println( "Four /Négy");
        } else if ( number == 5 ) {
            System.out.println( "Five /Öt");
        } else if ( number == 6 ) {
            System.out.println( "Six /Hat");
        } else if ( number == 7 ) {
            System.out.println( "Seven /hét");
        } else if ( number == 8 ) {
            System.out.println( "Eight /Nyolc");
        } else if ( number == 9 ) {
            System.out.println( "Nine /Kilenc");
        }



        else {
            System.out.println( "Other/ Egyéb - nem egyjegyű szám");
        }


        // Using switch-case-default

        System.out.println( "The number is / A megadott szám  a masodik módszerrel:");

        switch(number) {
            case 1:
                System.out.println("One /Egy"); break;  // Don't forget the "break" after each case!
            case 2:
                System.out.println("Two/Kettő "); break;
            case 3:
                System.out.println("Three /Három"); break;
            case 4:
                System.out.println("Four /Négy"); break;
            case 5:
                System.out.println("Five/ ÖT"); break;
            case 6:
                System.out.println("Six /Hat"); break;
            case 7:
                System.out.println("Seven / Hét"); break;
            case 8:
                System.out.println("Eight / Nyolc"); break;
            case 9:
                System.out.println("Nine/ Kilenc"); break;

            default: System.out.println( "Other number/ Egyéb - nem egyjegyű szám" );
        }
    }
}