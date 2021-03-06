package cn.dlbdata.dangjian.admin.service.model;

import java.io.Serializable;

public class PUser implements Serializable {
    /**
     * 用户表
     *
     * @mbg.generated
     */
    private Integer userid;

    private String name;

    private String email;

    private String password;

    private String company;

    private String job;

    private Integer roleid;

    private String tel;

    private Integer departmentid;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", company=").append(company);
        sb.append(", job=").append(job);
        sb.append(", roleid=").append(roleid);
        sb.append(", tel=").append(tel);
        sb.append(", departmentid=").append(departmentid);
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
        PUser other = (PUser) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        return result;
    }
}