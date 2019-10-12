package wawa.hackerearth.sandwich.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Condiment")
public class Condiment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long condimentSetId;
    private String condimentSetDisplayName;
    
    @ManyToOne
    @JoinColumn(name="orderItems", nullable=false)
    private OrderItems orderItems;

    public Condiment () {
    	
    }
    public Long getId() {
		return id;
	}

    @JsonIgnore
	public void setId(Long id) {
		this.id = id;
	}

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
