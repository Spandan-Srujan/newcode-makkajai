import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundToNearestFiveCents {
	private BigDecimal roundToNearestFiveCents(BigDecimal value) {
        BigDecimal divided = value.multiply(new BigDecimal("20"));
        BigDecimal rounded = new BigDecimal(Math.ceil(divided.doubleValue()));
        return rounded.divide(new BigDecimal("20"), 2, RoundingMode.HALF_UP);
    }
	
	public BigDecimal getRoundToNearestFiveCents(BigDecimal salesTax) {
		return roundToNearestFiveCents(salesTax);
	}
}


