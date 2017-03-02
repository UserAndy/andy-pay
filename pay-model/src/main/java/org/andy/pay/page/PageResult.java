package org.andy.pay.page;

import java.util.List;

/**
 * @description:  datatables 的分页返回结果
 * @author: Andy
 * @date: 2017-03-02
 * @blog: www.andyqian.com
 */
public class PageResult implements java.io.Serializable {

    private int draw;

    /**
     * 没有过滤的记录数
     */
    private int recordsTotal;

    /**
     * 过滤后的记录数
     */
    private int recordsFiltered;

    /**
     * 数组
     */
    private List<?> data;

    /**
     * 错误信息
     */
    private String error;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
