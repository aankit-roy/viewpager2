package com.example.viewpager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class slider_adapter extends RecyclerView.Adapter<slider_adapter.slider_viewholder>  {
    List<slider_datacontainer> img_list;
    ViewPager2 pager2;

     slider_adapter(List<slider_datacontainer> img_list, ViewPager2 pager2) {
        this.img_list = img_list;
        this.pager2 = pager2;
    }



    @NonNull
    @Override
    public slider_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view=  LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_image_item,parent,false);
        return  new slider_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull slider_viewholder holder, int position) {
        holder.roundedImageView.setImageResource(img_list.get(position).getSlider_image());

    }

    @Override
    public int getItemCount() {
        return img_list.size();
    }

    public static class slider_viewholder extends RecyclerView.ViewHolder{
        RoundedImageView roundedImageView;

        public slider_viewholder(@NonNull View itemView) {
            super(itemView);
            roundedImageView=itemView.findViewById(R.id.image_view);
        }
    }

}


