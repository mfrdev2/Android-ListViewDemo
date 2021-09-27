package com.frabbi.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListSource extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    String[] pName;
    String[] pDesc;
    final int[] pIMG = {R.drawable.sundarban,R.drawable.chittagong_hill_tracks,R.drawable.srimagal,R.drawable.rangamati,R.drawable.paharpur,R.drawable.lalbag_fort,R.drawable.star_mosque,R.drawable.ahsan_manzil,R.drawable.bisanakandi,R.drawable.jaflong,R.drawable.ratatgul_swamp_forest,R.drawable.shahjalal_dargah,R.drawable.lalakhal,R.drawable.malnicherra_tea_garden,R.drawable.inani_beach,R.drawable.sitakundu,R.drawable.nijhum_island,R.drawable.sajek_valley,R.drawable.patenga_sea_beach,R.drawable.mohasthan_garh,R.drawable.saat_gambuj_mosque,R.drawable.foys_lake,R.drawable.kuakata_sea_beach,R.drawable.sonargaon,R.drawable.chimbuk_hill,R.drawable.mainamati,R.drawable.st_martin_island,R.drawable.small_golden_mosque,R.drawable.coxs_bazar};

    List<PlaceInfo> list;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = new ArrayList<>();
        pName = getResources().getStringArray(R.array.touristPlaces);
        pDesc = getResources().getStringArray(R.array.description_of_tour_place);
        listView = findViewById(R.id.listViewId);
        readyData();
        adapter = new Adapter(getApplicationContext(),R.layout.list_view,list);
        Log.d("CHek","pName :- "+pName.length +" pDesc :- "+pDesc.length+" image:- "+pIMG.length);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);


    }

    void readyData(){
        for (int i = 0; i < pName.length; i++) {
            long x = (i+1);
            list.add(new PlaceInfo(x,pName[i],pDesc[i],pIMG[i]));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (i>=0) {
            Intent intent = new Intent(ListSource.this,Describe.class);
            PlaceInfo placeInfo = (PlaceInfo) adapterView.getAdapter().getItem(i);
            intent.putExtra("obj",placeInfo);
            startActivity(intent);
        }
    }
}