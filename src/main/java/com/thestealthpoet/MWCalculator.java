package com.thestealthpoet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MWCalculator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String csvFilePath = "C:\\Users\\bryan\\Bryan Coding Workspace\\Molecular Weight Calculator\\ElementSymbolWeight.csv";
        Map<String, String> elementWeightMap = new HashMap<>();
        BufferedReader csvReader = new BufferedReader(new FileReader(csvFilePath));
        String line = "";
        while((line = csvReader.readLine()) != null) {
            String csvline[] = line.split("/t");
            System.out.println(csvline[0]);
        }

            /*for (int i = 1; i < csvline.length-1; i++) {
                String[] csvarray = csvline[i].split(":");
                elementWeightMap.put(csvarray[0], csvarray[1]);

                }System.out.println(elementWeightMap);
            }*/

        }

    }

