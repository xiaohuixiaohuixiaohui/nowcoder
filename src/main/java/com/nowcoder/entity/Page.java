package com.nowcoder.entity;
//封装分页相关的对象

public class Page {
    //当前页码
    private int current = 1;
    //显示上限
    private int limit = 10;
    //数据总数
    private int rows;

    /**
     * 点击页面跳转的链接
     */
    private String path;

    public int getCurrent() {
        return current;
    }
     
     
    
    public void setCurrent(int current) {
        if (current >= 1){
            this.current = current;
        }
    }
    
    public int getLimit() {

            return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**获取当前页的起始行*/
    public int getOffset(){
        return (current-1) * limit;
    }

    public int getTotalPages(){
            return rows % limit == 0 ? rows % limit : rows % limit+1;
    }
    /**获取网页跳转页的起始页码*/
    public int getFromPage(){
        int from = current -2;
        return Math.max(from, 1);
    }
    /**获取网页跳转页的结束页码*/
    public int getToPage(){
        int to = current +2;
        return Math.min(to,this.getTotalPages());
    }
}
