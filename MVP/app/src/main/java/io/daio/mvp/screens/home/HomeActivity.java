package io.daio.mvp.screens.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import io.daio.mvp.MainActivity;
import io.daio.mvp.R;

public final class HomeActivity extends AppCompatActivity implements HomeContract.NavigationHandler {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeView view = new HomeView();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.main_content, view);
        transaction.commit();

        new HomePresenter(this, view);
    }

    @Override
    public void navigateToNext() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}