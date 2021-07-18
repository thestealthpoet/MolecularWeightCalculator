package com.thestealthpoet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MWCalculator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String csvFile = "ElementSymbolWeight.csv";
        Map<String, String> elementWeightMap = new TreeMap<>();
        BufferedReader csvReader = new BufferedReader(new FileReader(csvFile));
        String line = "";
        while((line = csvReader.readLine()) != null) {
            String[] csvLine = line.split(",");
            String weightsAsString = csvLine[1];
            System.out.println(weightsAsString);
            //Double[] weightsAsDouble = Arrays.stream(csvLine[1]).map(Double::valueOf).toArray(Double[]::new);
            //elementWeightMap.put(csvLine[0], csvLine[1]);

        } //System.out.println(elementWeightMap);
        //for (Map.Entry<String, String> elementSymbol : elementWeightMap.entrySet()) {
           // elementWeightMap.put(elementSymbol.getKey(), new Double (elementSymbol.getValue()));
        }


        }



