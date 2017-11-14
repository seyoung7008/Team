package com.example.sy.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class OneActivity extends AppCompatActivity {
    static MyAdapter adapter;
    static String menu1 = "엽기떡볶이";
    static String menu2 = "국물닭발";
    static String menu3 = "오돌뼈";
    static String menu4 = "주먹김밥";
    static String menu5 = "계란찜";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);


        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image11, "엽기떡볶이", "14000원"));
        data.add(new MyItem(R.drawable.image12, "국물닭발", "15000원"));
        data.add(new MyItem(R.drawable.image13, "오돌뼈", "14000원"));
        data.add(new MyItem(R.drawable.image14, "주먹김밥", "2000원 "));
        data.add(new MyItem(R.drawable.image15, "계란찜", "2000원"));

        adapter = new MyAdapter(this, R.layout.item, data);


        //어댑터 연결


    }

    public void onTitleSelected(int i) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("index", i);
        startActivity(intent);
    }


    public void onClick(View view) {
        Intent implicit_intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"));
        startActivity(implicit_intent);
    }


}


