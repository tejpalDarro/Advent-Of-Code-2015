import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Day1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("Input/inputDay1.txt"));
        String st = null;
        String[] s; 
        while((st=br.readLine()) !=null)
        {
            s = new String[st.length()];
            s = st.split(""); 
            out.println(part1(s));
            out.println(part2(s));

        }
    }
    public static int part1(String[] input)
    {
        int ans = 0;
        for(int i=0; i<input.length; i++)
        {
            if(input[i].equals("("))
                ans++;
            else
                ans--;
            
        }
        return ans;
    }
    public static int part2(String[] input)
    {
        int ans = 0;
        int pos = 0;
        for(int i=0; i<input.length; i++)
        {
            if(input[i].equals("("))
                ans++;
            else{
                ans--;
                if(ans == -1) 
                {
                    pos =  i+1;
                    break;
                }
            }
        }
        return pos;
    }
}
