package m1practice;

import java.util.*;

class LibraryManager {

    // memberId → [outstanding, totalImposed, totalPaid]
    private Map<String, long[]> map = new HashMap<>();

    // ADD <memberId>
    public void addMember(String memberId) {
    if(!map.containsKey(memberId)) {
    	map.put(memberId,new long[]{0,0,0});
    }
    }

    // IMPOSE <memberId> <amount>
    public int  imposeFine(String memberId, long amount) {
    	if(!map.containsKey(memberId)) return 0;
    	
    	long[] mem =map.get(memberId);
    	mem[0] += amount;
    	mem[1]+=amount;
      
    }

    // PAY <memberId> <amount>
    public int payFine(String memberId, long amount) {
    	
  	if(!map.containsKey(memberId)) return 0;
    	
    	long[] mem =map.get(memberId);
    	mem[0] -= amount;
    	mem[2] +=amount;
      
    }
    

    // DETAILS <memberId>
    public void getDetails(String memberId) {
    	if(!map.containsKey(memberId)) {
    		System.out.println("mem not found");
    	}
    	long[] mem =map.get(memberId);
    	System.out,println("")
      
    }

    // Process commands
    public void processCommands(Scanner sc, int N) {

        for (int i = 0; i < N; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String command = parts[0];

            switch (command) {

                case "ADD":
                    addMember(parts[1]);
                    break;

                case "IMPOSE":
                    imposeFine(parts[1], Long.parseLong(parts[2]));
                    break;

                case "PAY":
                    payFine(parts[1], Long.parseLong(parts[2]));
                    break;

                case "DETAILS":
                    getDetails(parts[1]);
                    break;
            }
        }
    }
}

public class Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        LibraryManager manager = new LibraryManager();
        manager.processCommands(sc, N);

        sc.close();
    }
}
