package com.capstone.petgroomingapplication.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.capstone.petgroomingapplication.R;

public class Home extends Fragment {

    private TextView totalSalesAmount, averageSalesAmount, growthPercentage, dailySalesAmount, topProducts, appointmentDetails;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment layout
        View rootView = inflater.inflate(R.layout.fragment_home_admin, container, false);

        // Initialize TextViews
        totalSalesAmount = rootView.findViewById(R.id.totalSalesAmount);
        averageSalesAmount = rootView.findViewById(R.id.averageSalesAmount);
        growthPercentage = rootView.findViewById(R.id.growthPercentage);
        dailySalesAmount = rootView.findViewById(R.id.dailySalesAmount);
        topProducts = rootView.findViewById(R.id.topProducts);
        appointmentDetails = rootView.findViewById(R.id.appointmentDetails);

        // Set data
        setSalesData();
        setTopProducts();
        setAppointments();

        return rootView;
    }

    private void setSalesData() {
        // Sample data
        double totalSales = 120000.00;
        double averageSales = 10000.00;
        double growthPercent = 15.0;
        double dailySales = 2500.00;

        totalSalesAmount.setText(String.format("$%.2f", totalSales));
        averageSalesAmount.setText(String.format("$%.2f", averageSales));
        growthPercentage.setText(String.format("+%.1f%%", growthPercent));
        dailySalesAmount.setText(String.format("$%.2f", dailySales));
    }

    private void setTopProducts() {
        // Sample top products
        String[] products = {"Product A", "Product B", "Product C"};
        StringBuilder topProductsString = new StringBuilder();

        for (int i = 0; i < products.length; i++) {
            topProductsString.append(String.format("%d. %s\n", i + 1, products[i]));
        }

        topProducts.setText(topProductsString.toString().trim());
    }

    private void setAppointments() {
        // Sample appointments details
        String appointments = "No more appointments";
        appointmentDetails.setText(appointments);
    }
}
