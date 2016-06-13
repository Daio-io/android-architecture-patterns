package io.daio.mvp.screens;

import android.content.Context;
import android.content.Intent;

import io.daio.mvp.screens.next.NextActivity;

public final class ScreenIntentFactory {

    public static Intent nextActivityIntent(Context context) {
        return new Intent(context, NextActivity.class);
    }

}
