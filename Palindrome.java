public class Palindrome
{
 public boolean isPalindrome(String testString)
 {
 int testStringLength = testString.length();
 for(int firstIndex = 0, lastIndex = testStringLength-1; firstIndex <      testStringLength/2; firstIndex++, lastIndex--)
  {
  if(testString.charAt(firstIndex) != testString.charAt(lastIndex))
   return false;
  }
 return true;
 }
}