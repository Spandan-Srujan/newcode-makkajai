import java.math.BigDecimal;

public class Item {
        private String name;
        private int quantity;
        private BigDecimal price;
        private boolean isExempt;
        private boolean isImported;
        

        public Item(String name, int quantity, BigDecimal price, boolean isExempt, boolean isImported) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
            this.isExempt = isExempt;
            this.isImported = isImported;
        	}

        public Item() {
	    }

		public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public boolean isExempt() {
        	return isExempt;
        }

        public boolean isImported() {
            return isImported;
        }
        
        public Item parseItem(String line) {
        	ParseItem parseItem = new ParseItem();
        	return parseItem.getParseItem(line);
        }
        
        public BigDecimal getSalesTax() {
        	CalculateSalesTax calculateSalesTax = new CalculateSalesTax(this.price, this.isExempt, this.isImported);
        	return calculateSalesTax.getSalesTax();
        }
}