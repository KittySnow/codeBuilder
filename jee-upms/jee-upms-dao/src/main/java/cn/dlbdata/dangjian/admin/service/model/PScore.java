package cn.dlbdata.dangjian.admin.service.model;

import java.io.Serializable;

public class PScore implements Serializable {
    /**
     * 积分表
     *
     * @mbg.generated
     */
    private Integer scoreid;

    private String maxmin;

    private String level;

    private static final long serialVersionUID = 1L;

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public String getMaxmin() {
        return maxmin;
    }

    public void setMaxmin(String maxmin) {
        this.maxmin = maxmin;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scoreid=").append(scoreid);
        sb.append(", maxmin=").append(maxmin);
        sb.append(", level=").append(level);
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
        PScore other = (PScore) that;
        return (this.getScoreid() == null ? other.getScoreid() == null : this.getScoreid().equals(other.getScoreid()))
            && (this.getMaxmin() == null ? other.getMaxmin() == null : this.getMaxmin().equals(other.getMaxmin()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScoreid() == null) ? 0 : getScoreid().hashCode());
        result = prime * result + ((getMaxmin() == null) ? 0 : getMaxmin().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return result;
    }
}