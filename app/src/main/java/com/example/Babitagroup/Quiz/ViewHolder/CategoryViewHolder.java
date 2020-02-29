package com.example.Babitagroup.Quiz.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Babitagroup.Quiz.ItemClickListener;
import com.example.Babitagroup.Quiz.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

     public TextView category_name;
     public ImageView category_image;
     public ItemClickListener itemClickListener;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        category_image=itemView.findViewById(R.id.category_image);
        category_name=itemView.findViewById(R.id.category_name);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
          itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
