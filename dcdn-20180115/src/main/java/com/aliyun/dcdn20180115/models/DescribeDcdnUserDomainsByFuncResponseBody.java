// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsByFuncResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeDcdnUserDomainsByFuncResponseBodyDomains domains;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnUserDomainsByFuncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsByFuncResponseBody self = new DescribeDcdnUserDomainsByFuncResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setDomains(DescribeDcdnUserDomainsByFuncResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDcdnUserDomainsByFuncResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource self = new DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources self = new DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Sandbox")
        public String sandbox;

        @NameInMap("Sources")
        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources;

        @NameInMap("SslProtocol")
        public String sslProtocol;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData self = new DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setSources(DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData> pageData;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomains self = new DescribeDcdnUserDomainsByFuncResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomains setPageData(java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
