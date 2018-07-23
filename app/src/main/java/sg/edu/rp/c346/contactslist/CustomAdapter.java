package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16039013 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_Content;
    int layout_id;
    ArrayList<ContactItems> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactItems> objects) {
        super(context, resource, objects);

        parent_Content = context;
        layout_id = resource;
        contactList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_Content.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvPhoneC = rowView.findViewById(R.id.textViewPhoneC);
        TextView tvPhoneN = rowView.findViewById(R.id.textViewPhoneN);

        ContactItems currentItem = contactList.get(position);

        String name = currentItem.getName();
        String phoneC = currentItem.getPhoneC();
        int phoneN = currentItem.getPhoneN();

        tvName.setText(name);
        tvPhoneC.setText(phoneC);
        tvPhoneN.setText(phoneN+"");

        return  rowView;

    }
}
