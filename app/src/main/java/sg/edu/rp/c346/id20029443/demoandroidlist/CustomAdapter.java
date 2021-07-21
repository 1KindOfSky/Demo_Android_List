package sg.edu.rp.c346.id20029443.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context partent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context, int resource,ArrayList<AndroidVersion> objects) {
        super(context,resource,objects);

        partent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                partent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.TextViewVersion);

        AndroidVersion currentVersion = versionList.get(position);

        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getVersion());

        return rowView;
    }
}
