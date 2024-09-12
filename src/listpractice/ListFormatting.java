package listpractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Assorted List formatting utilities.
 *
 * YOUR TASK: Implement each method and make sure the tests pass.
 */
@SuppressWarnings({"StringConcatenationInLoop", "WeakerAccess"})
public class ListFormatting {
    /**
     * Returns a new list with each item prefixed with the strings "1. ", "2. ", etc.
     */
    public static List<String> numberEachItem(List<String> items) {
        // Here is an implementation that uses a for-each loop, plus a variable to keep track of the
        // count. (Think: why does `itemNum` have to be declared and initialized _outside_ the loop?
        // What happens if you move it inside? Try it!)

        int itemNum = 1;
        List<String> result = new ArrayList<>();
        for (String item : items) {
            result.add(itemNum + ". " + item);
            itemNum++;
        }
        return result;

        // TODO: refactor to use C-style loop (see instructions)
    }

    /**
     * Formats the items in the given list separated by commas and spaces, e.g.
     * "one, two, three".
     */
    public static String formatWithCommas(List<String> items) {
        String result = "";
        boolean isFirst = true;
        for (String item : items) {
            if (isFirst) {
                isFirst = false;
            } else {
                result += ", ";
            }
            result += item;
        }
        return result;

        // TODO: refactor to use Java String helper method (see instructions)
    }

    /**
     * Formats the given items separated by commas and the word “and” so that
     * they could be used in an English sentence. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two and three"
     */
    public static String formatGrammatically(List<String> items) {
        String result = "";
        int itemNum = 0;
        for (String item : items) {
            if (itemNum > 0) {
                if (itemNum == items.size() - 1) {
                    result += " and ";
                } else {
                    result += ", ";
                }
            }
            result += item;
            itemNum++;
        }
        return result;

        // TODO: refactor to use Java String methods (see instructions)
        // TODO: refactor again to use Java C-style for loop (see instructions)
    }

    /**
     * Same as formatGrammatically(), except placing a comma before “and” if
     * there are three or more elements in the list. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two, and three"   // Oxford comma after "two"
     *
     *  HINT: It is tricky to get all the cases right! Again, use the test to
     *        help you.
     */
    public static String formatGrammaticallyWithOxfordComma(List<String> items) {
        return "not implemented yet";
    }
}
