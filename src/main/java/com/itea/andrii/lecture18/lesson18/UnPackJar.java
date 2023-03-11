package com.itea.andrii.lecture18.lesson18;

import java.io.*;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class UnPackJar {
    private File destFile;

    public final static int BUFFER = 2_048;

    public void unpack(String destinationDirectory, String nameJar) {
        var sourceJarFile = new File(nameJar);
        try (JarFile jFile = new JarFile(sourceJarFile)) {
            var unzipDir = new File(destinationDirectory);
            Enumeration<JarEntry> jarFileEntries = jFile.entries();

            while (jarFileEntries.hasMoreElements()) {
                JarEntry entry = jarFileEntries.nextElement();
                String entryname = entry.getName();
                System.out.println("Extracting: " + entryname);
                destFile = new File(unzipDir, entryname);

                File destinationParent = destFile.getParentFile();
                boolean b = destinationParent.mkdirs();

                if (!entry.isDirectory()) {
                    writeFile(jFile, entry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(JarFile jarFile, JarEntry entry) {
        int currentByte;
        var data = new byte[BUFFER];

        try (BufferedInputStream is = new BufferedInputStream(jarFile.getInputStream(entry))) {
            var fos = new FileOutputStream(destFile);
            var dest = new BufferedOutputStream(fos, BUFFER);

            while ((currentByte = is.read(data, 0, BUFFER)) > 0) {
                dest.write(data, 0, currentByte);
            }
            dest.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
