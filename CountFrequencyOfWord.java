//Java program to count the occurrence of any character in given String.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

class CountFrequencyOfWord {
 public static void main(String args[]) {
  try {
   input();
  } catch (IOException ex) {
   Logger.getLogger(CountFrequencyOfWord .class.getName()).log(Level.SEVERE, null, ex);
  }
 }
 static void input() throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter a sentence");
  String s = br.readLine();
  System.out.println("Enter the letter ");
  char a = (char) br.read();
  int len = s.length();
  int c = 0;
  char x;
  for (int i = 0; i < len; i++) {
   x = Character.toLowerCase(s.charAt(i));
   if (x == a)
    c = c + 1;
  }
  System.out.println("Frequency of the letter  " + a + " in the sentence " + s + " is " + c);
 }
}
