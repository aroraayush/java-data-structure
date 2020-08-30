package edu.usfca.compound;

import static java.lang.System.out;
import static java.lang.String.format;

/*
SPECIFIER | APPLIES TO                                     | OUTPUT                                                                                |
%a        | floating point (except BigDecimal)             | Hex output of floating point number                                                   |
%b        | Any type                                       | “true” if non-null, “false” if null                                                   |
%c        | character                                      | Unicode character                                                                     |
%d        | integer (incl. byte, short, int, long, bigint) | Decimal Integer                                                                       |
%e        | floating point                                 | decimal number in scientific notation                                                 |
%f        | floating point                                 | decimal number                                                                        |
%g        | floating point                                 | decimal number, possibly in scientific notation depending on the precision and value. |
%h        | any type                                       | Hex String of value from hashCode() method.                                           |
%n        | none                                           | Platform-specific line separator.                                                     |
%o        | integer (incl. byte, short,	                   | Octal number                                                                          |
          | int, long, bigint)                             |                                                                                       |
%s        | any type                                       | String value   
          |                                                |
%t        | Date/Time (incl. long, Calendar,               | %t is the prefix for Date/Time conversions. More formatting                           |
          | Date and TemporalAccessor)                     | flags are needed after this.                                                          |
          |                                                |
%x        | integer (incl. byte, short, int, long, bigint) | Hex string.                                                                           |
*/
public class Strings {
    public static void main(String[] args) {
        out.println("=========== String.format ===========");
        
        out.println( format("name : %s \nage : %d", "joe", 35) );

        out.println("=========== printf (%n to be specicified at end) ===========");
        out.printf("name : %s %nage : %d%n", "Jason",25);
    }
}