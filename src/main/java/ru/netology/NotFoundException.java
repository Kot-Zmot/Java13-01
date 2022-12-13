package ru.netology;

public class NotFoundException extends RuntimeException {

    public NotFoundException(int id) {
        super("Невозможно найти товар с ID:" + id);
    }
}
