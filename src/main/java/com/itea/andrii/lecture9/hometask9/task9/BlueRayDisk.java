package com.itea.andrii.lecture9.hometask9.task9;

import java.util.ArrayList;
import java.util.List;

public class BlueRayDisk {
    private String name = "root";
    private List<File> files = new ArrayList<>();
    private List<Folder> folders = new ArrayList<>();

    private class File {
        private String name;

        public File(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private class Folder {
        private String name;
        private List<Folder> folders = new ArrayList<>();
        private List<File> files = new ArrayList<>();

        public Folder(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }


    public void createFile(String fileName, String folderOfTheFile) {
        if (folderOfTheFile.equals("root")) {
            files.add(new File(fileName));
        } else {
            for (Folder folder : folders) {
                if (folder.name.equals(folderOfTheFile)) {
                    folder.files.add(new File(fileName));
                }
            }
        }
    }

    public void createFolder(String folderName, String parentFolder) {
        if (parentFolder.equals("root")) {
            folders.add(new Folder(folderName));
        } else {
            for (Folder folder : folders) {
                if (folder.name.equals(parentFolder)) {
                    folder.folders.add(new Folder(folderName));
                }
            }
        }
    }

    public void showAllFiles() {
        files.forEach(System.out::println);
    }
    public void showAllFolders() {
        folders.forEach(System.out::println);
    }

    public void showAllFoldersInFolder(String folderName) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                folder.folders.forEach(System.out::println);
            }
        }
    }

    public void showAllFilesInFolder(String folderName) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                folder.files.forEach(System.out::println);
            }
        }
    }

    public String getName() {
        return name;
    }
}
