package main;

import inventory.*;

import javax.swing.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product someItem1 = new Product();
        someItem1.productId = 12345;
        someItem1.productName = "Chicken McGibblettes";
        someItem1.price = 30.00;

        Inventory someInv1 = new Inventory();
        someInv1.product = someItem1;
        someInv1.quantity = 8;

        Warehouse someWH1 = new Warehouse();
        someWH1.warehouseId = 54321;
        someWH1.warehouseName = "McStorage";
        someWH1.inventories = "myInventoryList";

//        Inventory entry - obtained via the nested product object in inventory
        System.out.println("Inventory: " + someInv1.product.productName);
//        Product details - details about the product from inventory listed
        System.out.println("Product ID: " + someItem1.productId);
        System.out.println("Product Name: " + someItem1.productName);
        System.out.println("Product Price: $" + someItem1.price);
//        Inventory Quantity
        System.out.println("Quantity: " + someInv1.quantity);
//        Warehouse Info
        System.out.println("Warehouse ID: " + someWH1.warehouseId);
        System.out.println("Warehouse Name: " + someWH1.warehouseName);
        System.out.println("Warehouse Inventory: " + someWH1.inventories);
    }
}