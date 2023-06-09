package com.example.viewpager2;

import static java.sql.DriverManager.println;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
  private   ViewPager2 viewPager;
  List<slider_datacontainer>list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.view_pager2);
        list=new ArrayList<>();
        list.add(new slider_datacontainer(R.drawable.road1920));
        list.add(new slider_datacontainer(R.drawable.tree));
//        println("something in second branch");
        list.add(new slider_datacontainer(R.drawable.road1920));
        list.add(new slider_datacontainer(R.drawable.tree));
        list.add(new slider_datacontainer(R.drawable.river));
        list.add(new slider_datacontainer(R.drawable.road1920));
        list.add(new slider_datacontainer(R.drawable.tree));
        list.add(new slider_datacontainer(R.drawable.road));
        list.add(new slider_datacontainer(R.drawable.tree));
//        println("change 1 in master branch");
//        list.add(new slider_datacontainer(R.drawable.road1920));
        list.add(new slider_datacontainer(R.drawable.road1920));
//        println(" first something  in third branch" );
//        println("second something in third branch" );
//        println("change in third branch");

        viewPager.setAdapter(new slider_adapter(list,viewPager));
        //for here ,setting some attractive animation to viewpager;
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setOffscreenPageLimit(3);
        viewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);


        CompositePageTransformer compositePageTransformer=new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r=1- Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
           viewPager.setPageTransformer(compositePageTransformer);
           println("some changes in my colone project" );
    }
}