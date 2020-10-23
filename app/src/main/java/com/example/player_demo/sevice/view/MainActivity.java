package com.example.player_demo.sevice.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.player_demo.R;

public class MainActivity extends AppCompatActivity {
    private PlayerFragment playerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initfragment();
    }

    private void init() {
    }

    /**
     * 以后写代码注意写注释....前段时间的项目找轮子找死我了.....
     * 下面这个东西是initfragment的，就是初始化fragmentmanager和fragmenttransaction的，然后把fc.add.commit就提交了新的fragment
     * 记得new一下新的fragment ！！！注意fragment_container不用findbyid 直接在fc的add方法里面去进行就可以
     */
    private void initfragment() {

        playerFragment = new PlayerFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fc = fm.beginTransaction();
        fc.add(R.id.fragment_container, playerFragment);
        fc.commit();

    }
}