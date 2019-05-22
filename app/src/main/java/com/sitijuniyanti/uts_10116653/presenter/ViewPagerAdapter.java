package com.sitijuniyanti.uts_10116653.presenter;
/*
 * Siti Juniyanti
 * IF13
 * UTS AKB
 * 23 Mei 2019
 *
 *
 * */
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sitijuniyanti.uts_10116653.R;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context context) { this.context = context;}

    /*array
     */

    public int[] data_img = {

    };

    public String[] data_title ={
            "My Profile",
            "My Contact",
            "My Friends"
    };

    public String[] data_desc = {
            "Abcdefghjkl",
            "Abcdefghjkl",
            "Abcdefghjkl"
    };

    @Override
    public int getCount() {return data_img.length;}

    @Override
    public boolean isViewFromObject (@NonNull View view, @NonNull Object o) {return view == o;}

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView wt_image = view.findViewById(R.id.wt_image);
        TextView wt_title = view.findViewById(R.id.wt_title);
        TextView wt_desc = view.findViewById(R.id.wt_desc);

        wt_image.setImageResource(data_img[position]);
        wt_title.setText(data_title[position]);
        wt_desc.setText(data_desc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}