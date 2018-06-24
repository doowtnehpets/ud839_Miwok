package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by stephentwood on 6/10/18.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int linearLayoutBackgrounColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int linearLayoutBackgroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        this.linearLayoutBackgrounColor = linearLayoutBackgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link currentWord} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the LinearLayout in the list_item.xml layout with the ID words_linear_layout
        FrameLayout wordsFrameLayout = (FrameLayout) listItemView.findViewById(R.id.words_frame_layout);
        // Set the background color of the linear layout
        wordsFrameLayout.setBackgroundColor(ContextCompat.getColor(getContext(), linearLayoutBackgrounColor));

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current currentWord object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current currentWord object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        // Get the ImageView and set it using the resource id from the current word
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.image);
        defaultImageView.setImageResource(currentWord.getmImageResourceId());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
