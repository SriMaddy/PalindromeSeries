import java.io.DataInputStream;
import java.io.IOException;

public class PalindromeTest
{
 public static void main(String[] args) throws IOException
 {
 DataInputStream dis = new DataInputStream(System.in);
 System.out.println("Enter a string to find isPalindrome or not");
 String testString = dis.readLine();
 Palindrome palindrome = new Palindrome();
 if(palindrome.isPalindrome(testString))
  System.out.println(testString + " is palindrome series");
 else
  System.out.println(testString + " is not palindrome series"); 
 }
}