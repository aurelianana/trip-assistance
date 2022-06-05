package com.kuliah.tripassistance.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kuliah.tripassistance.R;
import com.kuliah.tripassistance.model.ModelMain;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ListMainAdapter extends RecyclerView.Adapter<ListMainAdapter.ListViewHolder> {
    private ArrayList<ModelMain> listLayanan;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListMainAdapter(ArrayList<ModelMain> list) {
        this.listLayanan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_main, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        ModelMain modelMain = listLayanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(modelMain.getIcon_layanan())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgMainData);
        holder.tvMainData.setText(modelMain.getNama_layanan());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listLayanan.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listLayanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMainData;
        TextView tvMainData;
        CardView cvMainData;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgMainData = itemView.findViewById(R.id.imgMainData);
            tvMainData = itemView.findViewById(R.id.tvMainData);
            cvMainData = itemView.findViewById(R.id.cvMainData);
        }
    }
    public interface OnItemClickCallback{
        void onItemClicked(ModelMain data);
    }
}
/*
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{
    private List<ModelMain> listMain;
    private MainAdapter.onSelectData onSelectData;

    public interface onSelectData {
        void onSelected(ModelMain mdlMain);
    }

    public MainAdapter(List<ModelMain> items, MainAdapter.onSelectData xSelectData) {
        this.items = items;
        this.onSelectData = xSelectData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_main, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelMain data = items.get(position);
        holder.imgMainData.setImageResource(data.getNama_layanan()  );
        holder.tvMainData.setText(data.getTxtName());
        holder.cvMainData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSelectData.onSelected(data);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //Class Holder
    class ViewHolder extends RecyclerView.ViewHolder {

        public CardView cvMainData;
        public TextView tvMainData;
        public ImageView imgMainData;

        public ViewHolder(View itemView) {
            super(itemView);
            cvMainData = itemView.findViewById(R.id.cvMainData);
            tvMainData = itemView.findViewById(R.id.tvMainData);
            imgMainData = itemView.findViewById(R.id.imgMainData);
        }
    }
}

 */
