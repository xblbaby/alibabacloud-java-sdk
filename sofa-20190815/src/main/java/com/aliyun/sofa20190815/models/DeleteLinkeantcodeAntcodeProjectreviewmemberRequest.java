// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectreviewmemberRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static DeleteLinkeantcodeAntcodeProjectreviewmemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectreviewmemberRequest self = new DeleteLinkeantcodeAntcodeProjectreviewmemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectreviewmemberRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewmemberRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewmemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
