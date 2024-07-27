package com.game.history.api.model;


public enum GameTypeEnum {
    FIFA(0L, "FIFA");

    GameTypeEnum(Long key, String value) {
    }

    public static GameTypeEnum parse(String value) {
        try {
            return GameTypeEnum.valueOf(value);
        } catch (Exception e) {
            throw new IllegalArgumentException("There is no record for " + value);
        }
    }
}
