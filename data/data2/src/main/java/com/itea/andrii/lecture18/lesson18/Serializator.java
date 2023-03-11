package com.itea.andrii.lecture18.lesson18;

import java.io.*;

public class Serializator {
    public boolean serialization(Student student, String fileName) {
        var flag = false;
        var file = new File(fileName);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(student);
            flag = true;
        } catch (FileNotFoundException e) {
            System.err.println("File can not be created: " + e);
        } catch (NotSerializableException e) {
            System.err.println("Class does not support serialization: " + e);
        } catch (IOException e) {
            System.err.println("General I/O errors: " + e);
        }
        return flag;
    }

    public Student deserialization(String fileName) throws InvalidObjectException {
        var file = new File(fileName);
        try (var objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (Student) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("File for deserialization not exist: " + e);
        } catch (InvalidClassException e) {
            System.err.println("Different class version: " + e);
        } catch (IOException e) {
            System.err.println("General I/O errors: " + e);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not exists: " + e);
        }
        throw new InvalidObjectException("Object did not deserialization");
    }
}
