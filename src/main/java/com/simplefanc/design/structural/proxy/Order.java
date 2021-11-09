package com.simplefanc.design.structural.proxy;

import lombok.Data;


@Data
public class Order {
    private Object orderInfo;

    /**
     * userId
     */
    private Integer userId;
}
