package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId) {
        super(context, 0, words);
        mColorResourceId =colorResourceId;
    }

    @Override 
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwok_textView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwok_textView.setText(currentWord.getmDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
       defaultTextView.setText(currentWord.getmMiwokTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            // set the imageview to the resource specified in the current word
            imageView.setImageResource((currentWord.getImageResourceId()));
            // make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else  {
            // Otherwise hide the ImageView (Set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        View textContainer =listItemView.findViewById(R.id.text_container);
        // find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        // set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Get the image resource ID from the current AndroidFlavor object and


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
