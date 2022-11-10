package com.example.lab6;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyPageViewerAdapter extends FragmentStateAdapter{
    public MyPageViewerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    private static final int ITEM_SIZE = 2;

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return New_Fragment_activity.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return ITEM_SIZE;



    }
}
