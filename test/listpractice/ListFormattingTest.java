package listpractice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFormattingTest {

    @Test
    void numberEachItem() {
        assertEquals(
            List.of("1. bread"),
            ListFormatting.numberEachItem(
                List.of("bread")));

        assertEquals(
            List.of("1. bread", "2. garlic", "3. chocolate"),
            ListFormatting.numberEachItem(
                List.of("bread", "garlic", "chocolate")));

        assertEquals(List.of(),   // an empty list
            ListFormatting.numberEachItem(List.of()));
    }

    @Test
    void formatWithCommas() {
        assertEquals(
            "bread",
            ListFormatting.formatWithCommas(
                List.of("bread")));

        assertEquals(
            "bread, garlic, chocolate",
            ListFormatting.formatWithCommas(
                List.of("bread", "garlic", "chocolate")));

        assertEquals("", ListFormatting.formatWithCommas(List.of()));
    }

    @Test
    void formatGrammatically() {
        assertEquals(
            "bread and garlic",
            ListFormatting.formatGrammatically(
                List.of("bread", "garlic")));

        assertEquals(
            "bread, garlic and chocolate",
            ListFormatting.formatGrammatically(
                List.of("bread", "garlic", "chocolate")));

        assertEquals(
            "bread, garlic, chocolate and funny hats",
            ListFormatting.formatGrammatically(
                List.of("bread", "garlic", "chocolate", "funny hats")));

        // https://xkcd.com/851/
        assertEquals(
            "na, na, na and na",
            ListFormatting.formatGrammatically(
                List.of("na", "na", "na", "na")));
    }

    @Test
    @Disabled
    void formatGrammaticallyWithOxfordComma() {
        assertEquals(
            "bread",
            ListFormatting.formatGrammaticallyWithOxfordComma(
                List.of("bread")));

        assertEquals(
            "bread and garlic",
            ListFormatting.formatGrammaticallyWithOxfordComma(
                List.of("bread", "garlic")));

        assertEquals(
            "bread, garlic, and chocolate",
            ListFormatting.formatGrammaticallyWithOxfordComma(
                List.of("bread", "garlic", "chocolate")));

        assertEquals(
            "bread, garlic, chocolate, and funny hats",
            ListFormatting.formatGrammaticallyWithOxfordComma(
                List.of("bread", "garlic", "chocolate", "funny hats")));

        assertEquals(
            "na, na, na, and na",
            ListFormatting.formatGrammaticallyWithOxfordComma(
                List.of("na", "na", "na", "na")));

        assertEquals("", ListFormatting.formatGrammaticallyWithOxfordComma(List.of()));
    }
}