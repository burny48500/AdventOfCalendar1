package de.tum.in.ase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Change to Absolute Path
        File inputFile = new File("resources/input.txt");
        File testFile = new File("resources/test.txt");

        Matcher matcher = new Matcher();
        //int total1 = matcher.absFinder(testFile);
        int total2 = matcher.similarityScoreFinder(inputFile);
        System.out.println(total2);
    }
}