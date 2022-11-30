package com.example.recycelerview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recycelerview.adapters.AdminAdapter;
import com.example.recycelerview.databinding.FragmentAdminBinding;
import com.example.recycelerview.models.Admin;

public class AdminFragment extends Fragment {

    private FragmentAdminBinding binding;


    public AdminFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAdminBinding.inflate(inflater,container,false);
        final AdminAdapter adminAdapter = new AdminAdapter(Admin.getAllAdminDetails());
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(RecyclerView.VERTICAL);
        binding.adminRV.setLayoutManager(llm);
        binding.adminRV.setAdapter(adminAdapter);

        return binding.getRoot();
    }
}