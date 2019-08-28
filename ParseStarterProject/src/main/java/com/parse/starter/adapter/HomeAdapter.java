package com.parse.starter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.parse.ParseObject;
import com.parse.starter.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import  java.util.List;

public class HomeAdapter extends ArrayAdapter<ParseObject>{

    private Context context;
    private ArrayList<ParseObject> postagem;


    public HomeAdapter(Context context, ArrayList<ParseObject> objects) {
        super(context,0 ,objects);
        this.context  =context;
        this.postagem = objects;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;

        if(view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            view=inflater.inflate(R.layout.lista_postagem,parent,false);
        }

        if(postagem.size()>0){
            ImageView imagemPostada=(ImageView) view.findViewById(R.id.image_lista_postagem);
            ParseObject parseObject=postagem.get(position);



            Picasso.with(context)
                    .load(parseObject.getParseFile("imagem").getUrl())
                    .fit()
                    .into(imagemPostada);

        }
        return view;
    }
}