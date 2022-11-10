package com.example.lecture;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.List;


public class MyAdappter  extends RecyclerView.Adapter<MyAdappter.viewHolder> {


    private List<String> myData;
    private LayoutInflater myInflater;
    private ItemClickListener myClickListener;


    public MyAdappter(MainActivity context, List<String> myData){
        this.myData = myData;
        this.myInflater = LayoutInflater.from(context);
    }

    public void setClickListener(ItemClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }
    // allows clicks events to be caught


    public interface  ItemClickListener{
        void onItemClick(View view, int position);
    }

    @NonNull
    @Override
    public MyAdappter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.row_layout, parent, false );

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdappter.viewHolder holder, int position) {
        String name = myData.get(position);
        holder.myTextView.setText(name);
    }

    @Override
    public int getItemCount() {
        return myData.size();

    }
    String getItem(int id){

        return myData.get(id);
        }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView t;

        public viewHolder( @NonNull View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.textView_row_car);
            itemView.setOnClickListener(this);

        }
        @Override
        public void onClick(View view) {
            if (myClickListener != null)
                myClickListener.onItemClick(view, getAdapterPosition());


            }
        }
}

