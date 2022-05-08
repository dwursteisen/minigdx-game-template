package my.other

import com.github.dwursteisen.minigdx.GameContext
import com.github.dwursteisen.minigdx.GameScreenConfiguration
import com.github.dwursteisen.minigdx.MiniGdxActivity
import com.github.dwursteisen.minigdx.game.Game
import your.game.MyGame

class MainActivity : MiniGdxActivity(
    "Super Game",
    GameScreenConfiguration.WithResolution(1920, 1080),
    debug = false
) {

    @ExperimentalStdlibApi
    override fun createGame(gameContext: GameContext): Game {
        return MyGame(gameContext)
    }

}