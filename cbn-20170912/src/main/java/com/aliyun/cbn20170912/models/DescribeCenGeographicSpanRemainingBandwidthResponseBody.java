// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpanRemainingBandwidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RemainingBandwidth")
    public Long remainingBandwidth;

    public static DescribeCenGeographicSpanRemainingBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenGeographicSpanRemainingBandwidthResponseBody self = new DescribeCenGeographicSpanRemainingBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenGeographicSpanRemainingBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenGeographicSpanRemainingBandwidthResponseBody setRemainingBandwidth(Long remainingBandwidth) {
        this.remainingBandwidth = remainingBandwidth;
        return this;
    }
    public Long getRemainingBandwidth() {
        return this.remainingBandwidth;
    }

}
