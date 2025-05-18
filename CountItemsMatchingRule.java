package com.ashish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        // Create a List of List<String>
        List<List<String>> items = new ArrayList<>();
        String[][] arrayItems = {
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };

        for (String[] item : arrayItems) {
            items.add(Arrays.asList(item));
        }

        String ruleKey = "color", ruleValue = "silver";
        int count = countMatches(items, ruleKey, ruleValue);
        System.out.println(count); // Expected output: 1
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = switch (ruleKey) {
            case "color" -> 1;
            case "name" -> 2;
            default -> 0; // "type"
        };

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
