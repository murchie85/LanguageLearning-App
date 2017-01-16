package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.widget.AppCompatDrawableManager.get;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // adding an array
        ArrayList<String> words = new ArrayList<String>(); // indicates size of array
        /* notice the difference
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        ...
        words[9] = "ten";*/

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

                                                            // rootview = numbersactivity
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView); //cast to LL so we can add child views //cast to LL so we can add child views



        int index = 0;

        while( index < words.size()) {

            TextView wordview = new TextView(this);// create add text views to this linear layout
            wordview.setText(words.get(index)); // worview is child
            rootView.addView(wordview);//add childview to parent( root)

            index ++;
        }



    }
}
