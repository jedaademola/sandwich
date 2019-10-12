package wawa.hackerearth.sandwich.model.vo;

import java.io.Serializable;
import java.util.List;

public class FavouritesGroups implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Sandwich> sandwich;

    public List<Sandwich> getSandwich() {
        return sandwich;
    }

    public void setSandwich(List<Sandwich> sandwich) {
        this.sandwich = sandwich;
    }
}
