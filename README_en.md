# Exercise Sheet: Lambdas and Java Streams API
[Link to German Version](./README.md)

In this exercise sheet, you will learn to use Lambdas and Java Streams APIs to solve various exercises.

## Exercise: Filtering and Mapping with Lambdas and Streams 1 (`NumberStreams`)


### Requirements

1. Your solution should be implemented in a single Java file.
2. Use appropriate variable names, and follow the clean code principles.
3. Your solution should not contain any hardcoded values.
4. You are not allowed to modify the original lists of integers and strings.
5. You should define and use appropriate lambdas to achieve the desired output.

### Tasks

Implement your solution in the `main` method of the `Main` class in the `de.phl.programmingproject.numberstreams` package.

You have a list of integers, a list of strings, and you want to perform some operations on them using lambdas and streams. Your task is to write a Java program that does the following:

1. Create a list of integers with the following values: 2, 15, 24, 29, 36, 44, 52, 61, 68, 80.
   * Use the `Arrays.asList(...)` method to create the list.
2. Use a lambda expression to filter out all even numbers from the list.
3. Use a lambda expression to map each odd number in the list to its square.
4. Use a stream to print out the resulting list of odd squares.
5. Create a new list of integers with the following values: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100.
   * Do **not** simply use the `Arrays.asList(...)` method to create the list, as you will need to modify it later.
     * Instead, you can wrap it using `new ArrayList<>(Arrays.asList(...))` or create an empty list and add the values one by one.
6. Use a stream and lambda expression to check whether all values are dividable by 10 and print out the result.
7. Add an odd number to the second list and repeat task 6.
8. Create a new list of strings with the following values: "apple", "banana", "cherry", "date", "elderberry".
   * Use the `Arrays.asList(...)` method to create the list.
9. Use a lambda expression to filter out all strings that start with the letter "c" from the list. Print the resulting list.
10. Use a lambda expression to map each string in the filtered list to its length.
11. Use a stream to print out the resulting list of string lengths.

## Exercise: Filtering and Mapping with Lambdas and Streams 2

### Requirements

1. Your solution should be implemented in a single Java file.
2. Use appropriate variable names, and follow the clean code principles.
3. Your solution should not contain any hardcoded values.
4. You are not allowed to modify the original list of products.
5. You should define and use appropriate lambdas to achieve the desired output.
6. Use the appropriate operations in the Java Streams API to achieve the desired output.

### Tasks

You have a list of `Product` objects with their names, prices, and categories, and you want to perform some operations on them using lambdas and streams. Your task is to write a Java program that does the following:

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
{ name: "Yogurt", price: 1.50, category: "Dairy" },
]
```

2. Create a stream and use a lambda expression to filter out all products with a price less than 2.00.
3. Use a lambda expression to map each product in the list to a string containing the name and category separated by a colon.
4. Use a stream to print out the resulting list of product strings.
5. Create a new stream and use a lambda expression to filter out all products that are not in the "Dairy" category and have a price greater than or equal to 2.00.
6. Count the products.
