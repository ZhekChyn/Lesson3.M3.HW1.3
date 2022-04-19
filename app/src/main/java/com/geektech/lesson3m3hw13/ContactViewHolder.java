package com.geektech.lesson3m3hw13;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView number;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        number = itemView.findViewById(R.id.number);
    }

    public void bind(String numberValue){ number.setText(numberValue);}
}
