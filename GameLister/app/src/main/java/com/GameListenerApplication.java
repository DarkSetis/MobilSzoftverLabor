package com;

import android.app.Application;

public class GameListenerApplication  extends Application {

    public static GameListenerApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerGamesListenerDemoApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }

}
