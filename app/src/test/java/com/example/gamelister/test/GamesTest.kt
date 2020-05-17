package com.example.gamelister.test

import com.example.gamelister.model.dto.Game
import com.example.gamelister.testInjector
import com.example.gamelister.ui.detail.DetailPresenter
import com.example.gamelister.ui.detail.DetailScreen
import com.example.gamelister.ui.main.MainPresenter
import com.example.gamelister.ui.main.MainScreen
import com.example.gamelister.utils.argumentCaptor
import com.example.gamelister.utils.mock
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class GamesTest {
    @Inject
    lateinit var detailsPresenter: DetailPresenter
    private lateinit var detailScreen: DetailScreen

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        detailScreen = mock()
        detailsPresenter.attachScreen(detailScreen)
    }

    @Test
    fun testGameDetail() {
        detailsPresenter.load(1)

        val game = argumentCaptor<Game>()
        Mockito.verify(detailScreen).showGame(game.capture())
        assert(game.value.description == "gamedescription")
        assert(game.value.deck == "gamedeck")
        assert(game.value.id == 1L)
        assert(game.value.image!!.smallUrl == "imageurl")
        assert(game.value.name == "game")
        assert(game.value.originalReleaseDate == "date")
        assert(game.value.platforms!!.stream().findAny().get().name == "Playstation")
    }

    @After
    fun tearDown() {
        detailsPresenter.detachScreen()
    }
}