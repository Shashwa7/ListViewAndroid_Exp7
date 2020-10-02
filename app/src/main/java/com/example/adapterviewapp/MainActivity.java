package com.example.adapterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView itemLv;
   // private TextView appTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemLv = findViewById(R.id.itemLV);
        //create data
        ArrayList<ItemConstructor> arrayList = new ArrayList<>();
        arrayList.add(new ItemConstructor(R.drawable.img_a,"this"));
        arrayList.add(new ItemConstructor(R.drawable.img_g,"is"));
        arrayList.add(new ItemConstructor(R.drawable.img_c,"a"));
        arrayList.add(new ItemConstructor(R.drawable.img_d,"very"));
        arrayList.add(new ItemConstructor(R.drawable.img_e,"silly"));
        arrayList.add(new ItemConstructor(R.drawable.img_f,"list"));

        //custom adapter
        ProgramAdapter customAdapter = new ProgramAdapter(getApplicationContext(),R.layout.activity_style_each_item,arrayList);

        itemLv.setAdapter(customAdapter);

      // appTv = findViewById(R.id.appTitle);
//      ArrayAdapter<String> itemAdapter =  new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_single_choice,
//                items);
//
//       itemLv.setAdapter(itemAdapter);
//       itemLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//           @Override
//           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//               appTv.setText(items[i]);
//           }
//       });
    }

}