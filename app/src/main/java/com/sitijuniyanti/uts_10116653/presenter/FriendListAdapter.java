package com.sitijuniyanti.uts_10116653.presenter;
/*
 * Siti Juniyanti
 * IF13
 * UTS AKB
 * 23 Mei 2019
 *
 *
 * */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sitijuniyanti.uts_10116653.R;
import com.sitijuniyanti.uts_10116653.model.TemanModel;
import com.sitijuniyanti.uts_10116653.view.TemanFragment;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class FriendListAdapter extends ArrayAdapter <TemanModel> {

    private Context mContext;
    private int mResource;

    private TextView TxtNim, TxtNama, TxtKelas, TxtTlp, TxtEmail, TxtIg;
    public FriendListAdapter(Context context, int resource, ArrayList<TemanModel> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }



    @Override
    public View getView( int position, View convertView, ViewGroup parent) {
        String nim = getItem(position).getNim();
        String nama = getItem(position).getNama();
        String kelas = getItem(position).getKelas();
        String tlp = getItem(position).getTlp();
        String email = getItem(position).getEmail();
        String ig = getItem(position).getIg();

        TemanModel temanModel = new TemanModel(nim, nama,kelas, tlp,email,ig);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TxtNim = convertView.findViewById(R.id.list_nim);
        TxtNama = convertView.findViewById(R.id.list_nama);
        TxtKelas = convertView.findViewById(R.id.list_kelas);
        TxtTlp = convertView.findViewById(R.id.list_tlp);
        TxtEmail = convertView.findViewById(R.id.list_email);
        TxtIg = convertView.findViewById(R.id.list_ig);

        TxtNim.setText(nim);
        TxtNama.setText(nama);
        TxtKelas.setText(kelas);
        TxtTlp.setText(tlp);
        TxtEmail.setText(email);
        TxtIg.setText(ig);

        return convertView;


    }

}
