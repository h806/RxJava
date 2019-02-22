package com.example.rxjava.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rxjava.R;
import com.example.rxjava.model.Post;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<PostViewholder> {

    private Context context;
    private List<Post> postList;

    public Adapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item,parent,false);
        return new PostViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewholder holder, int position) {
        holder.txtAuthor.setText(String.valueOf(postList.get(position).userId));
        holder.txtTitle.setText(String.valueOf(postList.get(position).title));
        holder.txtContent.setText(new StringBuilder(postList.get(position).body.substring(0,20)).append(".....").toString());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
