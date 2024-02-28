package com.example.coffee.ui.asd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.coffee.databinding.FragmentAsdBinding;
import com.example.coffee.ui.asd.asdViewModel;

public class asdFragment extends Fragment {

    private FragmentAsdBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        asdViewModel asdViewModel =
                new ViewModelProvider(this).get(asdViewModel.class);

        binding = FragmentAsdBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
