package com.example.player_demo.sevice.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.player_demo.R;

public class PlayerFragment extends Fragment {
    /**
     *
     * @param inflater 加载布局
     * @param container 布局容器
     * @param savedInstanceState null
     * @return 返回加载好的view
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_player,null);
        return v;
    }
}
