package gemsgalleria.radiantwebtech.com.gemsgalleria.model;

/**
 * Created by RADIANT on 1/2/2017.
 */

public class FilterResponseMeta {
    private Response_meta response_meta;

    private FilterModel data;

    public Response_meta getResponse_meta ()
    {
        return response_meta;
    }

    public void setResponse_meta (Response_meta response_meta)
    {
        this.response_meta = response_meta;
    }

    public FilterModel getData ()
    {
        return data;
    }

    public void setData (FilterModel data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [response_meta = "+response_meta+", data = "+data+"]";
    }
}
