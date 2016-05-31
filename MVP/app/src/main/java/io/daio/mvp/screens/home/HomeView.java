package io.daio.mvp.screens.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import io.daio.mvp.R;
import io.daio.mvp.base.BaseViewFragment;


public final class HomeView extends BaseViewFragment<HomeContract.HomePresenter> implements HomeContract.HomeView {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_view, container, false);
        setUpButtons(rootView);
        return rootView;
    }

    private void setUpButtons(View rootView) {
        Button button = (Button) rootView.findViewById(R.id.get_started_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getStarted();
            }
        });
    }
}
