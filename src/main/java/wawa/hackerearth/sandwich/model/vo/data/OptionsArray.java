package wawa.hackerearth.sandwich.model.vo.data;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionsArray {
	
	 private String id;
     private String name;
     private BigDecimal unitprice;
     private Boolean isMandatory;
     private Boolean isSelected;
     private String imageUrl;
     private int portionSize;
     private String optionAddToCartUrl;
     private OptionsItemPricing optionsItemPricing;
    // private CalorieObj calorieObj;
     List<ChoiceItemsArray> choiceItemsArray;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}
	public Boolean getIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public Boolean getIsSelected() {
		return isSelected;
	}
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getPortionSize() {
		return portionSize;
	}
	public void setPortionSize(int portionSize) {
		this.portionSize = portionSize;
	}
	public String getOptionAddToCartUrl() {
		return optionAddToCartUrl;
	}
	public void setOptionAddToCartUrl(String optionAddToCartUrl) {
		this.optionAddToCartUrl = optionAddToCartUrl;
	}
	public OptionsItemPricing getOptionsItemPricing() {
		return optionsItemPricing;
	}
	public void setOptionsItemPricing(OptionsItemPricing optionsItemPricing) {
		this.optionsItemPricing = optionsItemPricing;
	}

	/*
	 * public CalorieObj getCalorieObj() { return calorieObj; } public void
	 * setCalorieObj(CalorieObj calorieObj) { this.calorieObj = calorieObj; }
	 */
	public List<ChoiceItemsArray> getChoiceItemsArray() {
		return choiceItemsArray;
	}
	public void setChoiceItemsArray(List<ChoiceItemsArray> choiceItemsArray) {
		this.choiceItemsArray = choiceItemsArray;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
}
