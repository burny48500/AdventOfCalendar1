package de.tum.in.ase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Matcher {
    public Matcher() {
    }
    private List<String> left ;
    private List<String> right;

    private void reader(File inputFile) throws FileNotFoundException {
        left = new ArrayList<>();
        right = new ArrayList<>();
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split("   ");
            left.add(numbers[0]);
            right.add(numbers[1]);
        }
        Collections.sort(left);
        Collections.sort(right);
        System.out.println("Left: "+left);
        System.out.println("Right: "+right);

    }

    public int similarityScoreFinder(File inputFile) throws FileNotFoundException {
        reader(inputFile);
        int frequency;
        int similarity = 0;
        int total = 0;
        /*for (int i = 0; i < left.size(); i++) {
            frequency = Collections.frequency(right, left.get(i));
            similarity = Integer.valueOf(left.get(i)) * frequency;
            total += similarity;
        }
         */

        for (int i = 0; i < left.size(); i++){
            frequency=0;
            for (int j = 0; j < right.size(); j++){
                if (left.get(i).equals(right.get(j))){
                    frequency++;

                }
            }
            similarity = Integer.valueOf(left.get(i)) * frequency;
            total += similarity;
        }

        return total;
    }

    public int absFinder(File inputFile) throws FileNotFoundException {
        reader(inputFile);
        int total = 0;
        for (int i = 0; i < left.size(); i++) {
            int difference = Integer.valueOf(left.get(i)) - Integer.valueOf(right.get(i));
            int abs = Math.abs(difference);

            total += abs;
        }
        return total;
    }


}
