package com.example.rxjava.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rxjava.R;

public class PostViewholder extends RecyclerView.ViewHolder {

    TextView txtContent,txtTitle,txtAuthor;
    public PostViewholder(View itemView) {
        super(itemView);

        txtAuthor = itemView.findViewById(R.id.author);
        txtContent = itemView.findViewById(R.id.content);
        txtTitle = itemView.findViewById(R.id.title);
    }
}
