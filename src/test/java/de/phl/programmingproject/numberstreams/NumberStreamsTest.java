package de.phl.programmingproject.numberstreams;

import de.phl.programmingproject.TestUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test class for the Number Streams exercise
 */
public class NumberStreamsTest {

    static String mainMethodContent;
    static String[] lines;

    @BeforeAll
    static void prepare() {
        mainMethodContent = TestUtils.getFileContentForFileInRootOrSrcDirectory("/main/java/de/phl/programmingproject/numberstreams/Main.java");
        lines = mainMethodContent.split("\n");
    }

    @Test
    void task_1_list_of_integers_created() {
        // 1. Create a list of integers with the following values: 2, 15, 24, 29, 36, 44, 52, 61, 68, 80.
        Pattern pattern = Pattern.compile("(?s).*List\\<Integer\\>.*\\=.*Arrays.asList\\(2.*15.*24.*29.*36.*44.*52.*61.*68.*80\\).*");
        for (String line : lines) {
            if (pattern.matcher(line).matches()) {
                return;
            }
        }
        fail("The main method does not contain a list of integers with the values 2, 15, 24, 29, 36, 44, 52, 61, 68, 80. Make sure to use the 'Arrays.asList(...)' method to create the list.");
    }

    @Test
    void task_2_filter_out_even_numbers() {
        // 2. Use a lambda expression to filter out all even numbers from the list.
        Pattern pattern = Pattern.compile("(?s).*\\.stream\\(\\).*filter\\(.*\\-\\>.*\\%\\s*2\\s*(\\=\\=\\s*0|\\!\\=\\s*1).*\\).*");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a stream that filters out all even numbers from the list. Make sure to use the 'filter(...)' method.");
    }

    @Test
    void task_3_map_odd_numbers_to_square() {
        // 3. Use a lambda expression to map each odd number in the list to its square.
        Pattern pattern = Pattern.compile("(?s).*map\\(.*\\-\\>.*(\\b\\w+\\s*\\*\\s*\\w+\\b|Math.pow\\(.*,.*2.*\\)).*");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a stream that maps each odd number in the list to its square. Make sure to use the 'map(...)' method.");

    }

    @Test
    void task_4_print_result() {
        // 4. Use a stream to print out the resulting list of odd squares.

        Pattern pattern = Pattern.compile(".*forEach\\(.*(System\\.out\\.println\\(.*\\)|System\\.out\\:\\:println).*");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a stream that prints out the resulting list of squares. Make sure to use the 'forEach(...)' method.");
    }

    @Test
    void task_5_list_of_integers_created() {
        // 5. Create a new list of integers with the following values: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100.
        Pattern pattern = Pattern.compile(".*(List\\<Integer\\>.*\\=.*Arrays.asList\\(10.*20.*30.*40.*50.*60.*70.*80.*90.*100\\)|for.*\\(int.*i.*\\=.*10).*");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a list of integers with the values 10, 20, 30, 40, 50, 60, 70, 80, 90, 100.");
    }

    @Test
    void task_6_check_divisibility_by_10() {
        // 6. Use a stream and lambda expression to check whether all values are dividable by 10 and print out the result.
        Pattern pattern = Pattern.compile(".*\\.stream\\(\\).*allMatch\\(.*\\-\\>.*\\%.*10.*\\=\\=.*0.*\\).*");
        String output = TestUtils.runActionAndGetSystemOut(() -> {
            Main.main(null);
        });
        assertTrue(output.contains("true"), "The main method does not print the result of task 6, whether all values in the list of task 5 are dividable by 10.");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a stream that checks whether all values are dividable by 10. Make sure to use the 'allMatch(...)' method.");
    }

    @Test
    void task_7_add_odd_number() {
        // 7. Add an odd number to the second list and repeat task 6.
        String output = TestUtils.runActionAndGetSystemOut(() -> {
            Main.main(null);
        });
        assertTrue(output.contains("false"), "The main method does not print the result of task 7, whether all values in the list of task 7 are dividable by 10.");
    }

    @Test
    void task_8_list_of_strings_created() {
        // 8. Create a new list of strings with the following values: "apple", "banana", "cherry", "date", "elderberry".
        Pattern pattern = Pattern.compile(".*List\\<String\\>.*\\=.*Arrays.asList\\(\"apple\".*\"banana\".*\"cherry\".*\"date\".*\"elderberry\"\\).*");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a list of strings with the values \"apple\", \"banana\", \"cherry\", \"date\", \"elderberry\". Make sure to use the 'Arrays.asList(...)' method to create the list.");
    }

    @Test
    void task_9_filter_out_strings_starting_with_c() {
        // 9. Use a lambda expression to filter out all strings that start with the letter "c" from the list.
        String output = TestUtils.runActionAndGetSystemOut(() -> {
            Main.main(null);
        });
        assertTrue(output.contains("[apple, banana, date, elderberry]"), "The main method does not print the result of task 9, the list of fruits that do not start with the letter \"c\".");

        Pattern pattern = Pattern.compile(".*\\.stream\\(\\).*filter\\(.*\\-\\>.*\\.startsWith\\(\"c\"\\).*\\).*");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a stream that filters out all strings that start with the letter \"c\" from the list. Make sure to use the 'filter(...)' method.");
    }

    @Test
    void task_10_map_strings_to_length() {
        // 10. Use a lambda expression to map each string in the list to its length.
        Pattern pattern = Pattern.compile(".*map\\(.*(\\-\\>.*\\.length\\(\\)|String\\:\\:length).*\\).*");
        if (!pattern.matcher(mainMethodContent).find())
            fail("The main method does not contain a stream that maps each string in the list to its length. Make sure to use the 'map(...)' method.");
    }

    @Test
    void task_11_print_result() {
        // 11. Use a stream to print out the resulting list of string lengths.
        String output = TestUtils.runActionAndGetSystemOut(() -> {
            Main.main(null);
        });
        assertTrue(output.contains("5\n6\n4\n10"), "The main method does not print the result of task 11, the lengths of the fruits' Strings. Expected the output to contain: \n\t5\n\t6\n\t4\n\t10");
    }
}
