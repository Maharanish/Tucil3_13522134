/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLI;

/**
 *
 * @author Shabrina Maharani
 */
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Main {

    public static Set<String> loadDict(String filePath) throws FileNotFoundException {
        Set<String> dictionary = new HashSet<>(); //Penggunaan Set agar kata pada dictionary tidak redundant
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                dictionary.add(scanner.nextLine().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return dictionary;
    }

    public static void main(String[] args) {
        System.out.println("Welcome WordLadder Solver by Shabrina Maharani!");
        System.out.println();
            Scanner scanner = new Scanner(System.in);

            // Input pilihan algoritma
            System.out.println("Choose the algorithm! ");
            System.out.println("1. Uniform Cost Search");
            System.out.println("2. Greedy Best-First Search");
            System.out.println("3. A*");

            int choice = 0;
            boolean isValidChoice = false;
            while (!isValidChoice) {
                // Input pilihan algoritma
                System.out.print("Enter your choice: ");
                String input = scanner.nextLine();
            
                // Validasi pilihan
                try {
                    choice = Integer.parseInt(input);
                    if (choice >= 1 && choice <= 3) {
                        isValidChoice = true;
                    } else{
                        System.out.println("Invalid input! Please enter a valid number.");
                    }
                } catch (NumberFormatException e) {
                }
            }

            // Input kata awal
            System.out.println("Please enter your start word: ");
            String startWord = scanner.nextLine().toLowerCase();

            // Input kata akhir
            System.out.println("Please enter your end word: ");
            String endWord = scanner.nextLine().toLowerCase();

            
            scanner.close();

            try {
                Set<String> dictionary = loadDict("src/main/java/CLI/text/dictionary.txt");
                List<String> solution= new ArrayList<>();;
                UCS ucsSolver = new UCS(dictionary);
                GBFS gbfsSolver = new GBFS(dictionary);
                Astar astarSolver = new Astar(dictionary);
                double startTime =0;
                double endTime =0;

                if(choice == 1){
                    startTime = System.currentTimeMillis();
                    solution = ucsSolver.searchSolution(startWord, endWord);
                    endTime = System.currentTimeMillis();
                } else if(choice ==2){
                    startTime = System.currentTimeMillis();
                    solution = gbfsSolver.searchSolution(startWord, endWord);
                    endTime = System.currentTimeMillis();
                } else{
                    startTime = System.currentTimeMillis();
                    solution = astarSolver.searchSolution(startWord, endWord);
                    endTime = System.currentTimeMillis();
                }

                if (!solution.isEmpty()) {
                    System.out.println("Start Word : " + startWord);
                    System.out.println("End Word : " + endWord);
                    System.out.println("Solution : ");
                    solution.stream().forEach(System.out::println);
                    System.out.println();
                    
                    System.out.println("Nodes generated: " + ucsSolver.getnodeCount());
                    double duration = endTime - startTime;
    
                    if (duration > 60000) {
                        double durationInMinutes = duration / 60000.0;
                        System.out.println("Time Execution: " + durationInMinutes + " minutes");
                    } else if (duration > 1000){
                        double durationInSeconds = duration / 1000.0;
                        System.out.println("Time Execution: " + durationInSeconds + " seconds");
                    } else{
                        System.out.println("Time Execution: " + duration + " miliseconds");
                    }
                } else {
                    System.out.println("No path found from " + startWord + " to " + endWord);
                }

                // Simpan file
                System.out.println("Save file? ");
                System.out.println("1. Yes");
                System.out.println("2. No");

                int save = 0;
                boolean isValidSave = false;
                while (!isValidSave) { 
                    System.out.println("Enter your choice: ");
                    String input = scanner.nextLine();

                    // Validasi pilihan
                    try {
                        save = Integer.parseInt(input); 
                        if (save >= 1 && save <= 2) { 
                            isValidSave = true;
                        } else {
                            System.out.println("Invalid input! Please enter a valid number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                    }
                }

                if (save == 1) {
                    System.out.print("Enter file name: (Example : solution1)");
                    String fileName = scanner.nextLine();
                    if (fileName != null && !fileName.isEmpty() && !solution.isEmpty()) {
                        try {
                            FileWriter writer = new FileWriter("C:/Users/Shabrina Maharani/Documents/Tucil3_13522134 - Copy/test/" + fileName + ".txt");

                            writer.write("Start Word : " + startWord + "\n");
                            writer.write("End Word : " + endWord + "\n"); 
                            writer.write("Solution: \n");

                            for (String word : solution) {
                                writer.write(word + "\n");
                            }

                            writer.close();
                            System.out.println("Solution saved to " + fileName + ".txt");

                        } catch (IOException ex) {
                            System.out.println("Error saving solution to file: " + ex.getMessage());
                        }
                    } else {
                        System.out.println("Please enter a valid file name.");
                    }
                } else {
                    System.out.println("See Ya!.");
                }
               
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
    }
}
