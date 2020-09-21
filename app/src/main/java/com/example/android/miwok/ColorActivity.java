package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        ArrayList<Word> words = new ArrayList <Word>();


        words.add(new Word("Red","weṭeṭṭi"));
        words.add(new Word("Green","chokokki"));
        words.add(new Word("Brown","ṭakaakki"));
        words.add(new Word("Gray","topoppi"));
        words.add(new Word("Black", "kululli"));
        words.add(new Word("White","kelelli"));
        words.add(new Word("Dusty Yellow","ṭopiisә"));
        words.add(new Word("Mustard Yellow","chiwiiṭә"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listViewWord=(ListView)findViewById(R.id.listview_word);

        listViewWord.setAdapter(adapter);


    }
}