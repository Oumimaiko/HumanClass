package com.example.makoto.tryhumanclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.makoto.tryhumanclass.Human;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //テストです
        Human messi = new Human("リオネル・メッシ",31,"サッカー");
        messi.introduce();
        messi.say();
        messi.think();
    }



}
