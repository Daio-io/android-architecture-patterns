package io.daio.mvp.screens.next;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import io.daio.mvp.R;
import io.daio.mvp.base.BaseViewFragment;
import io.daio.mvp.models.User;

public final class NextView extends BaseViewFragment<NextContract.Presenter> implements NextContract.View {

    private TextView nameField;
    private TextView ageField;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_next_view, container, false);
        setUpViews(rootView);
        return rootView;
    }

    private void setUpViews(View rootView) {
        nameField = (TextView) rootView.findViewById(R.id.name_field);
        ageField = (TextView) rootView.findViewById(R.id.age_field);

        Button button = (Button) rootView.findViewById(R.id.end_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.done();
            }
        });
    }

    @Override
    public void setUser(User user) {
        nameField.setText("Hello there, " + user.name);
        ageField.setText("I see you are " + user.age + " years old");
    }
}