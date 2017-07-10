package com.hebaobei.baby.vo;

/**
 * Created by dmin on 2017/7/6.
 */
public class PageVO {


//    private int limit;
//    private int offset;
//    private int current;
//
//
//    public int getLimit() {
//        return limit;
//    }
//
//    public void setLimit(int limit) {
//        this.limit = limit;
//    }
//
//    public int getOffset() {
//        return offset;
//    }
//
//    public void setOffset(int offset) {
//        this.offset = offset;
//    }
//
//    public int getCurrent() {
//        return current;
//    }
//
//    public void setCurrent(int current) {
//        this.current = current;
//    }

    private Integer pageNumber;
    private Integer pageSize;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
