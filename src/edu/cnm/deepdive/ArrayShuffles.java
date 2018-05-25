package edu.cnm.deepdive;

import java.util.Random;

/**
 * Utility class for shuffling arrays of primitives and generic objects.
 * 
 * @author ivane
 * @version 0.1
 */
public class ArrayShuffles {

  /**
   * Shuffles deck with default source of randomness. Invokes {@link
   * #shuffle(int[], Random)}.
   * 
   * @param deck data array.
   */

  public static void shuffle(int[] deck) {
    shuffle(deck, new Random());
  }
  
  /**
   * Shuffles deck using Fisher-Yates algorithm with specified source of 
   * randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  
    public static void shuffle(int[] deck, Random rng) {
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      int temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link
   * #shuffle(long[], Random)}.
   * 
   * @param deck data array.
   */
  public static void shuffle(long[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm with specified source of 
   * randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  
  
  public static void shuffle(long[] deck, Random rng) {
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      long temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link
   * #shuffle(short[], Random)}.
   * 
   * @param deck data array.
   */

  public static void shuffle(short[] deck) {
    shuffle(deck, new Random());
  }
  
  /**
   * Shuffles deck using Fisher-Yates algorithm with specified source of 
   * randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */

  public static void shuffle(short[] deck, Random rng) {
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      short temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }
 
  /**
   * Shuffles deck with default source of randomness. Invokes {@link
   * #shuffle(boolean[], Random)}.
   * 
   * @param deck data array.
   */

  public static void shuffle(boolean[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm with specified source of 
   * randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */

  public static void shuffle(boolean[] deck, Random rng) {
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      boolean temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }
 
  /**
   * Shuffles deck with default source of randomness. Invokes {@link
   * #shuffle(char[], Random)}.
   * 
   * @param deck data array.
   */

  public static void shuffle(char[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm with specified source of 
   * randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */

  public static void shuffle(char[] deck, Random rng) {
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      char temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

    /**
   * Shuffles deck with default source of randomness. Invokes {@link
   * #shuffle(float[], Random)}.
   * 
   * @param deck data array.
   */
  
  public static void shuffle(float[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm with specified source of 
   * randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  
  public static void shuffle(float[] deck, Random rng) {
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      float temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffles deck with default source of randomness. Invokes {@link
   * #shuffle(double[], Random)}.
   * 
   * @param deck data array.
   */
  
  public static void shuffle(double[] deck) {
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using Fisher-Yates algorithm with specified source of 
   * randomness.
   * 
   * @param deck data array.
   * @param rng source of randomness.
   */
  
  public static void shuffle(double[] deck, Random rng) {
    for(int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      double temp = deck[i]; 
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }
}
