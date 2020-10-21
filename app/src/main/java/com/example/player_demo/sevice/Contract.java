package com.example.player_demo.sevice;

import com.example.player_demo.sevice.view.BaseView;

public interface Contract {
    interface View extends BaseView{

    }
    interface PlayerPresenter{
       void error();
    }
}
