import java.math.BigDecimal;

public class CalculateSalesTax {
	 
	private BigDecimal price;
    private boolean isExempt;
    private boolean isImported;
    
     
     public CalculateSalesTax(BigDecimal price, boolean isExempt, boolean isImported) {
         this.price = price;
         this.isExempt = isExempt;
         this.isImported = isImported;
     }
   
	private BigDecimal calculateSalesTax() {
		BigDecimal salesTax = BigDecimal.ZERO;
        if (!isExempt) {
            salesTax = salesTax.add(price.multiply(new BigDecimal("0.1")));
        }
        if (isImported) {
            salesTax = salesTax.add(price.multiply(new BigDecimal("0.05")));
        }
        RoundToNearestFiveCents roundToNearestFiveCents = new RoundToNearestFiveCents();
        salesTax = roundToNearestFiveCents.getRoundToNearestFiveCents(salesTax);
        return salesTax;
    }
	
	public BigDecimal getSalesTax() {
		return calculateSalesTax();
	}
}
