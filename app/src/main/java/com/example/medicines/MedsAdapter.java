package com.example.medicines;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MedsAdapter extends RecyclerView.Adapter <MedsAdapter.MedsViewholder>{
        private Context mcontext;
        private ArrayList<Meds> meds;

        public MedsAdapter(Context context,ArrayList<Meds>arrayList){

            mcontext = context;
            meds=arrayList;

        }

    @NonNull
    @Override
    public MedsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.med_name_card,parent,false);
        return new MedsViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MedsViewholder holder, int position) {

            Meds currentMeds = meds.get(position);

            String medsName = currentMeds.getMedicines();
            holder.name.setText("Name: "+ medsName);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String des1 = currentMeds.getIndications();
                    String des2 = currentMeds.getTherapeutic_class();
                    String des3 = currentMeds.getPharmacology();
                    String des4 = currentMeds.getDosage();
                    String des5 = currentMeds.getInteraction();
                    String des6 = currentMeds.getContraindications();
                    String des7 = currentMeds.getSide_effects();
                    String des8 = currentMeds.getPregnancy();
                    String des9 = currentMeds.getPrecautions();
                    String des10 = currentMeds.getStorage();

                    Intent intent = new Intent(mcontext,DetailsMed.class);
                    intent.putExtra("medname",medsName);
                    intent.putExtra("medDes1",des1);
                    intent.putExtra("medDes2",des2);
                    intent.putExtra("medDes3",des3);
                    intent.putExtra("medDes4",des4);
                    intent.putExtra("medDes5",des5);
                    intent.putExtra("medDes6",des6);
                    intent.putExtra("medDes7",des7);
                    intent.putExtra("medDes8",des8);
                    intent.putExtra("medDes9",des9);
                    intent.putExtra("medDes10",des10);

                    mcontext.startActivity(intent);




                }
            });





    }

    @Override
    public int getItemCount() {
        return meds.size();
    }

    public class MedsViewholder extends RecyclerView.ViewHolder{

       public TextView name;

        public MedsViewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.medname);
        }
    }
}
