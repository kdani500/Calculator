package com.example.kshitijdani.calculator2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.content.Intent;


public class History2 extends AppCompatActivity{

//    Intent intent = getIntent();
//    Bundle args = intent.getBundleExtra("BUNDLE");
//    ArrayList<String> arr = (ArrayList<String>) args.getSerializable("ARRAYLIST");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);

        ArrayList<String> ee= new ArrayList<>();
        ee = getIntent().getStringArrayListExtra("BUNDLE");

        final ListView listview = (ListView) findViewById(R.id.listview);

        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, ee);
        listview.setAdapter(adapter);


    }

    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }
    }
}
