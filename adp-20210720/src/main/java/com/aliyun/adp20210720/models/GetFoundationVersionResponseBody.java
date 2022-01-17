// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetFoundationVersionResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetFoundationVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationVersionResponseBody self = new GetFoundationVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoundationVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFoundationVersionResponseBody setData(GetFoundationVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFoundationVersionResponseBodyData getData() {
        return this.data;
    }

    public GetFoundationVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetFoundationVersionResponseBodyData extends TeaModel {
        // description
        @NameInMap("description")
        public String description;

        // 底座功能列表
        @NameInMap("features")
        public java.util.List<String> features;

        // name，目前仅能是 “ADP 底座“
        @NameInMap("name")
        public String name;

        // platforms
        @NameInMap("platforms")
        public java.util.List<Platform> platforms;

        // status，ENUM:["Testing","Published","Deprecated"] Published 后，则全平台所有用户可见，请谨慎操作
        @NameInMap("status")
        public String status;

        // the type of foundation version,ENUM:["trident","ack"]
        @NameInMap("type")
        public String type;

        // uid
        @NameInMap("uid")
        public String uid;

        // version
        @NameInMap("version")
        public String version;

        public static GetFoundationVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFoundationVersionResponseBodyData self = new GetFoundationVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFoundationVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFoundationVersionResponseBodyData setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        public GetFoundationVersionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFoundationVersionResponseBodyData setPlatforms(java.util.List<Platform> platforms) {
            this.platforms = platforms;
            return this;
        }
        public java.util.List<Platform> getPlatforms() {
            return this.platforms;
        }

        public GetFoundationVersionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFoundationVersionResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetFoundationVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetFoundationVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
