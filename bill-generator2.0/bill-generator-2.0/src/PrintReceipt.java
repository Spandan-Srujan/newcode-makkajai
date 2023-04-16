import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;


public class PrintReceipt {
	
	private CalculateSalesTax calculateSalesTax;

	 private static void printReceipt(List<Item> items) {
	        BigDecimal totalSalesTax = BigDecimal.ZERO;
	        BigDecimal totalAmount = BigDecimal.ZERO;
	        BigDecimal totalPrice = BigDecimal.ZERO;
	        for (Item item : items) {
	            BigDecimal itemPrice = item.getPrice();
	            BigDecimal Qunatity = new BigDecimal(item.getQuantity());
	            BigDecimal itemSalesTax = item.getSalesTax();
	            totalPrice =totalPrice =itemPrice.multiply(Qunatity);
	            totalSalesTax = totalSalesTax.add(itemSalesTax);
	            totalAmount = totalAmount.add(totalPrice.add(itemSalesTax));
	            System.out.println(item.getQuantity() + " " + item.getName() + ": " + totalPrice.add(itemSalesTax));
	        }
	        System.out.println("Sales Taxes: " + totalSalesTax.setScale(2, RoundingMode.HALF_UP));
	        System.out.println("Total: " + totalAmount.setScale(2, RoundingMode.HALF_UP));
	        
	    }
	 
	 public void getReceipt(List<Item> items) { 
		 printReceipt(items);
	 }
}
