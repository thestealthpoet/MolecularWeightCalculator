package com.thestealthpoet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MWCalculator {
    public static void main(String[] args) throws IOException {
        String csvFilePath = "C:\\Users\\bryan\\Bryan Coding Workspace\\Molecular Weight Calculator\\ElementSymbolWeight.csv";

        BufferedReader csvReader = new BufferedReader(new FileReader(csvFilePath));
        String line = "";
        while((line = csvReader.readLine()) != null) {
            System.out.println(line);
        }

    }
}
