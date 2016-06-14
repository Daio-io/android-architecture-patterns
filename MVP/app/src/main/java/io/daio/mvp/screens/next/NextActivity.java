package io.daio.mvp.screens.next;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.daio.mvp.R;
import io.daio.mvp.base.NavigationHandler;
import io.daio.mvp.screens.ScreenIntentFactory;
import io.daio.mvp.screens.home.HomeActivity;
import io.daio.mvp.services.UserService;


public final class NextActivity extends AppCompatActivity implements NavigationHandler {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NextView view = new NextView();

        getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.main_content, view)
            .commit();

        new NextPresenter(this, view, new UserService());
    }

    @Override
    public void navigate() {
        Intent intent = ScreenIntentFactory.homeActivityIntent(NextActivity.this);
        startActivity(intent);
        finish();
    }
}
