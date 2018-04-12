package com.uca.alex.cesar.fajardo.roomtest2.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uca.alex.cesar.fajardo.roomtest2.R;
import com.uca.alex.cesar.fajardo.roomtest2.clients.Clients;

import java.util.List;

public class ClientsAdapter extends RecyclerView.Adapter<ClientsAdapter.ViewHolder>{

    private List<Clients> clients;

    public ClientsAdapter(List<Clients> clients) {
        this.clients = clients;
    }

    @Override
    public ClientsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.clients_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ClientsAdapter.ViewHolder holder, int position) {
        holder.nombre.setText(clients.get(position).getNombre());
        holder.apellido.setText(clients.get(position).getApellido());
        holder.numero.setText(clients.get(position).getNumero());
    }

    @Override
    public int getItemCount() {
        return clients.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nombre;
        public TextView apellido;
        public TextView numero;

        public ViewHolder(View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.nombre);
            apellido = itemView.findViewById(R.id.apellido);
            numero = itemView.findViewById(R.id.numero);
        }
    }


}
