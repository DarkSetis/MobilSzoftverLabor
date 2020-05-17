package com.example.gamelister.test

import com.example.gamelister.model.dto.Game
import com.example.gamelister.testInjector
import com.example.gamelister.ui.main.MainPresenter
import com.example.gamelister.ui.main.MainScreen
import com.example.gamelister.utils.argumentCaptor
import com.example.gamelister.utils.mock
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.verify
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class MainTest {
    @Inject
    lateinit var mainPresenter: MainPresenter
    private lateinit var mainScreen: MainScreen

    @Throws(Exception::class)
    @Before
    fun setup() {
        testInjector.inject(this)
        mainScreen = mock()
        mainPresenter.attachScreen(mainScreen)
    }

    @Test
    fun testListGames() {
        mainPresenter.load()

        val list = argumentCaptor<MutableList<Game>>()
        verify(mainScreen).showGames(list.capture())
        assert(list.value.size > 0)
        assert(list.value.stream().findAny().get().name === "game")
        assert(list.value.stream().findAny().get().id!! == 1L)
    }

    @After
    fun tearDown() {
        mainPresenter.detachScreen()
    }
}