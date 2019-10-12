package wawa.hackerearth.sandwich.model.vo.data;

import java.math.BigDecimal;

public class UnitPrice {

	 private BigDecimal amount;
	 private String currencyCode;
	 private String display;
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	 
	 
}
