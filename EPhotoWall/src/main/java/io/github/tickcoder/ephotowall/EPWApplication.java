package io.github.tickcoder.ephotowall;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by claris on 2017.05.24.Wednesday.
 */

public class EPWApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
