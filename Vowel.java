import java.util.*;
import java.io.*;
public class VowelOrConsonant
{
  
  public static void main(String args[])throws IOException
  {
    
    String a;
    int i=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          a=br.readLine();
    if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='i')
    System.out.println(a+ " is a Vowel");
else 
System.out.println(a+" is a consonant");
 
   }
   }
