package gemsgalleria.radiantwebtech.com.gemsgalleria.adaptor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;

import java.util.ArrayList;

import gemsgalleria.radiantwebtech.com.gemsgalleria.R;
import gemsgalleria.radiantwebtech.com.gemsgalleria.model.Jewellerys;
import gemsgalleria.radiantwebtech.com.gemsgalleria.model.PurityOfMetal;

/**
 * Created by aphroecs on 12/2/2016.
 */
public class PurityFilterAdaptor extends BaseAdapter {

    ArrayList<PurityOfMetal> list;
    Activity context;

    public PurityFilterAdaptor(Activity context, ArrayList<PurityOfMetal> list) {
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
            convertView = inflater.inflate(R.layout.inf_checkbox_filter_view, null);
        }

        CheckBox chk = (CheckBox) convertView.findViewById(R.id.chkBox);
        chk.setText(list.get(position).getType());

        return convertView;
    }
}
