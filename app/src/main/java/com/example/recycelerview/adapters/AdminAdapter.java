package com.example.recycelerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.recycelerview.R;
import com.example.recycelerview.models.Admin;

import java.util.List;

public class AdminAdapter extends RecyclerView.Adapter<AdminAdapter.AdminViewHolder> {
    private List<Admin> adminListList;

    public AdminAdapter(List<Admin> adminListList) {
        this.adminListList = adminListList;
    }

    @NonNull
    @Override
    public AdminViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View RVH = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_row,parent,false);
        return new AdminViewHolder(RVH);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminViewHolder holder, int position) {

        final Admin admin = adminListList.get(position);
        holder.nameTV.setText(admin.getName());
        holder.salaryTV.setText(admin.getSalary());
        holder.phoneNumberTV.setText(admin.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return adminListList.size();
    }


    public  class AdminViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV,salaryTV,phoneNumberTV;

        public AdminViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.rowAdminName);
            salaryTV = itemView.findViewById(R.id.rowAdminSalary);
            phoneNumberTV = itemView.findViewById(R.id.rowAdminPhoneNumber);
        }
    }
}
