/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLI;

/**
 *
 * @author Shabrina Maharani
 */
import java.util.*;
import javax.print.PrintException;

public class UCS extends Solver {
    

    public UCS(List<String> dictionary) {
        super(dictionary);
    }

    @Override
    public List<String> searchSolution(String startWord, String keyWord) throws Exception{
        //Exception handler
        if (!dictionary.contains(startWord)){
            throw new PrintException("Your start word is not in the oracle dictionary");
        }else if(!dictionary.contains(keyWord)){
            throw new PrintException("Your end word is not in the oracle dictionary");
        } else if (startWord.length() != keyWord.length()) {
            //System.out.println("beda");
            throw new PrintException("Start word and end word are different lengths!");
        }
        

        System.out.println();
        System.out.println("Finding Nemo? NO ");
        System.out.println("Finding your solution? YES ");
        System.out.println("Please wait! ");
        System.out.println();
        
        //System.out.println("test1");
        //Algoritma
        PriorityQueue<Node> ucsqueue = new PriorityQueue<>(Comparator.comparingInt(a -> a.level));
        ucsqueue.add(new Node(startWord, 0, null));

        Set<String> visitednode = new HashSet<>();
        visitednode.add(startWord);

        //System.out.println("test2");

        while (!ucsqueue.isEmpty()) {
            Node current = ucsqueue.poll();
            nodecount++;
            if (current.word.equals(keyWord)) {
                return storePath(current);
            }

            for (String word : dictionary) {
                if (!visitednode.contains(word) && isOnediff(current.word, word)) {
                    visitednode.add(word);
                    ucsqueue.add(new Node(word, current.level + 1, current));
                }
            }

            //System.out.println("test3");
        }
        return Collections.emptyList();
    }

}
