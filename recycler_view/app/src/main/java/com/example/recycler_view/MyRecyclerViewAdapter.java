package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
   // myAdapter
   private Context context;

    public MyRecyclerViewAdapter(Context context, ArrayList<MyAdapter> adapterArrayLst) {
        this.context = context;
        this.adapterArrayList = adapterArrayLst;
    }

    private ArrayList<MyAdapter> adapterArrayList;

    @NonNull
    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View vw = LayoutInflater.from(context).inflate(R.layout.myadapter_item, parent, false);
       return new ViewHolder(vw);
    }
    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.ViewHolder holder, int position) {
        MyAdapter myAdapter = adapterArrayList.get(position);
        holder.SetDetails(myAdapter);
    }

    @Override
    public int getItemCount() {
        return adapterArrayList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName, txtDistance, textGravy, txtDiameter;
        public ViewHolder(@Nullable View itemView){
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtDistance=itemView.findViewById(R.id.txtDistance);
            textGravy=itemView.findViewById(R.id.txtGravity);
            txtDiameter = itemView.findViewById(R.id.txtDiameter);



        }

        void SetDetails(MyAdapter adapter){
            txtName.setText(adapter.getAdapterName());
            txtDistance.setText(String.format(Locale.ENGLISH, "Distnce from sun : %d Million"
            ,adapter.getDistanceFromSun()));
            textGravy.setText(String.format(Locale.ENGLISH,
                    "Surface Gravity : %d N/Kg", adapter.getGravity()));
            txtDiameter.setText(String.format(Locale.ENGLISH,
                    "Diameter: %d KM", adapter.getDiameter()));

        }
    }
}
