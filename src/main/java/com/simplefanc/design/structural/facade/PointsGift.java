package com.simplefanc.design.structural.facade;

import lombok.Data;

/**
 * 积分礼物
 */

@Data
public class PointsGift {

    /**
     * name
     */
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }
}
