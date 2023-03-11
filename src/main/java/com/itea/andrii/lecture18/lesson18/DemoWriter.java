package com.itea.andrii.lecture18.lesson18;

import java.io.*;

public class DemoWriter {
    public static void main(String[] args) {
        var f = new File("data" + File.separator + "res.txt");

        double[] v = {
                1.10, 1.2, 1.401, 5.01, 6.017, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 18
        };

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            for (double version : v) {
                pw.printf("Java %.2g \n", version);
            }
        } catch (IOException e) {
            System.err.println("Помилка відкриття потоку " + e);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
