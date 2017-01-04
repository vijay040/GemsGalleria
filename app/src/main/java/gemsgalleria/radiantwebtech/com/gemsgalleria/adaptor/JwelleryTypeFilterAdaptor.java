package gemsgalleria.radiantwebtech.com.gemsgalleria.adaptor;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import gemsgalleria.radiantwebtech.com.gemsgalleria.R;
import gemsgalleria.radiantwebtech.com.gemsgalleria.activity.LandingActivity;
import gemsgalleria.radiantwebtech.com.gemsgalleria.fragment.FragmentItems;
import gemsgalleria.radiantwebtech.com.gemsgalleria.model.Category;
import gemsgalleria.radiantwebtech.com.gemsgalleria.model.Data;
import gemsgalleria.radiantwebtech.com.gemsgalleria.model.JewelleryType;
import gemsgalleria.radiantwebtech.com.gemsgalleria.utility.HorizontalListView;

/**
 * Created by aphroecs on 12/2/2016.
 */
public class JwelleryTypeFilterAdaptor extends BaseAdapter {

    ArrayList<JewelleryType> list;
    Activity context;

    public JwelleryTypeFilterAdaptor(Activity context, ArrayList<JewelleryType> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.inf_jweltype_filter, null);
        }


        TextView txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
        txtTitle.setText(list.get(position).getType());
        txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return convertView;
    }
}
