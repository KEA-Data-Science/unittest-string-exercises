package kea.clbo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CollectionsExercises c = new CollectionsExercises();
        System.out.println(c.matchEnds(new ArrayList<String>(Arrays.asList("aba", "xyz", "aa", "x", "bbb"))));
        System.out.println(c.frontX(new ArrayList<>(Arrays.asList("mix", "xyz", "apple", "xanadu", "aardvark"))));
    }
}
