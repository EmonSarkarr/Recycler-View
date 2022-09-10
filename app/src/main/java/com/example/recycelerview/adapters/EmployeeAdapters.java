package com.example.recycelerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycelerview.R;
import com.example.recycelerview.models.Employee;

import java.util.List;

public class EmployeeAdapters extends RecyclerView.Adapter<EmployeeAdapters.EmployeeViewHolder> {
    private List<Employee> employeeList;

    public EmployeeAdapters(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_row,parent,false);
        return new EmployeeViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {

        final Employee employee = employeeList.get(position);
        holder.nameTV.setText(employee.getName());
        holder.designationTV.setText(employee.getDesignation());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }


    class EmployeeViewHolder extends RecyclerView.ViewHolder {
        TextView nameTV,designationTV;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.rowEmployeeName);
            designationTV = itemView.findViewById(R.id.rowEmployeeDesignation);
        }
    }

}
