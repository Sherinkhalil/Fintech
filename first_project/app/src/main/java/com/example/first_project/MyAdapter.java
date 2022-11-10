package com.example.first_project;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<CityModel> cityModels;
    private RecycleViewOnItemClick recycleViewOnItemClick;

    public MyAdapter(List<CityModel> cityModels, RecycleViewOnItemClick recycleViewOnItemClick) {
        this.cityModels = cityModels;
        this.recycleViewOnItemClick = recycleViewOnItemClick;
    }


    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return  cityModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView  image;
        private TextView place_name, description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imgView);
            place_name = itemView.findViewById(R.id.textView_title);
            description = itemView.findViewById(R.id.title_txtV_desc);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recycleViewOnItemClick.onItemClick(getAdapterPosition());

                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recycleViewOnItemClick.onLongItemClick(getItemCount());
                }
            });
        }
    }
}

