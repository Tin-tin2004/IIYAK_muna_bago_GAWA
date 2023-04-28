package com.example.iiyak_muna_bago_gawa;

import androidx.cardview.widget.CardView;

import com.example.iiyak_muna_bago_gawa.Models.Notes;

public interface NotesClickListener {
    void ocClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
