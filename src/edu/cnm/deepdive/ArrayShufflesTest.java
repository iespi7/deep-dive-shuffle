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
import org.junit.jupiter.api.Test;

class ArrayShufflesTest {
  
  @Test
  void testStringShuffle() throws IOException {
    String[] names = names("students.txt");
    System.out.println(Arrays.toString(names));
    ArrayShuffles.shuffle(names);
    System.out.println(Arrays.toString(names));
    ArrayShuffles.shuffle(names, new SecureRandom());
    System.out.println(Arrays.toString(names));

  }
  
  private String[] names(String filename) throws IOException {
    try (
        InputStream input = new FileInputStream(filename);
        Reader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
    ) {
      List<String> names = new LinkedList<>();
      String name = buffer.readLine();
      while (name != null) {
      name = name.trim();
      if (!name.isEmpty()) {
        names.add(name);
      }
      name = buffer.readLine();
    }
    return names.toArray(new String[names.size()]);
    } 
  }

}
