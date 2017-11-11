package nhub.first;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 11/7/17.
 */

public class FiatAdapter extends ArrayAdapter<ItemObject> {
    int groupid;
    //Activity context;
    ArrayList<ItemObject> list;
    LayoutInflater inflater;
    private Integer[] imageArray;

    public FiatAdapter(Activity context, int groupid, int id, ArrayList<ItemObject> list) {
        super(context, id, list);
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.groupid = groupid;
        //this.imageArray = imageArray;
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        View itemView = inflater.inflate(groupid, parent, false);

        TextView textView = (TextView) itemView.findViewById(R.id.txt);
        textView.setText(list.get(position).getText());


        ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
        imageView.setImageResource(list.get(position).getImageId());

        return itemView;

    }

    public View getDropDownView (int position, View convertView, ViewGroup parent){
        return getView(position, convertView, parent);
    }
}