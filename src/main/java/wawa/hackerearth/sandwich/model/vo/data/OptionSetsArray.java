package wawa.hackerearth.sandwich.model.vo.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionSetsArray {
	//optionSetsArray
	private String optionSetName;
	private int minAllowed;
	private int maxAllowed;
	private Boolean hasCalorieMultiplier;
	private String id;
	
	private Boolean isSorted;
	private Boolean isAddOn;
	List<ExtraOptionsArray> extraOptionsArray;
	List<OptionsArray> optionsArray;
	public String getOptionSetName() {
		return optionSetName;
	}
	public void setOptionSetName(String optionSetName) {
		this.optionSetName = optionSetName;
	}
	public int getMinAllowed() {
		return minAllowed;
	}
	public void setMinAllowed(int minAllowed) {
		this.minAllowed = minAllowed;
	}
	public int getMaxAllowed() {
		return maxAllowed;
	}
	public void setMaxAllowed(int maxAllowed) {
		this.maxAllowed = maxAllowed;
	}
	public Boolean getHasCalorieMultiplier() {
		return hasCalorieMultiplier;
	}
	public void setHasCalorieMultiplier(Boolean hasCalorieMultiplier) {
		this.hasCalorieMultiplier = hasCalorieMultiplier;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getIsSorted() {
		return isSorted;
	}
	public void setIsSorted(Boolean isSorted) {
		this.isSorted = isSorted;
	}
	public Boolean getIsAddOn() {
		return isAddOn;
	}
	public void setIsAddOn(Boolean isAddOn) {
		this.isAddOn = isAddOn;
	}
	public List<ExtraOptionsArray> getExtraOptionsArray() {
		return extraOptionsArray;
	}
	public void setExtraOptionsArray(List<ExtraOptionsArray> extraOptionsArray) {
		this.extraOptionsArray = extraOptionsArray;
	}
	public List<OptionsArray> getOptionsArray() {
		return optionsArray;
	}
	public void setOptionsArray(List<OptionsArray> optionsArray) {
		this.optionsArray = optionsArray;
	}
	
	

}
