// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExitEntryPermitToHKRequest extends TeaModel {
    // 图案坐标信息输出，针对结构化，如身份证人脸头像
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    // 图片二进制字节流，最大10MB
    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeExitEntryPermitToHKRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExitEntryPermitToHKRequest self = new RecognizeExitEntryPermitToHKRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeExitEntryPermitToHKRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeExitEntryPermitToHKRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeExitEntryPermitToHKRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
