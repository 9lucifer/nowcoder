package com.nowcoder.community.entity;

/**
 * 封装分页的组件
 */
public class Page {
//    当前页码
    private  int current = 1;

//    显示的上限数据
    private  int limit=10;

    //数据的总数（用于计算总的页数）
    private  int rows;

//    查询路径（用于复用分页的链接）
    private  String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >= 1){
        this.limit = limit;}
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0){
        this.rows = rows;}
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", rows=" + rows +
                ", path='" + path + '\'' +
                '}';
    }

    /**
     * 获取当前页的起始行
     * @return
     */
    public int getOffset(){
        return (current-1)*limit;
    }

    /**
     * 获取总的页数
     * @return
     */
    /**
     * 获取总的页数
     * @return
     */
    public int getTotal() {
        // 检查 limit 是否为零，避免除零异常
        if (limit == 0) {
            return 0; // 或者你可以选择返回 1 或者抛出一个异常
        }

        return (rows + limit - 1) / limit; // 用这种方式来计算总页数，避免浮点数的问题
    }


    /**
     * 获取起始的页码
     * @return
     */
    public int getFrom(){
        int from = current-2;
        return from<1?1:from;
    }

    /**
     * 获取结束的页码
     * @return
     */
    public int getTo(){
        int end = current+2;
        int total = getTotal();
        return end>total?total:end;
    }
}
