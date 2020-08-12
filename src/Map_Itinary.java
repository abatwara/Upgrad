import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Itinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<String, String>();

        // Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            tickets.put(in.next(), in.next());
            in.nextLine();
        }

        Map<String,String> reverseMap  = new HashMap<>();
        for(String origin : tickets.keySet())
        {
            reverseMap.put(tickets.get(origin),origin);
        }
        String startingPoint = null;
        for(String origin : tickets.keySet())
        {
            if(!reverseMap.keySet().contains(origin))
            {
                startingPoint = origin;
                break;
            }
        }
        if(startingPoint==null)
            System.out.println("Invalid");
        else {
            String temp = startingPoint;
            for (String origin : tickets.keySet()) {
                if (temp != null)
                    System.out.print(temp + " ");
                temp = tickets.get(temp);
            }
            System.out.print(temp);
        }
    }
}