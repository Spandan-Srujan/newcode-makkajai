
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ClientUI {
	
	
	
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please hit enter twice after all items are added" + "\n");
        System.out.println("Please follow sample format '1 book at 9.99' for each entry" + "\n");
        System.out.println("Please enter items for checkout :" + "\n");
        Item item = new Item();
        PrintReceipt printReceipt = new PrintReceipt();
        List<String> checkoutList = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            items.add(item.parseItem(line));
        }
        printReceipt.getReceipt(items);
    }
}

