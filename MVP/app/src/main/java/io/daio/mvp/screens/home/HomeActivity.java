package io.daio.mvp.screens.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import io.daio.mvp.R;
import io.daio.mvp.base.NavigationHandler;
import io.daio.mvp.screens.ScreenIntentFactory;

public final class HomeActivity extends AppCompatActivity implements NavigationHandler {

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
    public void navigate() {
        startActivity(ScreenIntentFactory.nextActivityIntent(HomeActivity.this));
        finish();
    }

}
