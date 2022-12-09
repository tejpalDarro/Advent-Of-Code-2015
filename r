import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Day1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("Input/inputDay1.txt"));
        List<String[]> list = br.lines()
                            .map(lines  -> lines.split(""))
                            .collect(Collectors.toList());

        for(String[] x: list)
        {
            out.println(Arrays.toString(x));
        }
        int i = 0;

        // for(String x : list)
        // {
        //     if(x.equals("("))
        //         i++
        // }
    }
}
