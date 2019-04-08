package cn.goods.entity;

//分页实体类
public class Page {
    private Integer currentPageNo=1;//当前页码
    private Integer totalPageCount;//总页数
    private Integer totalCount;//总记录数
    private Integer pageSize;//每一页的记录数



    public Integer getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(Integer currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        if (this.totalCount > 0){
            this.totalCount = totalCount;
        }else {
    this.totalPageCount=this.totalCount % this.pageSize == 0 ? this.totalCount / this.pageSize : this.totalCount / this.pageSize + 1;
        }

    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
