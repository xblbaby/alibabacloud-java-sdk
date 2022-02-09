// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBatchRecognizeRequest extends TeaModel {
    // 图片名称
    @NameInMap("ImageName")
    public String imageName;

    // 图片识别op类型
    @NameInMap("ImageOp")
    public String imageOp;

    // 图片存入oss中的key
    @NameInMap("ImageOssKey")
    public String imageOssKey;

    // 是否需要自动旋转功能(结构化检测、混贴场景、教育相关场景会自动做旋转，无需设置)，返回角度信息
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    // 是否按顺序输出文字块。false表示从左往右，从上到下的顺序；true表示从上到下，从左往右的顺序
    @NameInMap("NeedSortPage")
    public Boolean needSortPage;

    // 是否输出单字识别结果
    @NameInMap("OutputCharInfo")
    public Boolean outputCharInfo;

    // 是否输出表格识别结果，包含单元格信息
    @NameInMap("OutputTable")
    public Boolean outputTable;

    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    public static RecognizeBatchRecognizeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBatchRecognizeRequest self = new RecognizeBatchRecognizeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBatchRecognizeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public RecognizeBatchRecognizeRequest setImageOp(String imageOp) {
        this.imageOp = imageOp;
        return this;
    }
    public String getImageOp() {
        return this.imageOp;
    }

    public RecognizeBatchRecognizeRequest setImageOssKey(String imageOssKey) {
        this.imageOssKey = imageOssKey;
        return this;
    }
    public String getImageOssKey() {
        return this.imageOssKey;
    }

    public RecognizeBatchRecognizeRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeBatchRecognizeRequest setNeedSortPage(Boolean needSortPage) {
        this.needSortPage = needSortPage;
        return this;
    }
    public Boolean getNeedSortPage() {
        return this.needSortPage;
    }

    public RecognizeBatchRecognizeRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeBatchRecognizeRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeBatchRecognizeRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
