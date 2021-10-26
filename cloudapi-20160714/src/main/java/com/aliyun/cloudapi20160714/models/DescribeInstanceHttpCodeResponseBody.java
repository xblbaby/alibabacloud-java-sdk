// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceHttpCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceHttpCode")
    public DescribeInstanceHttpCodeResponseBodyInstanceHttpCode instanceHttpCode;

    public static DescribeInstanceHttpCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHttpCodeResponseBody self = new DescribeInstanceHttpCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHttpCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceHttpCodeResponseBody setInstanceHttpCode(DescribeInstanceHttpCodeResponseBodyInstanceHttpCode instanceHttpCode) {
        this.instanceHttpCode = instanceHttpCode;
        return this;
    }
    public DescribeInstanceHttpCodeResponseBodyInstanceHttpCode getInstanceHttpCode() {
        return this.instanceHttpCode;
    }

    public static class DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem self = new DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeInstanceHttpCodeResponseBodyInstanceHttpCode extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem> monitorItem;

        public static DescribeInstanceHttpCodeResponseBodyInstanceHttpCode build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHttpCodeResponseBodyInstanceHttpCode self = new DescribeInstanceHttpCodeResponseBodyInstanceHttpCode();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHttpCodeResponseBodyInstanceHttpCode setMonitorItem(java.util.List<DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceHttpCodeResponseBodyInstanceHttpCodeMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
