package com.atheesh.vehiclestore.models;

public class VehicleModel {
    private long idvehicleModel;
    private String code;
    private String modelName;
    private Boolean enable;

    public VehicleModel() {
    }

    public VehicleModel(long idvehicleModel, String code, String modelName, Boolean enable) {
        this.idvehicleModel = idvehicleModel;
        this.code = code;
        this.modelName = modelName;
        this.enable = enable;
    }

    public long getIdvehicleModel() {
        return idvehicleModel;
    }

    public void setIdvehicleModel(long idvehicleModel) {
        this.idvehicleModel = idvehicleModel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "VehicleModel{" +
                "idvehicleModel=" + idvehicleModel +
                ", code='" + code + '\'' +
                ", modelName='" + modelName + '\'' +
                ", enable=" + enable +
                '}';
    }
}
