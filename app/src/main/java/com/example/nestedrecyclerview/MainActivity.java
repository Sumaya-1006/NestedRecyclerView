package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass> favouriteList;
    ArrayList<ChildModelClass> recentlyWatchedList;
    ArrayList<ChildModelClass> latestList;
    ParentAdapter parentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.rv_parent);
        childModelClassArrayList = new ArrayList<>();
        favouriteList = new ArrayList<>();
        recentlyWatchedList = new ArrayList<>();
        latestList = new ArrayList<>();
        parentModelClassArrayList = new ArrayList<>();

        latestList.add(new ChildModelClass((R.drawable.city)));
        latestList.add(new ChildModelClass((R.drawable.daughters)));
        latestList.add(new ChildModelClass((R.drawable.elizabeth)));
        latestList.add(new ChildModelClass((R.drawable.escape)));
        latestList.add(new ChildModelClass((R.drawable.fallen)));
        latestList.add(new ChildModelClass((R.drawable.fortune)));
        latestList.add(new ChildModelClass((R.drawable.ghost)));
        latestList.add(new ChildModelClass((R.drawable.city)));

        parentModelClassArrayList.add(new ParentModelClass("Latest Movies",latestList));


        recentlyWatchedList.add(new ChildModelClass(R.drawable.kate));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.thief));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.lisa));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.night));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.ghost));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.fortune));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.hamilton));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.city));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.fallen));

        parentModelClassArrayList.add(new ParentModelClass("Recently Watched",recentlyWatchedList));

        favouriteList.add(new ChildModelClass(R.drawable.city));
        favouriteList.add(new ChildModelClass(R.drawable.escape));
        favouriteList.add(new ChildModelClass(R.drawable.ghost));
        favouriteList.add(new ChildModelClass(R.drawable.daughters));
        favouriteList.add(new ChildModelClass(R.drawable.hamilton));


        parentModelClassArrayList.add(new ParentModelClass("Favourites",favouriteList));

        childModelClassArrayList.clear();
        childModelClassArrayList.add(new ChildModelClass(R.drawable.city));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.daughters));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.elizabeth));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.escape));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.fortune));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.fallen));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.ghost));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.night));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.hamilton));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.thief));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.lisa));


        parentModelClassArrayList.add(new ParentModelClass("Recently",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Recently",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Great",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Fine",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Recently",childModelClassArrayList));

        parentAdapter = new ParentAdapter(parentModelClassArrayList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();








    }
}