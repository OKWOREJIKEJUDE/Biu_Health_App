package com.e.biuhealth;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter extends PagerAdapter {
    MainActivity mainActivity;
    int[] images;
    int[] accets;
    String[] firstString;
    String[] secondString;
    String[] description;

    public Adapter(MainActivity mainActivity, int[] images, int[] accets, String[] firstString, String[] secondString, String[] description) {
        this.mainActivity = mainActivity;
        this.images = images;
        this.accets = accets;
        this.firstString = firstString;
        this.secondString = secondString;
        this.description = description;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.item_pager_adapter, container,false);

        ImageView myImages;
        RelativeLayout pagerMainLayout;
        ImageView imageaccets;
        TextView headingFF;
        TextView headingSS;
        TextView mydescription;
        //Button myNext;

        myImages = view.findViewById(R.id.pagerGIRLpng);
        pagerMainLayout = view.findViewById(R.id.pagerMainLayout);
        imageaccets = view.findViewById(R.id.imageaccets1);
        headingFF = view.findViewById(R.id.pagerFirst);
        headingSS = view.findViewById(R.id.pagerSecond);
        mydescription = view.findViewById(R.id.pagerThird);
        //myNext = view.findViewById(R.id.myNext);

        myImages.setBackgroundResource(images[position]);
        imageaccets.setBackgroundResource(accets[position]);
        headingFF.setText(firstString[position]);
        headingSS.setText(secondString[position]);
        mydescription.setText(description[position]);
       /* myNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity, GoActivity.class);
                intent.putExtra("position", position);
                mainActivity.startActivity(intent);
                mainActivity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                //WelcomePage welcomePage = new WelcomePage();
                //welcomePage.open();
            }
        });

        */


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {


        container.removeView((View) object);
    }
}
