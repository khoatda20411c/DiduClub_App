package com.nhom3.Models;

public class HistorySearchModel {
    private String textSearch;
    private int imvDetail;

    public HistorySearchModel(String textSearch, int imvDetail) {
        this.textSearch = textSearch;
        this.imvDetail = imvDetail;
    }

    public String getTextSearch() {
        return textSearch;
    }

    public void setTextSearch(String textSearch) {
        this.textSearch = textSearch;
    }

    public int getImvDetail() {
        return imvDetail;
    }

    public void setImvDetail(int imvDetail) {
        this.imvDetail = imvDetail;
    }
}
