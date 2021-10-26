// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignatureId")
    public String signatureId;

    @NameInMap("SignatureName")
    public String signatureName;

    public static CreateSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureResponseBody self = new CreateSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSignatureResponseBody setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public CreateSignatureResponseBody setSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }
    public String getSignatureName() {
        return this.signatureName;
    }

}
