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

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.itemViewholder> {

    Context context_115;
    List<item> itemList_115;

    public itemAdapter(Context context, List<item> itemList) {
        this.context_115 = context;
        this.itemList_115 = itemList;
    }

    @NonNull
    @Override
    public itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context_115).inflate(R.layout.row_item,parent,false);
        return new itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewholder holder, int position) {
        holder.image.setImageResource(itemList_115.get(position).getImage());
        holder.title.setText(itemList_115.get(position).getTitle());
        holder.text.setText(itemList_115.get(position).getText());
        holder.bt.setText(itemList_115.get(position).getBt());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context_115, MainActivity.class);
                context_115.startActivities(new Intent[]{intent});
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList_115.size();
    }

    public static final class itemViewholder extends RecyclerView.ViewHolder  {

        ImageView image;
        TextView title,text,bt;

        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title);
            text=itemView.findViewById(R.id.text);
            bt=itemView.findViewById(R.id.button);
        }
    }
}
