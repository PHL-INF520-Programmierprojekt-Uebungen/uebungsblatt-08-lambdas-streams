package de.phl.programmingproject.products;

import de.phl.programmingproject.TestUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test class for the Products exercise.
 */
public class ProductsTest {

    static String mainMethodContent;

    static String[] lines;

    @BeforeAll
    static void prepare() {
        mainMethodContent = TestUtils.getFileContentForFileInRootOrSrcDirectory("/main/java/de/phl/programmingproject/products/Main.java");
        lines = mainMethodContent.split("\n");
    }

    @Test
    void task_1_list_of_products_created() {
        /**
         1. Create a list of `Product` objects with the following values:

         ``` Java
         [
         { name: "Apple", price: 1.20, category: "Fruit" },
         { name: "Banana", price: 0.80, category: "Fruit" },
         { name: "Orange", price: 1.00, category: "Fruit" },
         { name: "Carrot", price: 0.50, category: "Vegetable" },
         { name: "Broccoli", price: 1.80, category: "Vegetable" },
         { name: "Chicken", price: 3.50, category: "Meat" },
         { name: "Beef", price: 5.20, category: "Meat" },
         { name: "Salmon", price: 6.30, category: "Fish" },
         { name: "Tuna", price: 4.80, category: "Fish" },
         { name: "Milk", price: 2.00, category: "Dairy" },
         { name: "Cheese", price: 3.40, category: "Dairy" },
         { name: "Yoghurt", price: 1.50, category: "Dairy" },
         ]
         */

        assertTrue(mainMethodContent.contains("new Product(\"Apple\", 1.2, \"Fruit\")"), "The main method does instantiates an \"Apple\" that costs 1.20 with category \"Fruit\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Banana\", 0.8, \"Fruit\")"), "The main method does instantiates an \"Banana\" that costs 0.80 with category \"Fruit\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Orange\", 1.0, \"Fruit\")"), "The main method does instantiates an \"Orange\" that costs 1.00 with category \"Fruit\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Carrot\", 0.5, \"Vegetable\")"), "The main method does instantiates an \"Carrot\" that costs 0.50 with category \"Vegetable\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Broccoli\", 1.8, \"Vegetable\")"), "The main method does instantiates an \"Broccoli\" that costs 1.80 with category \"Vegetable\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Chicken\", 3.5, \"Meat\")"), "The main method does instantiates an \"Chicken\" that costs 3.50 with category \"Meat\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Beef\", 5.2, \"Meat\")"), "The main method does instantiates an \"Beef\" that costs 5.20 with category \"Meat\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Salmon\", 6.3, \"Fish\")"), "The main method does instantiates an \"Salmon\" that costs 6.30 with category \"Fish\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Tuna\", 4.8, \"Fish\")"), "The main method does instantiates an \"Tuna\" that costs 4.80 with category \"Fish\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Milk\", 2.0, \"Dairy\")"), "The main method does instantiates an \"Milk\" that costs 2.00 with category \"Dairy\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Cheese\", 3.4, \"Dairy\")"), "The main method does instantiates an \"Cheese\" that costs 3.40 with category \"Dairy\". Make sure to use the 'new Product(...)' method to create the list.");
        assertTrue(mainMethodContent.contains("new Product(\"Yoghurt\", 1.5, \"Dairy\")"), "The main method does instantiates an \"Yogurt\" that costs 1.50 with category \"Dairy\". Make sure to use the 'new Product(...)' method to create the list.");
    }

    @Test
    void task_2_filter_out_expensive_products() {
        // 2. Create a stream and use a lambda expression to filter out all products with a price less than 2.00.
        Pattern pattern = Pattern.compile(".*\\.stream\\(\\).*filter\\(.*\\-\\>.*\\.getPrice\\(\\)\\s*\\>\\=\\s*2\\.0.*\\).*");
        for (String line : lines) {
            if (pattern.matcher(line).matches()) {
                return;
            }
        }
        throw new AssertionError("The main method does not contain a stream that filters out all products that cost more than 2.00. Make sure to use the 'filter(...)' method.");
    }

    @Test
    void task_3_map_products_to_string() {
        // 3. Use a lambda expression to map each product in the list to a string containing the name and category separated by a colon.
        Pattern pattern = Pattern.compile(".*map\\(.*\\.getName\\(\\).*\\.getCategory\\(\\).*\\).*");
              for (String line : lines) {
            if (pattern.matcher(line).matches()) {
                return;
            }
        }
        fail("The main method does not contain a stream that maps each product in the list to a string that contains the name and the category of the product, separated by a colon. Make sure to use the 'map(...)' method.");
    }

    @Test
    void task_4_print_result() {
        // 4. Use a stream to print out the resulting list of strings.
        Pattern pattern = Pattern.compile(".*forEach\\(.*(System\\.out\\.println\\(.*\\)|System\\.out\\:\\:println).*");
        for (String line : lines) {
            if (pattern.matcher(line).matches()) {
                return;
            }
        }
        fail("The main method does not contain a stream that prints out the resulting list of strings. Make sure to use the 'forEach(...)' method.");
    }

    @Test
    void task_5_count_cheap_dairy_products() {
        // 5. Create a new stream and use a lambda expression to filter out all products that are not in the "Dairy" category and have a price greater than or equal to 2.00.
        Pattern pattern = Pattern.compile(".*\\.stream\\(\\).*filter\\(.*(\\.getCategory.*\"Dairy\".*\\.getPrice.*\\<.*2.*|\\.getPrice.*\\<.*2.*\\.getCategory.*\"Dairy\".*)\\).*");
        for (String line : lines) {
            if (pattern.matcher(line).matches()) {
                return;
            }
        }
        fail("The main method does not contain a stream that counts the amount of products that cost less than 2.00 and have the category \"Dairy\".");
    }

    @Test
    void task_6_print_result() {
        // 6. Count the products.
        assertTrue(mainMethodContent.contains(".count("), "The main method does not contain a stream that counts the amount of products that cost less than 2.00 and have the category \"Dairy\". Make sure to use the 'count(...)' method.");
        String output = TestUtils.runActionAndGetSystemOut(() -> {
            Main.main(null);
        });
        assertTrue(output.contains("1"), "The main method does not print the result of task 6, the amount of products that cost less than 2.00 and have the category \"Dairy\".");
    }
}
