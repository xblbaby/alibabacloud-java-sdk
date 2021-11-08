// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdatePerspectiveRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("PerspectiveId")
    public String perspectiveId;

    public static UpdatePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePerspectiveRequest self = new UpdatePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePerspectiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePerspectiveRequest setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

}
