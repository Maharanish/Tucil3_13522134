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

public class Astar extends Solver {
    public Astar(List<String> dictionary) {
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

        //Algoritma
        PriorityQueue<Node> astarqueue = new PriorityQueue<>(Comparator.comparingInt(a -> a.level + getMinimumDistance(a.word, keyWord)));
        astarqueue.add(new Node(startWord, 0, null));

        Set<String> visitednode = new HashSet<>();
        visitednode.add(startWord);

        while (!astarqueue.isEmpty()) {
            Node current = astarqueue.poll();
            nodecount++;
            if (current.word.equals(keyWord)) {
                return storePath(current);
            }

            for (String word : dictionary) {
                try{
                    if (!visitednode.contains(word) && isOnediff(current.word, word)) {
                        visitednode.add(word);
                        astarqueue.add(new Node(word, current.level + 1, current));
                    }
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        return Collections.emptyList();
    }
}
