package com.capstone.petgroomingapplication.admin;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.capstone.petgroomingapplication.R;


public class ProductsAndServices extends Fragment {

    Button SaddBtn, PaddBtn, SeditBtn, PeditBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_products_and_services_admin, container, false);

        // Now find the button in the inflated view
        SaddBtn = view.findViewById(R.id.sAddBtn);
        PaddBtn = view.findViewById(R.id.pAddBtn);
        SeditBtn = view.findViewById(R.id.sEditBtn);
        PeditBtn = view.findViewById(R.id.pEditBtn);

        setupListeners();

        return view;
    }
        private void setupListeners() {

            SaddBtn.setOnClickListener(v -> {

                Intent intent = new Intent(getActivity(), AddProducts.class);
                startActivity(intent);
            });

            PaddBtn.setOnClickListener(v -> {
                Intent intent = new Intent(getActivity(), AddService.class);
                startActivity(intent);
            });
            SeditBtn.setOnClickListener(v -> {
                Intent intent = new Intent(getActivity(), AddProducts.class);
                startActivity(intent);
            });
            PeditBtn.setOnClickListener( v->{
                Intent intent = new Intent(getActivity(), AddService.class);
                startActivity(intent);
            });
        }
    }
