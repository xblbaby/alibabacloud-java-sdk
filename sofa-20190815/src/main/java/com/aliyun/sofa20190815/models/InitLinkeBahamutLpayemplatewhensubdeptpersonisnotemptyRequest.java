// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    public static InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyRequest self = new InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutLpayemplatewhensubdeptpersonisnotemptyRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
