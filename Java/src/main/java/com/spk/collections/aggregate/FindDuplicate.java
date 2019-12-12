package com.spk.collections.aggregate;

import java.util.HashSet;
import java.util.Set;
/**
 * @author Praveen
 *
 */
public class FindDuplicate {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();
        uniques.add("Praveen");
        uniques.add("Praveen");
        uniques.add("Vardhan");
        uniques.add("Praveen");
        uniques.add("Thimothy");
        
        for (String a : uniques)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);
        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}