package com.example.recycelerview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recycelerview.adapters.EmployeeAdapters;
import com.example.recycelerview.databinding.FragmentHomeBinding;
import com.example.recycelerview.models.Employee;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false);

        final EmployeeAdapters employeeAdapter = new EmployeeAdapters(Employee.getAllEmployee());
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(RecyclerView.VERTICAL);
        binding.employeeRV.setLayoutManager(llm);
        binding.employeeRV.setAdapter(employeeAdapter);
        return binding.getRoot();
    }
}