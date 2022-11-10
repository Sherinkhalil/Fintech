package com.example.lab6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link New_Fragment_activity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class New_Fragment_activity extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters

    private static final String ARG_COUNT = "param1";
    private Integer counter;

    private int[] images= {R.drawable.bibnace, R.drawable.etheruem};
    private int[] texts ={R.string.one, R.string.two};

    // array of data

    public New_Fragment_activity() {
        // Required empty public constructor
    }

    /*
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment New_Fragment_activity.
     */
    // TODO: Rename and change types and number of parameters
    public static New_Fragment_activity newInstance(Integer counter) {
        New_Fragment_activity fragment = new New_Fragment_activity();
        Bundle args = new Bundle();
        args.putInt(ARG_COUNT, counter);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            counter = getArguments().getInt(ARG_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new__activity, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textViewCounter = view.findViewById(R.id.tv_counter);
        ImageView image = view.findViewById(R.id.imageView);
        textViewCounter.setText("Fragment No " + getResources().getString(texts[counter]));
        image.setImageResource(images[counter]);
    }
}