package com.sitijuniyanti.uts_10116653.view;
/*
 * Siti Juniyanti
 * IF13
 * UTS AKB
 * 23 Mei 2019
 *
 *
 * */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sitijuniyanti.uts_10116653.R;
import com.sitijuniyanti.uts_10116653.model.TemanModel;
import com.sitijuniyanti.uts_10116653.presenter.FriendListAdapter;

import java.util.ArrayList;

public class TemanFragment extends Fragment {

    TemanModel temanModel;
    ListView listView;
    View view;

    private String[] dataNim = {
            "10116666",
            "10116222",
            "10116555",
            "10317333",
            "10116888",
            "10116000"
    };
    private String[] dataNama= {
            "Primaysela",
            "Frangky Michael",
            "Reza",
            "Fitri",
            "Elina",
            "Siska"
    };

    private String[] dataKelas= {
            "IF-1",
            "IF-2",
            "IF-3",
            "TI-4",
            "IF-5",
            "IF-6"
    };
    private String[] dataTelp= {
            "08210000000",
            "08111111111",
            "08122222222",
            "08133333333",
            "08944444444",
            "08955555555"
    };

    private String[] dataIg= {
            "@primayselatuilan",
            "@frangkymichael",
            "@rezasafrii",
            "@nurfitri",
            "@elinaysr",
            "@siskawidiyawati"
    };
    private String[] dataEmail= {
            "primayselatuilan@gmail.com",
            "frangkymichael@gmail.com",
            "rezasafrii@gmail.com",
            "nurfitrii@gmail.com",
            "elinaysr@gmail.com",
            "siskawidiyawati@gmail.com"

    };

    public TemanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_friend, container, false);

        listView = view.findViewById(R.id.list_view);
        initData();
        ArrayList<TemanModel> friendList = new ArrayList<>();
        friendList.add(temanModel);
        FriendListAdapter adapter = new FriendListAdapter(this, R.layout.list_friend,friendList);
        listView.setAdapter(adapter);
        return view;


    }

    private void initData() {
            for (int i=0; i<dataNim.length;i++){
                temanModel = new TemanModel(dataNim[i],dataNama[i],dataKelas[i],dataTelp[i],dataEmail[i],dataIg[i]);
            }


        }




}
