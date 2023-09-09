import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence:");
        String sentence = scanner.nextLine();

        Map<Character,Integer> freq = new HashMap<Character,Integer>();

        for(int i=0; i < sentence.length(); i++)
        {
            char c = sentence.charAt(i);

            if(freq.containsKey(c))
            {
                freq.replace(c, freq.get(c) + 1);
            }
            else
            {
                freq.put(c, 1);
            }
        }

        for(Map.Entry<Character,Integer> entry : freq.entrySet())
        {
            System.out.println("Character:"+entry.getKey() + " - " + entry.getValue()   );
        }
    }
}