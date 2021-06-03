// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateAclsWithListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateAclsWithListenerResponseBody body;

    public static AssociateAclsWithListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateAclsWithListenerResponse self = new AssociateAclsWithListenerResponse();
        return TeaModel.build(map, self);
    }

    public AssociateAclsWithListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateAclsWithListenerResponse setBody(AssociateAclsWithListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateAclsWithListenerResponseBody getBody() {
        return this.body;
    }

}
