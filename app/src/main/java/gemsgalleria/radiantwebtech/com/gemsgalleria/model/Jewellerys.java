package gemsgalleria.radiantwebtech.com.gemsgalleria.model;

/**
 * Created by RADIANT on 1/2/2017.
 */

public class Jewellerys {
    private String type;

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+"]";
    }
}
