package com.itea.andrii.lecture9.hometask9.task9;

public class Task9 {
    public static void main(String[] args) {
        BlueRayDisk blueRayDisk = new BlueRayDisk();

        blueRayDisk.createFolder("work", "root");
        blueRayDisk.createFolder("home", "root");
        blueRayDisk.createFile("myFile.txt", "root");

        blueRayDisk.createFolder("test", "work");
        blueRayDisk.createFolder("test2", "work");
        blueRayDisk.createFile("myFile2.txt", "work");

        blueRayDisk.createFile("myFile3.txt", "home");

        System.out.println("All files in root directory: ");
        blueRayDisk.showAllFiles();
        System.out.println("---------------");
        System.out.println("All folders in root directory: ");
        blueRayDisk.showAllFolders();

        System.out.println("---------------");

        System.out.println("All folders in work directory: ");
        blueRayDisk.showAllFoldersInFolder("work");
        System.out.println("---------------");
        System.out.println("All files in work directory: ");
        blueRayDisk.showAllFilesInFolder("work");

        System.out.println("--------------");

        System.out.println("All folders in home directory");
        blueRayDisk.showAllFoldersInFolder("home");
        System.out.println("---------------");
        System.out.println("All files in home directory: ");
        blueRayDisk.showAllFilesInFolder("home");
    }
}
