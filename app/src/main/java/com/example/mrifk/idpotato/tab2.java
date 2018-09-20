package com.example.mrifk.idpotato;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;


public class tab2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab2, container, false);
        /*ImageButton arms = rootView.findViewById(R.id.imageButtonArms);

        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arms.)
            }
        });*/
        final Switch arms = rootView.findViewById(R.id.switchArms);
        final Switch body = rootView.findViewById(R.id.switchBody);
        final Switch ears = rootView.findViewById(R.id.switchEars);
        final Switch eyebrows = rootView.findViewById(R.id.switchEyebrows);
        final Switch eyes = rootView.findViewById(R.id.switchEyes);
        final Switch glasses = rootView.findViewById(R.id.switchGlasses);
        final Switch hat = rootView.findViewById(R.id.switchHat);
        final Switch mouth = rootView.findViewById(R.id.switchMouth);
        final Switch mustache = rootView.findViewById(R.id.switchMustache);
        final Switch nose = rootView.findViewById(R.id.switchNose);
        final Switch shoes = rootView.findViewById(R.id.switchShoes);

        arms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewArms);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });

        body.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewBody);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });

        ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewEars);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });

        eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewEyebrow);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });

        eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewEyes);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });

        glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewGlasses);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });
        hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewHat);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });
        mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewMouth);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });
        mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewMustache);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });
        nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewNose);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });
        shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewShoe);
                if (isChecked) {
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });
        /*toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView imgView = rootView.findViewById(R.id.imageViewBody);
                if (isChecked) {
                    // The toggle is enabled
                    imgView.setVisibility(View.VISIBLE);
                } else {
                    imgView.setVisibility(View.INVISIBLE);
                }
            }
        });*/

        return rootView;
    }

}
/*toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        ImageView imgView = rootView.findViewById(R.id.imageViewBody);
        if (isChecked) {
        // The toggle is enabled
        imgView.setVisibility(View.VISIBLE);
        } else {
        imgView.setVisibility(View.INVISIBLE);
        }
        }
        });*/
