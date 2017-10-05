package Java8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Map;

public class Lamda {
    public static void main(String[] args) {

        /**
        Arrays.asList( "a", "b", "d" ).forEach(e -> {
            System.out.println( e );
            System.out.print( e+1 );
        } );

        Arrays.asList("1","1","3").forEach(e ->{
            System.out.println(e);
        });
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
**/

        // Get the system clock as UTC offset
   //     System.out.println();
        final Clock clock = Clock.systemUTC();
        System.out.println( clock.instant() );
        System.out.println( clock.millis() );


        // Get the local date and local time
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now( clock );

        System.out.println("date" +date );
        System.out.println( "dateformclock"+dateFromClock );

// Get the local date and local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now( clock );

        System.out.println( "time"+time );
        System.out.println( "timeformclock"+timeFromClock );

        Arrays.asList(1,2,3,1,22,33,11).forEach(integer -> System.out.println(integer) );




    }
}
