package com.example.gaurav.recyclerviewwithimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] s_name, s_artist;
    int[] img_res = {R.drawable.ae,R.drawable.darkhaast,R.drawable.galliyan,R.drawable.chorbazaari,R.drawable.mairahoon,R.drawable.phirkabhi,
                    R.drawable.tayhai,R.drawable.teresangyaara,R.drawable.terikhairmangdibbd,R.drawable.tumhiho};
    ArrayList<DataProvider> arrayList = new ArrayList<DataProvider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        s_name = getResources().getStringArray(R.array.names);
        s_artist = getResources().getStringArray(R.array.artists);
        int i = 0;
        for(String name : s_name)
        {
            DataProvider dataProvider = new DataProvider(img_res[i],name,s_artist[i]);
            arrayList.add(dataProvider);
            i++;
        }
        adapter = new RecyclerAdapter(arrayList);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
