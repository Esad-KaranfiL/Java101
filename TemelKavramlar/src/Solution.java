import java.util.*;
import java.io.*;



public class Solution{
    public static void main(String []argh)
    {
        int count;
        String line;

        Scanner scan = new Scanner(System.in);
        count = 1;

        while(scan.hasNext()){
            line = scan.nextLine();

            System.out.print(count + " " + line + "\n");
            count++;
        }

    }
}



