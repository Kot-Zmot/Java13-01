package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepoTest {

    @Test
    void delete() {
        Repo repo = new Repo();

        Book book01 = new Book(01, "Book01", 100, "Ivanov");
        Book book02 = new Book(02, "Book02", 200, "Ivanov");
        Book book03 = new Book(03, "Book03", 300, "Sidorov");
        Smartphone smart01 = new Smartphone(04, "Nokia", 20000, "Nokia inc.");
        Smartphone smart02 = new Smartphone(05, "Huawei", 22000, "Huawei ltd.");

        repo.save(book01);
        repo.save(book02);
        repo.save(book03);
        repo.save(smart01);
        repo.save(smart02);

        repo.delete(01);
        repo.delete(02);

        Product[] actual = repo.findAll();
        Product[] expected = {book03, smart01, smart02};

        Assertions.assertArrayEquals(actual, expected);

    }
}