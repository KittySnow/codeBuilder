package cn.dlbdata.dangjian.admin.model;

import java.io.Serializable;

public class PRole implements Serializable {
    /**
     * 角色表
     *
     * @mbg.generated
     */
    private Integer roleid;

    private String rolename;

    private String roledesc;

    private Integer rolepid;

    private static final long serialVersionUID = 1L;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public Integer getRolepid() {
        return rolepid;
    }

    public void setRolepid(Integer rolepid) {
        this.rolepid = rolepid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleid=").append(roleid);
        sb.append(", rolename=").append(rolename);
        sb.append(", roledesc=").append(roledesc);
        sb.append(", rolepid=").append(rolepid);
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
        PRole other = (PRole) that;
        return (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename()))
            && (this.getRoledesc() == null ? other.getRoledesc() == null : this.getRoledesc().equals(other.getRoledesc()))
            && (this.getRolepid() == null ? other.getRolepid() == null : this.getRolepid().equals(other.getRolepid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
        result = prime * result + ((getRoledesc() == null) ? 0 : getRoledesc().hashCode());
        result = prime * result + ((getRolepid() == null) ? 0 : getRolepid().hashCode());
        return result;
    }
}