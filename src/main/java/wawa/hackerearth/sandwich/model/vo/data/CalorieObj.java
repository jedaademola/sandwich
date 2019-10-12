package wawa.hackerearth.sandwich.model.vo.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalorieObj {
	private int multiplier;
	private int initialCalValue;
	private int calculatedCalValue;
	public int getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	public int getInitialCalValue() {
		return initialCalValue;
	}
	public void setInitialCalValue(int initialCalValue) {
		this.initialCalValue = initialCalValue;
	}
	public int getCalculatedCalValue() {
		return calculatedCalValue;
	}
	public void setCalculatedCalValue(int calculatedCalValue) {
		this.calculatedCalValue = calculatedCalValue;
	}
	
}
