package wawa.hackerearth.sandwich.model.vo.data;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChoiceItemsArray {
	 private String id;
	 private OptionsItemPricing optionsItemPricing;
	 private int variantId;
	 private CalorieObj calorieObj;
	 private String name;
     private BigDecimal unitprice;
     private Boolean isMandatory;
     private Boolean isSelected;
     private String imageUrl;
     private String optionAddToCartUrl;
     List<ChoiceItemsArray> choiceItemsArray;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public OptionsItemPricing getOptionsItemPricing() {
		return optionsItemPricing;
	}
	public void setOptionsItemPricing(OptionsItemPricing optionsItemPricing) {
		this.optionsItemPricing = optionsItemPricing;
	}
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int variantId) {
		this.variantId = variantId;
	}
	public CalorieObj getCalorieObj() {
		return calorieObj;
	}
	public void setCalorieObj(CalorieObj calorieObj) {
		this.calorieObj = calorieObj;
	}
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
	public String getOptionAddToCartUrl() {
		return optionAddToCartUrl;
	}
	public void setOptionAddToCartUrl(String optionAddToCartUrl) {
		this.optionAddToCartUrl = optionAddToCartUrl;
	}
	public List<ChoiceItemsArray> getChoiceItemsArray() {
		return choiceItemsArray;
	}
	public void setChoiceItemsArray(List<ChoiceItemsArray> choiceItemsArray) {
		this.choiceItemsArray = choiceItemsArray;
	}
     
}
