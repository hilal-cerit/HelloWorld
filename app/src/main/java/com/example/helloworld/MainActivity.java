

package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.helloworld.R;

public class MainActivity extends AppCompatActivity {
    TextView opening;
    Button show,hide;
    ImageView image1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opening=(TextView)findViewById(R.id.tvOpening);
        show=(Button) findViewById(R.id.sClick);
        hide=(Button) findViewById(R.id.hClick);
        image1=(ImageView)findViewById(R.id.imageView1);
        show.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                image1.setVisibility(v.VISIBLE);
                show.setVisibility(v.INVISIBLE);
                hide.setVisibility(v.VISIBLE);
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                image1.setVisibility(v.INVISIBLE);
                hide.setVisibility(v.INVISIBLE);
                show.setVisibility(v.VISIBLE);
            }
        });


    }
        }
/* Button myButton = findViewById(R.id.my_button);

View IDs need not be unique throughout the tree, but it is good practice to ensure that they are
at least unique within the part of the tree you are searching.
https://developer.android.com/reference/android/view/View*/


/*Bias in activity_main.xml
    The default when encountering such opposite constraints is to center the widget; but you can tweak the positioning to favor one side over another using the bias attributes:

    layout_constraintHorizontal_bias
    layout_constraintVertical_bias

    Fig. 5 - Centering Positioning with Bias
    For example the following will make the left side with a 30% bias instead of the default 50%, such that the left side will be shorter, with the widget leaning more toward the left side (Fig. 5):
*/
