package com.f55121034.evo;


import static com.f55121034.evo.R.id.buttongo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.File;

public class Frag2 extends Fragment {
private Button buttoni;
Activity contex;
View view;
public Frag2(){
}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

    contex=getActivity();

        view = inflater.inflate(R.layout.activity_frag2,container,false);
        return view;
    }
    public void onStart(){
    super.onStart();
    Button button = (Button) contex.findViewById(buttongo);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(contex,File2.class);
            startActivity(intent);
        }
    });
    }
}