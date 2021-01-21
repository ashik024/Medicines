package com.example.medicines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String URL_DATA = "https://alhasan.dev/interns/services/medicine-list.php";

    private RecyclerView recyclerView;
    private ArrayList<Meds> arrayList;
    private MedsAdapter medsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList= new ArrayList<>();
        
        jasonrequest();
    }

    private void jasonrequest() {

        StringRequest stringRequest= new StringRequest(Request.Method.GET, URL_DATA, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                JSONObject jsonObject = null;
                try {
                    jsonObject = new JSONObject(response);
                    String result = jsonObject.getString("medicines");

                    Log.i("info", result);

                    JSONArray jsonArray = new JSONArray(result);
                    for (int i = 0; i < jsonArray.length(); i++) {

                        JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                        Log.i("info2", jsonObject1.getString("id"));
                        Log.i("info3", jsonObject1.getString("drugs"));
                        Log.i("info4", jsonObject1.getString("indications"));
                        Log.i("info5", jsonObject1.getString("therapeutic_class"));
                        Log.i("info6", jsonObject1.getString("pharmacology"));
                        Log.i("info7", jsonObject1.getString("dosage"));
                        Log.i("info8", jsonObject1.getString("interaction"));
                        Log.i("info9", jsonObject1.getString("contraindications"));
                        Log.i("info10", jsonObject1.getString("side_effects"));
                        Log.i("info11", jsonObject1.getString("pregnancy"));
                        Log.i("info12", jsonObject1.getString("precautions"));
                        Log.i("info13", jsonObject1.getString("storage"));

//                        String id = jsonObject1.getString("id");
                        String name = jsonObject1.getString("drugs");
                        String des1 = jsonObject1.getString("indications");
                        String des2 = jsonObject1.getString("therapeutic_class");
                        String des3 = jsonObject1.getString("pharmacology");
                        String des4 = jsonObject1.getString("dosage");
                        String des5 = jsonObject1.getString("interaction");

                        String des7 = jsonObject1.getString("contraindications");
                        String des8 = jsonObject1.getString("side_effects");
                        String des9 = jsonObject1.getString("pregnancy");
                        String des10 = jsonObject1.getString("precautions");
                        String des11 = jsonObject1.getString("storage");




                        arrayList.add(new Meds(name,des1,des2,des3,des4,des5,des7,des8,des9,des10,des11));


                    }
                    medsAdapter = new MedsAdapter(MainActivity.this,arrayList);
                    recyclerView.setAdapter(medsAdapter);


                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        requestQueue.getCache().clear();
    }

}