package com.example.android.miwok;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ArrayList<Word> words = new ArrayList <Word>();


        words.add(new Word("One","lutti"));
        words.add(new Word("Two","otiiko"));
        words.add(new Word("Three","tolookosu"));
        words.add(new Word("Four","oyyisa"));
        words.add(new Word("Five","massokka"));
        words.add(new Word("Six","temmokka"));
        words.add(new Word("Seven","kenekaku"));
        words.add(new Word("Eight","kawinta"));
        words.add(new Word("Nine","wo'e"));
        words.add(new Word("Ten","na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

       ListView listViewWord=(ListView)findViewById(R.id.listview_word);

        listViewWord.setAdapter(adapter);

    }
}

