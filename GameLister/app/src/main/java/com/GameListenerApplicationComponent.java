package com;

import com.example.gamelister.MainActivity;
import com.example.gamelister.interactor.GamesInteractor;
import com.example.gamelister.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class})
public interface GameListenerApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(GamesFragment artistsFragment);

    void inject(GamesInteractor artistsInteractor);

    void inject(GamesPresenter artistsPresenter);
}
