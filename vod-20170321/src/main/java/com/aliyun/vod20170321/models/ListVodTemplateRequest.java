// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TemplateType")
    public String templateType;

    public static ListVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateRequest self = new ListVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListVodTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListVodTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
