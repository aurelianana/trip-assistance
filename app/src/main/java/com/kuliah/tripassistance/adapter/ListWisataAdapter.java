package com.kuliah.tripassistance.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kuliah.tripassistance.R;
import com.kuliah.tripassistance.model.ModelWisata;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.WisataViewHolder> {

    private ArrayList<ModelWisata> listWisataWisata;

    public ListWisataAdapter(ArrayList<ModelWisata> listWisataWisata) {
        this.listWisataWisata = listWisataWisata;
    }

    public interface OnClickItemCallBack {
        void onItemClicked (ModelWisata data);
    }

    public void setOnItemClickCallBack(OnClickItemCallBack callBack) {
        this.callBack = callBack;
    }

    private OnClickItemCallBack callBack;

    @NonNull
    @Override
    public ListWisataAdapter.WisataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_list_wisata,parent,false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListWisataAdapter.WisataViewHolder holder, int position) {
        holder.namaWisata.setText(listWisataWisata.get(position).getNamawisata());
        holder.gambarTempatWisata.setImageResource(listWisataWisata.get(position).getGambartempatwisata());
        holder.namaTempatWisata.setText(listWisataWisata.get(position).getNamatempatwisata());
        holder.descTempatWisata.setText(listWisataWisata.get(position).getDesctempatwisata());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.onItemClicked(listWisataWisata.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisataWisata.size();
    }

    class WisataViewHolder extends RecyclerView.ViewHolder {
        public final TextView namaWisata;
        public final ImageView gambarTempatWisata;
        public final TextView namaTempatWisata;
        public final TextView descTempatWisata;

        public WisataViewHolder(View view) {
            super(view);
            namaWisata = view.findViewById(R.id.tvKategori);
            gambarTempatWisata = view.findViewById(R.id.imgWisata);
            namaTempatWisata = view.findViewById(R.id.tvWisata);
            descTempatWisata = view.findViewById(R.id.tvDetailWisata);
        }
    }

}