package edu.usfca.compound;

import static java.lang.System.out;
import static java.lang.String.format;

/*
SPECIFIER | APPLIES TO                                     | OUTPUT                                                                                |
%a        | floating point (except BigDecimal)             | Hex output of floating point number                                                   |
%b        | Any type                                       | “true” if non-null, “false” if null                                                   |
%c        | character                                      | Unicode character                                                                     |
%d        | integer (incl. byte, short, int, long, bigint) | Decimal Integer                                                                       |
%e        | floating point, double                         | decimal number in scientific notation                                                 |
%f        | floating point, double                         | decimal number                                                                        |
%.2f      | floating point, double (2 decimal places)      | decimal number                                                                        |
%g        | floating point, double                         | decimal number, possibly in scientific notation depending on the precision and value. |
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

// Argument Index (%index$)

// Arg1 = 32, Arg2 = "Hello"
// Example : format("%2$s", 32, "Hello"); // prints: "Hello"

public class Strings {
    public static void main(String[] args) {
        out.println("=========== String.format ===========");
        
        out.println( format("name : %s \nage : %d", "joe", 35) );

        out.println("=========== printf (%n to be specicified at end) ===========");
        out.printf("name : %s %nage : %d%n", "Jason",25);

        out.println("=========== Specifying a width / Right Justification ===========");
        out.println(format("||%20d||", 93));                    // ||                  93||

        out.println("=========== Specify Field Length (for String) ===========");
        out.println(format("|%15s|", "Hello World"));           // |    Hello World|

        out.println("=========== Left-justifying within the specified width ===========");
        out.println(format("||%-20d||", 93));                   // ||93                  ||
        out.println(format("|%15s|", "Hello World"));           // |    Hello World|

        out.println("=========== Left-justifying (String) ===========");
        out.println(format("||%-20s||", "Hello World"));        // ||Hello World         ||

        out.println("=========== Pad with zeros (18 zeroes + 2 digits(93)) = 20 digits ===========");
        out.println(format("||%020d||", 93));                   // prints: |00000000000000000093|

        out.println("=========== locale-specific thousands separator ===========");
        out.println(format("%,d", 10000000));         // 10,000,000

        out.println("=========== Octal output ===========");
        out.println(format("%o", 93)); // prints: 135

        out.println("=========== hex numbers with leading “0x“ ===========");
        out.println(format("%#x",93)); // 0x5d

        out.println("=========== hex numbers with 10 leading “0x“ ===========");
        out.println(format("%1$05x",93)); // 0x5d
        // %1 means these flags are for the first argument.
        // $ separates the argument index from the flags
        // 0 padding
        // 5 bit width
        // x would convert to hex and use lowercase letters. 'X' uses uppercase letters
        
    }
}