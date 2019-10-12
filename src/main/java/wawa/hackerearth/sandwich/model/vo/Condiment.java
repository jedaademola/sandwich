package wawa.hackerearth.sandwich.model.vo;

import java.io.Serializable;

public class Condiment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long condimentSetId;
    private String condimentSetDisplayName;

    public Long getCondimentSetId() {
        return condimentSetId;
    }

    public void setCondimentSetId(Long condimentSetId) {
        this.condimentSetId = condimentSetId;
    }

    public String getCondimentSetDisplayName() {
        return condimentSetDisplayName;
    }

    public void setCondimentSetDisplayName(String condimentSetDisplayName) {
        this.condimentSetDisplayName = condimentSetDisplayName;
    }
}
