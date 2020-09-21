/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // find the View that shows the numbers category
        TextView numbers =(TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NumberActivity.class));


            }
        });
        // find the View that shows the Family category
        TextView family =(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FamilyActivity.class));


            }
        });
        // find the View that shows the color category
        TextView color =(TextView)findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ColorActivity.class));


            }
        });
        // find the View that shows the Phrase category
        TextView Phrase =(TextView)findViewById(R.id.phrases);
        Phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PhraseActivity.class));
            }
        });

    }


//    public void openNumbersList(View view) {
//        startActivity(new Intent(getApplicationContext(),NumberActivity.class));
//            }

    public void openColorsList(View view) {
        startActivity(new Intent(getApplicationContext(),ColorActivity.class));
    }
    public void openPhrasesList(View view) {
        startActivity(new Intent(getApplicationContext(),PhraseActivity.class));
    }
}


