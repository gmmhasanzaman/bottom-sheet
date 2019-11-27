package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CustomBottomSheetDialog.BottomSheetListener {

    private Button openBottomSheetBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        openBottomSheetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomBottomSheetDialog bottomSheetDialog = new CustomBottomSheetDialog();
                bottomSheetDialog.show(getSupportFragmentManager(),"bottomSheet");
            }
        });
    }

    private void initViews() {
        openBottomSheetBtn = findViewById(R.id.openBottomSheetTB);
        textView = findViewById(R.id.showTV);
    }

    @Override
    public void onButtonClicked(String string) {
        textView.setText(string);
    }
}
