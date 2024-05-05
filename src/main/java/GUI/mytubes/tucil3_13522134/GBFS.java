package GUI.mytubes.tucil3_13522134;

import java.util.*;
import javax.print.PrintException;

public class GBFS extends Solver {
    public GBFS(Set<String> dictionary) {
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

        // System.out.println();
        // System.out.println("Finding Nemo? NO ");
        // System.out.println("Finding your solution? YES ");
        // System.out.println("Please wait! ");
        // System.out.println();

        //Algoritma
        PriorityQueue<Node> gbfsqueue = new PriorityQueue<>(Comparator.comparingInt(a -> getMinimumDistance(a.word, keyWord)+ (int) a.word.charAt(0)));
        gbfsqueue.add(new Node(startWord, 1, null));

        Set<String> visitednode = new HashSet<>();
        visitednode.add(startWord);

        while (!gbfsqueue.isEmpty()) {
            Node current = gbfsqueue.poll();
            gbfsqueue.clear();
            if (current.word.equals(keyWord)) {
                return storePath(current);
            }

            try{
                for (String word : dictionary) {
                    if (!visitednode.contains(word) && isOnediff(current.word, word)) {
                        nodecount++;
                        visitednode.add(word);
                        gbfsqueue.add(new Node(word, current.level + 1, current));
                    }
                }
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            
        }
        return Collections.emptyList();
    }
}
