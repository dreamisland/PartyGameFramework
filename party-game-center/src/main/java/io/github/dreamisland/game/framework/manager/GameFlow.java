package io.github.dreamisland.game.framework.manager;

import io.github.dreamisland.game.framework.preset.Game;

/**
 * 游戏流程
 *
 * @author curatorjin
 * @since 2022-02-13
 */
public class GameFlow {
    public void startGame(Game game) {
        game.init();
        while (!game.isGameOver()) {
            game.round();
        }
    }
}
