import java.math.BigDecimal;




public class ParseItem {

	
	private static Item parseItem(String line) {
    	String name = "";
        String[] parts = line.split(" ");
        int quantity = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length-2; i++) 
        {
         name = name.concat(parts[i] + " ");
        }
        BigDecimal price = new BigDecimal(parts[parts.length-1]);
        boolean isExempt = name.equalsIgnoreCase("book")|| name.equalsIgnoreCase("books") || name.equalsIgnoreCase("food") || name.equalsIgnoreCase("medical") || name.equalsIgnoreCase("chocolates") || name.equalsIgnoreCase("chocolate") || name.equalsIgnoreCase("pills");
        boolean isImported = name.equalsIgnoreCase("imported");
        return new Item(name, quantity, price, isExempt, isImported);
    }
	
	public Item getParseItem(String line){
		return parseItem(line);
		
	}
	
}
