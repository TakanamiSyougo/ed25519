package main;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static int cube(int n) {
        return n * n * n;
    }
    public static void main(String[] args) {
        log.info("Startup...");
        System.out.println("Hello World");
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            System.out.println(cube(n));
        }
        log.info("DONE.");
    }
}
