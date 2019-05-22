package com.sitijuniyanti.uts_10116653.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/*
 * Siti Juniyanti
 * IF13
 * UTS AKB
 * 23 Mei 2019
 *
 *
 * */
import com.sitijuniyanti.uts_10116653.R;

public class ContactFragment extends Fragment implements View.OnClickListener{

    CardView cvTlp, cvEmail, cvIg, cvFb;
    TextView TxvTlp, TxvEmail, TxvIg, TxvFb;

    public ContactFragment() {
        //required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        cvTlp = view.findViewById(R.id.id_telp);
        cvEmail = view.findViewById(R.id.id_email);
        cvFb = view.findViewById(R.id.id_fb);
        cvIg= view.findViewById(R.id.id_ig);
        TxvTlp = view.findViewById(R.id.tlp);
        TxvEmail = view.findViewById(R.id.email);
        TxvFb = view.findViewById(R.id.fb);
        TxvIg= view.findViewById(R.id.ig);

        cvTlp.setOnClickListener(this);
        cvEmail.setOnClickListener(this);
        cvFb.setOnClickListener(this);
        cvIg.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {

    }
}