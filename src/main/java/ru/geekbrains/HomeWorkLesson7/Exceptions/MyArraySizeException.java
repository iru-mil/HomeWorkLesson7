package ru.geekbrains.HomeWorkLesson7.Exceptions;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Данный массив не 4x4");
    }
}
