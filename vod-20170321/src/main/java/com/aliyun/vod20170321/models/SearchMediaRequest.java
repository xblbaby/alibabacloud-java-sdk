// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    @NameInMap("Fields")
    public String fields;

    @NameInMap("Match")
    public String match;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScrollToken")
    public String scrollToken;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("SortBy")
    public String sortBy;

    public static SearchMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaRequest self = new SearchMediaRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public SearchMediaRequest setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public SearchMediaRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaRequest setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public SearchMediaRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public SearchMediaRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
