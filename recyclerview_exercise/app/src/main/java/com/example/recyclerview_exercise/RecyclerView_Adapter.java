package com.example.recyclerview_exercise;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.ViewHolder> {

    String data1[], data2[], urls[], visit[];
    int images[];
    Context context;

    public RecyclerView_Adapter(Context cont, String[] str1, String[] str2, String[] str3,String[] str4, int[] img) {
            context = cont;
            data1= str1;
            data2 = str2;
            urls = str3;
            visit = str4;
            images = img;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v= inflater.inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
     public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            position = holder.getBindingAdapterPosition();
            holder.txt_view1.setText(data1[position]);
            holder.txt_view2.setText(data2[position]);
            holder.imageV.setImageResource(images[(position)]);


        int finalPosition = position;
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, go_to_second_activity.class);
                    intent.putExtra("data1", data1[finalPosition]);
                    intent.putExtra("data2", data2[finalPosition]);
                    intent.putExtra("images", images[finalPosition]);
                    intent.putExtra("url", urls[finalPosition]);
                    intent.putExtra("link",visit[finalPosition]);
                    intent.putExtra("place", finalPosition);
                    context.startActivity(intent);
                }
            });
        }
     @Override
     public int getItemCount() {
            return images.length;
        }
     public class ViewHolder extends  RecyclerView.ViewHolder implements com.example.recyclerview_exercise.ViewHolder {
            TextView txt_view1, txt_view2;
            ImageView imageV;
            ConstraintLayout mainLayout;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                txt_view1 = itemView.findViewById(R.id.textView_1);
                txt_view2 = itemView.findViewById(R.id.text_view_2);
                imageV = itemView.findViewById(R.id.image_view);
                mainLayout = itemView.findViewById(R.id.mainLayout);

            }

        }

    }




