package com.leetcodeproblem.testing;

import java.util.*;

public class CountCountries {
    public List<List<String>> countCountries(List<List<String>> country) {
        HashMap<String, Integer> count = new HashMap<>();
        for (List<String> strings : country) {
            String currentCountry = strings.get(1);
            if (!(currentCountry.equals("-1"))) {
                count.put(currentCountry, count.getOrDefault(currentCountry, 0) + 1);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: count.entrySet()) {
            List<String> tempCount = new ArrayList<>();
            tempCount.add(entry.getKey());
            tempCount.add(String.valueOf(entry.getValue()));
            result.add(tempCount);
        }

        Collections.sort(result, (a, b) -> {
            return a.get(0).compareTo(b.get(0));
        });
        return result;
    }

    public static void main(String[] args) {
        CountCountries cc = new CountCountries();
        List<List<String>> country = new ArrayList<>();
        List<String> element1 = new ArrayList<>();
        element1.add("1");
        element1.add("China");
        List<String> element2 = new ArrayList<>();
        element2.add("2");
        element2.add("-1");
        List<String> element3 = new ArrayList<>();
        element3.add("3");
        element3.add("USA");
        List<String> element4 = new ArrayList<>();
        element4.add("4");
        element4.add("China");
        List<String> element5 = new ArrayList<>();
        element5.add("5");
        element5.add("Germany");
        country.add(element1);
        country.add(element2);
        country.add(element3);
        country.add(element4);
        country.add(element5);
        System.out.println("the input countries are: " + country);
        List<List<String>> result = cc.countCountries(country);
        for (List<String> res: result) {
            System.out.println(res);
        }
        System.out.println("result is: " + result);
    }
}
