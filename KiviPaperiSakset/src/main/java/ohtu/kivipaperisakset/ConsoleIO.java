package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author tuomo
 */
public class ConsoleIO implements IO {

    Scanner scanner;

    public ConsoleIO() {
        scanner = new Scanner(System.in);
    }
    
    @Override
    public String nextLine() {
        String next = scanner.nextLine();
        return next;
    }

    @Override
    public void println(String s) {
        System.out.println(s);
    }
    
}
