// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class AePropRecAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    public static AePropRecAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AePropRecAdvanceRequest self = new AePropRecAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AePropRecAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

}
