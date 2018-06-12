/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.yancy.order.dal.po;

import java.io.Serializable;

public class DuplicateOrderRemovalPO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 就餐id
     */
    private Integer repastId;
    /**
     * 预约id
     */
    private Integer bespeakId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRepastId() {
        return repastId;
    }

    public void setRepastId(Integer repastId) {
        this.repastId = repastId;
    }

    public Integer getBespeakId() {
        return bespeakId;
    }

    public void setBespeakId(Integer bespeakId) {
        this.bespeakId = bespeakId;
    }
}