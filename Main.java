package Lesson_6;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static String Text = "ABCDEFGHIJKLMNOPZ";
    static Random Rand = new Random();

    public static void main(String[] args) throws FileNotFoundException {
        create("1.txt", createString(50));
        create("2.txt", createString(50));
        create("3.txt", createString(0));
        gluing();
        gluing2();
    }

    public static String createString(int len) {
        StringBuilder Build = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            Build.append(Text.charAt(Rand.nextInt(Text.length())));
        }
        return Build.toString();
    }

    public static void create(String fileName, String text) {
        try {
            PrintWriter Print = new PrintWriter(fileName);
            Print.write(text);
            Print.close();
        } catch (FileNotFoundException a) {
            a.printStackTrace();
        }
    }

    public static void gluing() throws FileNotFoundException {
            Scanner sc = new Scanner(new FileInputStream("1.txt"));
            PrintStream ps = new PrintStream(new FileOutputStream("3.txt", true));
            while (sc.hasNext()) {
                ps.println(sc.nextLine());
            }
            sc.close();
            ps.flush();
            ps.close();
    }
    public static void gluing2() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("2.txt"));
        PrintStream ps = new PrintStream(new FileOutputStream("3.txt", true));
        while (sc.hasNext()) {
            ps.println(sc.nextLine());
        }
        sc.close();
        ps.flush();
        ps.close();
    }
   // public static void check() так и не придумал как сделать.... хочу на упроке посмотреть.
}


