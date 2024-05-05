/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLI;

/**
 *
 * @author Shabrina Maharani
 */
public class Node {
    String word;
    int level;
    Node parent;

    public Node(String word, int level, Node parent) {
        this.word = word;
        this.level = level;
        this.parent = parent;
    }
}