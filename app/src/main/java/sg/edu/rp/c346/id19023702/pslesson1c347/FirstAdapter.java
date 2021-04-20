package sg.edu.rp.c346.id19023702.pslesson1c347;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstAdapter extends ArrayAdapter<First> {
    private ArrayList<First> types;
    private Context context;
    private TextView textView;

    public FirstAdapter(Context context, int resource, ArrayList<First> types) {
        super(context, resource, types);
        this.types = types;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.types, parent, false);

        First currentType = types.get(position);

        textView = rowView.findViewById(R.id.tvType);
        textView.setText(currentType.getType());

        return rowView;
    }
}
