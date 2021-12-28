// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyBuiltinEnvoyFilterRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IstioVersion")
    public String istioVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static ModifyBuiltinEnvoyFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuiltinEnvoyFilterRequest self = new ModifyBuiltinEnvoyFilterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBuiltinEnvoyFilterRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyBuiltinEnvoyFilterRequest setIstioVersion(String istioVersion) {
        this.istioVersion = istioVersion;
        return this;
    }
    public String getIstioVersion() {
        return this.istioVersion;
    }

    public ModifyBuiltinEnvoyFilterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyBuiltinEnvoyFilterRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyBuiltinEnvoyFilterRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
