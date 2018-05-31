package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayShufflesTest {
  
  private String[] names;
  
  @BeforeEach
  private void readNames() throws IOException {
    names = names("students.txt");
  }
  
  @Test
  void testStringShuffle() {
      System.out.println(Arrays.toString(names));
      ArrayShuffles.shuffle(names);
      System.out.println(Arrays.toString(names));
      ArrayShuffles.shuffle(names, new SecureRandom());
      System.out.println(Arrays.toString(names));

  }
  
  private String[] names(String filename) throws IOException {
    try (Scanner scanner = new Scanner (new File(filename))) {
      List<String> names = new LinkedList<>();
      while (scanner.hasNextLine()) {
        String name = scanner.nextLine().trim();
        if (!name.isEmpty()) {
          names.add(name);
        }
       }
      return names.toArray(new String[names.size()]);
    } 
  }

}
