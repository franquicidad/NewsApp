package com.example.mac.newsapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 23/08/17.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private ImageView newsImage;
    private TextView Section;
    private TextView Title;
    private TextView author;
    private TextView publishedDate;


    public NewsAdapter(Context context, List<News> objects) {
        super(context, 0, objects);
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= convertView;
        if(v==null){
            LayoutInflater.from(getContext()).inflate(R.layout.news_design,parent,false);
        }

        News newsPosition= getItem(position);

        newsImage=(ImageView)v.findViewById(R.id.news_image);

        if (!TextUtils.isEmpty(newsPosition.getImageLink())) {
            Picasso.with(getContext()).load(newsPosition.getImageLink()).into(newsImage);
        }

        Section = (TextView) v.findViewById(R.id.section);
        Section.setText("Section:" + newsPosition.getSectionName());

        Title=(TextView)v.findViewById(R.id.Title);
        Title.setText("Title:"+newsPosition.getTitle());

        author = (TextView) v.findViewById(R.id.author);
        author.setText("Author:"+newsPosition.getFirstNameAuthor()+newsPosition.getSecondNameAuthor());

        publishedDate = (TextView) v.findViewById(R.id.published_date);
        publishedDate.setText("Published date:" + newsPosition.getPublishedDate());





        return v;
    }
}
