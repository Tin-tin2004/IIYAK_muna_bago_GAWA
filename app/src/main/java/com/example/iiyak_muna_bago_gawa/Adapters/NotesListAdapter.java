package com.example.iiyak_muna_bago_gawa.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iiyak_muna_bago_gawa.Models.Notes;
import com.example.iiyak_muna_bago_gawa.NotesClickListener;
import com.example.iiyak_muna_bago_gawa.R;

import java.util.List;

public class NotesListAdapter extends RecyclerView.Adapter<NotesViewHolder>{
    Context context;
    List<Notes> list;
    NotesClickListener listener;

    public NotesListAdapter(Context context, List<Notes> list, NotesClickListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotesViewHolder(LayoutInflater.from(context).inflate(R.notes_list,parent));
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
class NotesViewHolder extends RecyclerView.ViewHolder{

    CardView notes_container;
    TextView txtV_title, txtV_Notes, txtV_Date;
    ImageView pin;

    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);

        notes_container = itemView.findViewById(R.id.notes_container);
        txtV_title = itemView.findViewById(R.id.txtV_title);
        txtV_Notes = itemView.findViewById(R.id.txtV_Notes);
        txtV_Date = itemView.findViewById(R.id.txtV_Date);
        pin = itemView.findViewById(R.id.pin);
    }
}
