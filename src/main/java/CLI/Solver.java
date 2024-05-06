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

public abstract class Solver {
    protected static int nodecount;
    protected List<String> dictionary;

    public Solver(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    protected boolean isOnediff(String a, String b) throws Exception{
        if (a.length() != b.length()) {
            return false;
        }

        int diffchar = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffchar++;
                if (diffchar > 1) {
                    return false;
                }
            }
        }
        return diffchar == 1; //return true kalau cuma beda 1 karakter
    }

    public abstract List<String> searchSolution(String startWord, String keyWord) throws Exception;

    protected List<String> storePath(Node endNode) {
        LinkedList<String> path = new LinkedList<>();
        Node current = endNode;
        while (current != null) {
            path.addFirst(current.word);
            current = current.parent;
        }
        return path;
    }

    protected int getMinimumDistance(String currWord, String keyWord) {
        int count = 0;
        for (int i = 0; i < currWord.length(); i++) {
            if (currWord.charAt(i) != keyWord.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public int getnodeCount(){
        return nodecount;
    }

}
