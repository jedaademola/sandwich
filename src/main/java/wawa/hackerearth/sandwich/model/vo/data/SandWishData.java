package wawa.hackerearth.sandwich.model.vo.data;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SandWishData {
	   private String id;
	   private String name;
	   private BigDecimal totalCalorie;
	   private String addToCartURL;
	   private String productIdInAPI;
	   private String nutritionVal;
	   private Boolean isCustomizeProduct;
	   private BigDecimal defaultCalorie;
	   private UnitPrice unitprice;
	   private String img;
	   private Long quantity;
	   private CalculativePrice calculativeprice;
	   private List<OptionSetsArray> optionSetsArray;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getTotalCalorie() {
		return totalCalorie;
	}
	public void setTotalCalorie(BigDecimal totalCalorie) {
		this.totalCalorie = totalCalorie;
	}
	public String getAddToCartURL() {
		return addToCartURL;
	}
	public void setAddToCartURL(String addToCartURL) {
		this.addToCartURL = addToCartURL;
	}
	public String getProductIdInAPI() {
		return productIdInAPI;
	}
	public void setProductIdInAPI(String productIdInAPI) {
		this.productIdInAPI = productIdInAPI;
	}
	public String getNutritionVal() {
		return nutritionVal;
	}
	public void setNutritionVal(String nutritionVal) {
		this.nutritionVal = nutritionVal;
	}
	public Boolean getIsCustomizeProduct() {
		return isCustomizeProduct;
	}
	public void setIsCustomizeProduct(Boolean isCustomizeProduct) {
		this.isCustomizeProduct = isCustomizeProduct;
	}
	public BigDecimal getDefaultCalorie() {
		return defaultCalorie;
	}
	public void setDefaultCalorie(BigDecimal defaultCalorie) {
		this.defaultCalorie = defaultCalorie;
	}
	public UnitPrice getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(UnitPrice unitprice) {
		this.unitprice = unitprice;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public CalculativePrice getCalculativeprice() {
		return calculativeprice;
	}
	public void setCalculativeprice(CalculativePrice calculativeprice) {
		this.calculativeprice = calculativeprice;
	}
	public List<OptionSetsArray> getOptionSetsArray() {
		return optionSetsArray;
	}
	public void setOptionSetsArray(List<OptionSetsArray> optionSetsArray) {
		this.optionSetsArray = optionSetsArray;
	}

	
}
