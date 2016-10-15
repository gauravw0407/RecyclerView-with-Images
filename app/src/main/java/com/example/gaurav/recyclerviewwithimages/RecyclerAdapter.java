package com.example.gaurav.recyclerviewwithimages;

import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    ArrayList<DataProvider> arrayList = new ArrayList<DataProvider>();

    public RecyclerAdapter(ArrayList<DataProvider> arrayList){

        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitems,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        DataProvider dataProvider = arrayList.get(position);
        holder.img.setImageResource(dataProvider.getImg_res());
        holder.name.setText(dataProvider.getS_name());
        holder.artist.setText(dataProvider.getS_artist());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView name,artist;

        public RecyclerViewHolder(View view){
            super(view);
            img = (ImageView) view.findViewById(R.id.img_res);
            name = (TextView) view.findViewById(R.id.s_name);
            artist = (TextView) view.findViewById(R.id.s_artist);
        }
    }
}
