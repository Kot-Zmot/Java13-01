package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    @Test
    public void shouldSearchByName() {

        Repo repo = new Repo();
        ProductManager manager = new ProductManager(repo);
        Book book01 = new Book(01, "Book01", 100, "Ivanov");
        Book book02 = new Book(02, "Book02", 200, "Ivanov");
        Book book03 = new Book(03, "Book03", 300, "Sidorov");
        Smartphone smart01 = new Smartphone(04, "Nokia", 20000, "Nokia inc.");
        Smartphone smart02 = new Smartphone(05, "Huawei", 22000, "Huawei ltd.");

        manager.save(book01);
        manager.save(book02);
        manager.save(book03);
        manager.save(smart01);
        manager.save(smart02);

        Product[] actual = manager.searchBy("Book");
        Product[] expected = {book01, book02, book03};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldDeleteByName() {


    }

}