package cn.dlbdata.dangjian.admin.service.model;

import java.io.Serializable;

public class PRoleFeature implements Serializable {
    private Integer rfid;

    private Integer roleid;

    /**
     * 角色功能中间表
     *
     * @mbg.generated
     */
    private Integer featureid;

    private static final long serialVersionUID = 1L;

    public Integer getRfid() {
        return rfid;
    }

    public void setRfid(Integer rfid) {
        this.rfid = rfid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Integer featureid) {
        this.featureid = featureid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rfid=").append(rfid);
        sb.append(", roleid=").append(roleid);
        sb.append(", featureid=").append(featureid);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PRoleFeature other = (PRoleFeature) that;
        return (this.getRfid() == null ? other.getRfid() == null : this.getRfid().equals(other.getRfid()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getFeatureid() == null ? other.getFeatureid() == null : this.getFeatureid().equals(other.getFeatureid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRfid() == null) ? 0 : getRfid().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getFeatureid() == null) ? 0 : getFeatureid().hashCode());
        return result;
    }
}