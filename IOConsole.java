 import java.util.*;
 /**
 * @author leon on 03/02/2019.
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private final Scanner scanner;
    private final PrintStream out;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream inputStream, OutputStream outputStream) {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public IOConsole(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) {
        out.format(val, args);
        
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
    out.format(val,args);
    out.format("\n");
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        String s = "";
        for(int i=0;i<args.length;i++)
        {
            s +=(String)(args[i]);
        }
        out.format("%s",s);
        return s;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) {
        Integer num = 0;
        for(Object i : args)
        {
            out.format("%d",i);
            num = (Integer)(i);
        }
        return num;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) {
        out.println(prompt);
        Double res = scanner.nextDouble();
        return res;
        
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */
    public Float getFloatInput(String prompt, Object... args) {
        Float num = 0.0f;
        for(Object i : args)
        {
            if(i.toString().equals("_"))
            {
                throw(new NoSuchElementException());
            }
            num=Float.parseFloat(i.toString());
        }
        return num;
    }
    
    //int Array=new arr[n]

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */
    public Long getLongInput(String prompt, Object... args) {
        out.println(prompt);
        Long res = scanner.nextLong();
        return res;
        
    }
}
