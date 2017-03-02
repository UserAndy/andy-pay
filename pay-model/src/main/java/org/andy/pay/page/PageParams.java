package org.andy.pay.page;

/**
 * @description: jquery dataTable 页面参数
 * @author: Andy
 * @date: 2017-03-02
 * @blog: www.andyqian.com
 */
public class PageParams implements java.io.Serializable{

    private int draw;

    /**
     * 开始角标
     */
    private int start;

    /**
     * 每页显示的数量大小
     */
    private int length;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
