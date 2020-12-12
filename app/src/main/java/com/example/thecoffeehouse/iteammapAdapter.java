package com.example.thecoffeehouse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class iteammapAdapter extends RecyclerView.Adapter<iteammapAdapter.itemViewholder> {
    Context context_115;
    List<itemmap> itemList_115;

    public iteammapAdapter(Context context, List<itemmap> itemList) {
        this.context_115 = context;
        this.itemList_115 = itemList;
    }

    @NonNull
    @Override
    public iteammapAdapter.itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context_115).inflate(R.layout.row_mapiteam,parent,false);
        return new iteammapAdapter.itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull iteammapAdapter.itemViewholder holder, int position) {
        holder.image.setImageResource(itemList_115.get(position).getImage());
        holder.title.setText(itemList_115.get(position).getNamestore());
        holder.text.setText(itemList_115.get(position).getMota());
        holder.x.setText( itemList_115.get(position).getX());
        holder.y.setText( itemList_115.get(position).getY());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList_115.size();
    }

    public static final class itemViewholder extends RecyclerView.ViewHolder  {

        ImageView image;
        TextView title,text;
        TextView x,y;

        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image1);
            title=itemView.findViewById(R.id.title1);
            text=itemView.findViewById(R.id.text1);
            x=itemView.findViewById(R.id.x);
            y=itemView.findViewById(R.id.y);
        }
    }
}

