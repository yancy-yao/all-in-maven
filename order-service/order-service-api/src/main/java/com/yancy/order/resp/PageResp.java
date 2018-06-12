package com.yancy.order.resp;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * 分页公用出参
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/10/26 21:40 $$
 */
public class PageResp<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 当前页数
     */
    private int currentPage = 0;

    /**
     * 记录总数
     */
    private long totalElements = 0;

    /**
     * 数据
     */
    private List<T> content = Lists.newArrayList();


    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalElements() {
        return this.totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public List<T> getContent() {
        return this.content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
