// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCitiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Cities")
    public QueryAllCitiesResponseBodyCities cities;

    public static QueryAllCitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCitiesResponseBody self = new QueryAllCitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllCitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllCitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAllCitiesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryAllCitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAllCitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllCitiesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryAllCitiesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryAllCitiesResponseBody setCities(QueryAllCitiesResponseBodyCities cities) {
        this.cities = cities;
        return this;
    }
    public QueryAllCitiesResponseBodyCities getCities() {
        return this.cities;
    }

    public static class QueryAllCitiesResponseBodyCitiesCity extends TeaModel {
        @NameInMap("CityCode")
        public Long cityCode;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PinYin")
        public String pinYin;

        @NameInMap("Id")
        public Long id;

        public static QueryAllCitiesResponseBodyCitiesCity build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCitiesResponseBodyCitiesCity self = new QueryAllCitiesResponseBodyCitiesCity();
            return TeaModel.build(map, self);
        }

        public QueryAllCitiesResponseBodyCitiesCity setCityCode(Long cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Long getCityCode() {
            return this.cityCode;
        }

        public QueryAllCitiesResponseBodyCitiesCity setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryAllCitiesResponseBodyCitiesCity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllCitiesResponseBodyCitiesCity setPinYin(String pinYin) {
            this.pinYin = pinYin;
            return this;
        }
        public String getPinYin() {
            return this.pinYin;
        }

        public QueryAllCitiesResponseBodyCitiesCity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class QueryAllCitiesResponseBodyCities extends TeaModel {
        @NameInMap("City")
        public java.util.List<QueryAllCitiesResponseBodyCitiesCity> city;

        public static QueryAllCitiesResponseBodyCities build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCitiesResponseBodyCities self = new QueryAllCitiesResponseBodyCities();
            return TeaModel.build(map, self);
        }

        public QueryAllCitiesResponseBodyCities setCity(java.util.List<QueryAllCitiesResponseBodyCitiesCity> city) {
            this.city = city;
            return this;
        }
        public java.util.List<QueryAllCitiesResponseBodyCitiesCity> getCity() {
            return this.city;
        }

    }

}
