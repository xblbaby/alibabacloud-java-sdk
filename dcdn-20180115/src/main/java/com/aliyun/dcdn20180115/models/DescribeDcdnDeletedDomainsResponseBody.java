// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeletedDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeDcdnDeletedDomainsResponseBodyDomains domains;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnDeletedDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeletedDomainsResponseBody self = new DescribeDcdnDeletedDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeletedDomainsResponseBody setDomains(DescribeDcdnDeletedDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDcdnDeletedDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDcdnDeletedDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnDeletedDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnDeletedDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDeletedDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnDeletedDomainsResponseBodyDomainsPageData extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static DescribeDcdnDeletedDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDeletedDomainsResponseBodyDomainsPageData self = new DescribeDcdnDeletedDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDeletedDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnDeletedDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class DescribeDcdnDeletedDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeDcdnDeletedDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeDcdnDeletedDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDeletedDomainsResponseBodyDomains self = new DescribeDcdnDeletedDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDeletedDomainsResponseBodyDomains setPageData(java.util.List<DescribeDcdnDeletedDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeDcdnDeletedDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
