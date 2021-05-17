package com.example.cardlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the statue bar background to transparent

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // setup recycleview vith the adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.imagem4,"Sunset",R.drawable.camila3,2500));
        mlist.add(new item(R.drawable.imagem5,"Beach",R.drawable.camila,3100));
        mlist.add(new item(R.drawable.imagem7,"Sophisticated",R.drawable.antonio,8000));
        mlist.add(new item(R.drawable.imagem3,"Cherry trees from Japan",R.drawable.camila6,10000));
        mlist.add(new item(R.drawable.imagem2,"Franchise",R.drawable.camila2,16000));
        mlist.add(new item(R.drawable.imagem6,"Summer",R.drawable.camila4,4000));
        mlist.add(new item(R.drawable.imagem8,"Downtown",R.drawable.camila5,3100));
        mlist.add(new item(R.drawable.imagem1,"Street Sunset",R.drawable.camilax,8000));
        mlist.add(new item(R.drawable.imagemx,"Intense",R.drawable.camilay,10000));
        mlist.add(new item(R.drawable.imagemy,"Daylight",R.drawable.camilaz,2500));
        mlist.add(new item(R.drawable.imagemz,"Day in downtown",R.drawable.camilayz,16000));
        Adapter adapter = new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
