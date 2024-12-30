package com.example.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private final Context context;
    int[] image = {R.drawable.darshan,R.drawable.siraj,R.drawable.goa,R.drawable.india,R.drawable.ahesan,
    R.drawable.darshu,R.drawable.taj,R.drawable.mahes,R.drawable.london,R.drawable.beach,R.drawable.dubai,R.drawable.ajmer,
    R.drawable.shubman,R.drawable.srk,R.drawable.rohit};

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return image[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(image[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,340));
        return imageView;
    }
}
