package controllers;

import javax.faces.model.DataModel;

public abstract class PaginationHelper {
private int pageSize;
private int page;

public PaginationHelper(int pageSize) {
this.pageSize= pageSize;
}

public abstract int getItemsCount();
public abstract DataModel<?> createPageDataModel();

public int getPageSize() { return pageSize; }
public void setPageSize(int pageSize) { this.pageSize= pageSize; }
}