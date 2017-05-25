package com.example.anaypresent.eventremider;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anaypresent on 25/5/17.
 */

public class Settings extends AppCompatActivity {
    private RecyclerView settings_recyclerView;
    private RecyclerView.LayoutManager settings_layoutManager;
    private RecyclerView.Adapter settings_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        settings_recyclerView = (RecyclerView) findViewById(R.id.settings_recycler_view);
        // in content do not change the layout size of the recycler view
        settings_recyclerView.setHasFixedSize(true);
        // using a linear layout manager
        settings_layoutManager = new LinearLayoutManager(this);
        settings_recyclerView.setLayoutManager(settings_layoutManager);
        //specify an adapter
        settings_adapter = new MyAdapter(myDataset);
            settings_recyclerView.setAdapter(settings_adapter);

    }


}
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private String[] mdataset;
    //provide  a reference to the views in each data item
    // complex data items may need more tha one view per item
    //provide acess to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mtextview;
        public ViewHolder(TextView v){
            super(v);
            mtextview =v;
        }
    }
    // provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset){
        mdataset = myDataset;



    } @Override
    // create new views (invoked by the layout manager )
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                 .inflate(R.layout.my_text_view , parent , false);
        // set  the view size , margins , paddings and Layout margins
        ViewHolder  vh = new ViewHolder(v)
        return vh;
    }
    // replaces the content of the view (invoked by the layout manager)
    // i.e taking the data from the data set and Replacing the content


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       // get the element from the dataset at this postion
        // replaces the content of the view with that view holder
        holder.mtextview.setText(mdataset[position]);

    }


    @Override
    public int getItemCount() {
        return mdataset.length;
    }
}

