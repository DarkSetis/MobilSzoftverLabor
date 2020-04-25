package com;

import com.example.gamelister.network.NetworkModule;
import com.example.gamelister.ui.UIModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class})
public interface GameListenerApplicationComponent {

}
