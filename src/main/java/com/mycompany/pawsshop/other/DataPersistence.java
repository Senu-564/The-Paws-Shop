package com.mycompany.pawsshop.other;

import com.mycompany.pawsshop.data.Item;
import com.mycompany.pawsshop.data.Supplier;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mihin
 */
public class DataPersistence {

    private static final String SUPPLIER_FILE_PATH = "suppliers_data.txt";
    private static final String ITEM_FILE_PATH = "items_data.txt";

    // Save the list of suppliers to a text file
    public static void saveSuppliers(ArrayList<Supplier> suppliers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SUPPLIER_FILE_PATH))) {
            // Write a header line (optional)
            writer.write("SupplierId|Name|Email|Contact");
            writer.newLine();

            // Write each supplier to the file
            for (Supplier supplier : suppliers) {
                writer.write(supplier.getSupplierId() + "|" + supplier.getName() + "|" + supplier.getEmail() + "|" + supplier.getContact());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the list of suppliers from a text file
    public static ArrayList<Supplier> loadSuppliers() {
        ArrayList<Supplier> suppliers = new ArrayList<>();
        File file = new File(SUPPLIER_FILE_PATH);

        // Check if file exists before attempting to load data
        if (!file.exists()) {
            return suppliers; // Return an empty list if the file doesn't exist
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Skip the header line (if any)
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 4) {
                    int supplierId = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String email = parts[2].trim();
                    String contact = parts[3].trim();

                    // Create a new Supplier object and add it to the list
                    suppliers.add(new Supplier(supplierId, name, email, contact));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return suppliers;
    }

    // Save the list of items to a text file
    public static void saveItems(ArrayList<Item> items) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ITEM_FILE_PATH))) {
            // Write a header line (optional)
            writer.write("SupplierName|Category|Price|Payment|TotalItems");
            writer.newLine();

            // Write each item to the file
            for (Item item : items) {
                writer.write(item.getSupplierName() + "|" + item.getCategory() + "|" + item.getPrice() + "|" + item.getPayment() + "|" + item.getTotalItems());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the list of items from a text file
    public static ArrayList<Item> loadItems() {
        ArrayList<Item> items = new ArrayList<>();
        File file = new File(ITEM_FILE_PATH);

        // Check if file exists before attempting to load data
        if (!file.exists()) {
            return items; // Return an empty list if the file doesn't exist
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Skip the header line (if any)
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 5) {
                    String supplierName = parts[0].trim();  // Supplier Name (String)
                    String category = parts[1].trim();      // Category (String)
                    double price = Double.parseDouble(parts[2].trim());  // Item Price (Double)
                    double payment = Double.parseDouble(parts[3].trim()); // Supplier Payment (Double)
                    int totalItems = Integer.parseInt(parts[4].trim());   // Total Items (Int)

                    // Create a new Item object and add it to the list
                    items.add(new Item(supplierName, category, price, payment, totalItems));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return items;
    }
}
