package com.example.adapterviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProgramAdapter extends ArrayAdapter<ItemConstructor> {
    private Context appContext;
    private int itemLayout;   //  the xml layout we created to style each list item
                                                            // dealing with objects of class ItemConstructor
    public ProgramAdapter(@NonNull Context context, int layout, @NonNull ArrayList<ItemConstructor> objects) {
        super(context, layout, objects);
        this.appContext = context;
        this.itemLayout = layout;
    }


    /*
    *  getView() is responsible for rendering out each row
    * Here you define what information shows and where it sits within the ListView.
    * */
    @NonNull
    @Override
    public View getView(int position, @Nullable View rowView, @NonNull ViewGroup generatedLayout) {

        //initializing the inflater obj as per the context passed as an argument
        LayoutInflater layoutInflater = LayoutInflater.from(appContext);

        //layout inflator gonna inflate each rowView as per the layout resource(in this case itemLayout) we pass a parameter.
        rowView = layoutInflater.inflate(itemLayout,generatedLayout,false);
        //generatedLayout:ViewGroup, is basically a view replica of 'itemLayout' file we have created to style each item in our list.
        //generatedLayout decides how our rowView gonna look like.
        //dynamically generated for each item/row.


        ImageView imgView = rowView.findViewById(R.id.imgContainer);
        TextView imgText = rowView.findViewById(R.id.imgText);

        imgView.setImageResource(getItem(position).getImage());
        imgText.setText(getItem(position).getImage_text());

        return rowView;

    }
}

