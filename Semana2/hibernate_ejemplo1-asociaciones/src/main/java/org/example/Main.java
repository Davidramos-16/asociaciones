package org.example;

import org.example.entity.Cliente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cliente client = new Cliente(1l,"David","ramos","Efectivo");

        System.out.println(client.toString());
    }
}