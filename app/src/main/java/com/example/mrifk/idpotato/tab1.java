package com.example.mrifk.idpotato;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;


public class tab1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);
        // set the spinner data programmatically, from a string array or list

// (1) get a reference to the spinner
        Spinner spinner1 = rootView.findViewById(R.id.simpleSpinner);

// (2) create a simple static list of strings
        final List<String> spinnerArray = new ArrayList<>();
        spinnerArray.add("--Pilih Jabatan--");
        spinnerArray.add("Mahasiswa");
        spinnerArray.add("Dosen");
        spinnerArray.add("Dekan");
        spinnerArray.add("Rektor");

// (3) create an adapter from the list
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_spinner_item,
                spinnerArray
        );

//adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// (4) set the adapter on the spinner
        spinner1.setAdapter(adapter);

        final Button browse = rootView.findViewById(R.id.buttonBrowse);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("image/*");
                startActivity(intent);



            }
        });

        Button save = rootView.findViewById(R.id.buttonsave);
        /*View.OnClickListener mCorkyListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }
        save.setOnClickListener(mCorkyListener);*/
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = rootView.findViewById(R.id.editTextUsername);
                EditText email = rootView.findViewById(R.id.editTextEmail);
                RadioGroup sex = rootView.findViewById(R.id.radioSex);
                Spinner jabatan = rootView.findViewById(R.id.simpleSpinner);

                if (username.getText().toString().isEmpty() || email.getText().toString().isEmpty()
                        || sex.getCheckedRadioButtonId() == -1 || jabatan.getSelectedItem().toString().equals(spinnerArray.get(0))){
                    Snackbar.make(rootView, "Field must not be empty!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } else {
                    username.setText("");
                    email.setText("");
                    sex.clearCheck();
                    jabatan.setSelection(0);

                    Snackbar.make(rootView, "Registrasion Complete!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
        return rootView;
    }


    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Spinner staticSpinner = (Spinner)findViewById(R.id.spinner1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.jabatan,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner.setAdapter(staticAdapter);
*//*
        Spinner dynamicSpinner = (Spinner) findViewById(R.id.dynamic_spinner);

        String[] items = new String[] { "Chai Latte", "Green Tea", "Black Tea" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        dynamicSpinner.setAdapter(adapter);

        dynamicSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });*//*
    }*/
}