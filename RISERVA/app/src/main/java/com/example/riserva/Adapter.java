package com.example.riserva;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {
    String data1[],data2[];
    int images[];
    Context context;
    public Adapter(Context ct,String s1[],String s2[],int img[])
    {
       context=ct;
       data1=s1;
       data2=s2;
       images=img;
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
       View view= inflater.inflate(R.layout.row,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.textView1.setText(data1[position]);
        holder.textView2.setText(data2[position]);
        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView textView1,textView2;
        ImageView imageView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            textView1= itemView.findViewById(R.id.textView5);
            textView2= itemView.findViewById(R.id.textView6);
            imageView=itemView.findViewById(R.id.imageView2);
        }
    }
}
