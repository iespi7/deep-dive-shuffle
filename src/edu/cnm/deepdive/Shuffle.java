/**
 * 
 */
package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ivane
 *
 */
public class Shuffle {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int[] deck = createDeck(100);
    reveal(deck);
    shuffle(deck);
    reveal(deck);
    
  }
  
  private static int[] createDeck(int size) {
    int[] deck = new int[size];
    for(int i = 0; i < size; i++) {
      deck[i] = i;
    }
    return deck;
  }
  
  private static void shuffle(int[] deck) {
    Random rng = new Random();
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      int temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }
  
  private static void reveal(int[] deck) {
//    for (int value : deck) {
//      System.out.print(value + " ");
//    }
//    System.out.println();
    System.out.println(Arrays.toString(deck));
  }
}
