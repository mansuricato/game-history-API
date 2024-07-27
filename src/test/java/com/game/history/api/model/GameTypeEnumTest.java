package com.game.history.api.model;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameTypeEnumTest {

    @Test
    void parseValidValue_ShouldReturnEnum() {
        assertThat(GameTypeEnum.parse("FIFA")).isEqualTo(GameTypeEnum.FIFA);
    }

    @Test
    void parseInvalidValue_ShouldThrowIllegalArgumentException() {
        assertThatThrownBy(() -> GameTypeEnum.parse("Invalid value"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("There is no record for");
    }
}
