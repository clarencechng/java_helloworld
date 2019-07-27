import java.io.*;
import java.util.Arrays;

public class testfile
{
    public static void main(String[] args) throws Exception 
    {
        File file = new File("/Users/clarencechng/Desktop/input.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
  
        String st;
        String outputStr = ""; 

        while ((st = br.readLine()) != null) 
        {
            System.out.println("Your input:");
            System.out.println(st);
        
            String[] arrOfChars = st.split("");
            
            for (int i = 0; i < arrOfChars.length; i++)
            {

                if (arrOfChars[i].equalsIgnoreCase("a") || arrOfChars[i].equalsIgnoreCase("e") || arrOfChars[i].equalsIgnoreCase("i") || arrOfChars[i].equalsIgnoreCase("o") || arrOfChars[i].equalsIgnoreCase("u"))
                {
                    arrOfChars[i] = arrOfChars[i].toUpperCase();
                }

                else
                {
                    arrOfChars[i] = arrOfChars[i].toLowerCase();
                }
                
                outputStr = outputStr + arrOfChars[i];
            }

            outputStr = outputStr + "July 05";
            System.out.println("Your output:");
            System.out.println(outputStr); 
            
            PrintWriter out = new PrintWriter("/Users/clarencechng/Desktop/output.txt");
            
            out.println(outputStr);
            out.close();
        } 

        br.close();
    }
            
}