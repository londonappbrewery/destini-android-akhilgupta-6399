package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
TextView mTextView;
Button ans1,ans2;
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView=findViewById(R.id.storyTextView);
        ans1=findViewById(R.id.buttonTop);
        ans2=findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            i++;
            mTextView.setText(R.string.T3_Story);
            ans1.setText(R.string.T3_Ans1);
            ans2.setText(R.string.T3_Ans2);
            ans1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mTextView.setText(R.string.T6_End);
                    ans1.setVisibility(View.INVISIBLE);
                    ans2.setVisibility(View.INVISIBLE);
                }

            });
                ans2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mTextView.setText(R.string.T5_End);
                        ans2.setVisibility(View.INVISIBLE);
                        ans1.setVisibility(View.INVISIBLE);
                    }

                });
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            i++;
            mTextView.setText(R.string.T2_Story);
                ans1.setText(R.string.T2_Ans1);
                ans2.setText(R.string.T2_Ans2);
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(R.string.T4_End);
                ans1.setVisibility(View.INVISIBLE);
                ans2.setVisibility(View.INVISIBLE);}
            });
        ans1.setOnClickListener(new View.OnClickListener() {
                    @Override
        public void onClick(View view) {
               mTextView.setText(R.string.T3_Story);
               ans1.setText(R.string.T3_Ans1);
               ans2.setText(R.string.T3_Ans2);
                        ans1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mTextView.setText(R.string.T6_End);
                                ans1.setVisibility(View.INVISIBLE);
                                ans2.setVisibility(View.INVISIBLE);

                            }
                        });
                        ans2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mTextView.setText(R.string.T5_End);
                                ans1.setVisibility(View.INVISIBLE);
                                ans2.setVisibility(View.INVISIBLE);

                            }
                        });
                        }



        });
            }
        });

    }
}
