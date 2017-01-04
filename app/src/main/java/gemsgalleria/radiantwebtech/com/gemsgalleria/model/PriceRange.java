package gemsgalleria.radiantwebtech.com.gemsgalleria.model;

/**
 * Created by RADIANT on 1/2/2017.
 */

public class PriceRange {
    private int  min;
    private int  max;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [min = "+min+"]";
    }
}

