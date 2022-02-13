package io.github.dreamisland.game.framework.preset;

import java.util.List;

/**
 * 游戏接口
 *
 * @author curatorjin
 * @since 2022-02-13
 */
public interface Game {
    List<Player> players = null;

    void init();

    void round();

    boolean isGameOver();
}
