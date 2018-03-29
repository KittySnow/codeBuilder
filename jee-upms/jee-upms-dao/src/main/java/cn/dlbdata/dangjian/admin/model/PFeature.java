package cn.dlbdata.dangjian.admin.model;

import java.io.Serializable;

public class PFeature implements Serializable {
    /**
     * 功能表
     *
     * @mbg.generated
     */
    private Integer featureid;

    private String engname;

    private String chnname;

    private String path;

    private String component;

    private String pname;

    private String iconcls;

    private Integer parentid;

    private static final long serialVersionUID = 1L;

    public Integer getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Integer featureid) {
        this.featureid = featureid;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getChnname() {
        return chnname;
    }

    public void setChnname(String chnname) {
        this.chnname = chnname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", featureid=").append(featureid);
        sb.append(", engname=").append(engname);
        sb.append(", chnname=").append(chnname);
        sb.append(", path=").append(path);
        sb.append(", component=").append(component);
        sb.append(", pname=").append(pname);
        sb.append(", iconcls=").append(iconcls);
        sb.append(", parentid=").append(parentid);
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
        PFeature other = (PFeature) that;
        return (this.getFeatureid() == null ? other.getFeatureid() == null : this.getFeatureid().equals(other.getFeatureid()))
            && (this.getEngname() == null ? other.getEngname() == null : this.getEngname().equals(other.getEngname()))
            && (this.getChnname() == null ? other.getChnname() == null : this.getChnname().equals(other.getChnname()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getComponent() == null ? other.getComponent() == null : this.getComponent().equals(other.getComponent()))
            && (this.getPname() == null ? other.getPname() == null : this.getPname().equals(other.getPname()))
            && (this.getIconcls() == null ? other.getIconcls() == null : this.getIconcls().equals(other.getIconcls()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeatureid() == null) ? 0 : getFeatureid().hashCode());
        result = prime * result + ((getEngname() == null) ? 0 : getEngname().hashCode());
        result = prime * result + ((getChnname() == null) ? 0 : getChnname().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getComponent() == null) ? 0 : getComponent().hashCode());
        result = prime * result + ((getPname() == null) ? 0 : getPname().hashCode());
        result = prime * result + ((getIconcls() == null) ? 0 : getIconcls().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        return result;
    }
}