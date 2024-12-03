package de.tum.in.ase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("/Users/urkocornejo/Library/CloudStorage/OneDrive-TUM/IdeaProjects/" +
                "Personal/AdventOfCode1/src/main/java/de/tum/in/ase/input.txt");
        File testFile = new File("/Users/urkocornejo/Library/CloudStorage/OneDrive-TUM/IdeaProjects/" +
                "Personal/AdventOfCode1/src/main/java/de/tum/in/ase/input.txt");

        Matcher matcher = new Matcher();
        //int total1 = matcher.absFinder(testFile);
        int total2 = matcher.similarityScoreFinder(testFile);
        System.out.println(total2);
    }
}