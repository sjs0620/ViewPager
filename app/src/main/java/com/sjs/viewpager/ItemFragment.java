package com.sjs.viewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ItemFragment extends Fragment {

    public static ItemFragment newInstance(int position) {
        Bundle args = new Bundle();
        args.putInt("position",position);

        ItemFragment fragment = new ItemFragment();
        fragment.setArguments(args);
        return  fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageViewItem);
        imageView.setImageResource(getArguments().getInt("position"));

        return view;
    }
}
