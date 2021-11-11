

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

