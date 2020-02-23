package com.zz.scw.order.bean;

import java.io.Serializable;

public class TOrder implements Serializable{
    private Integer id;

    private Integer memberid;

    private Integer projectid;

    private Integer returnid;

    private String ordernum;

    private String createdate;

    private Integer money;

    private Integer rtncount;

    private String status;

    private String address;

    private String invoice;

    private String invoictitle;

    private String remark;

    public TOrder(Integer id, Integer memberid, Integer projectid, Integer returnid, String ordernum, String createdate, Integer money, Integer rtncount, String status, String address, String invoice, String invoictitle, String remark) {
        this.id = id;
        this.memberid = memberid;
        this.projectid = projectid;
        this.returnid = returnid;
        this.ordernum = ordernum;
        this.createdate = createdate;
        this.money = money;
        this.rtncount = rtncount;
        this.status = status;
        this.address = address;
        this.invoice = invoice;
        this.invoictitle = invoictitle;
        this.remark = remark;
    }

    public TOrder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getReturnid() {
        return returnid;
    }

    public void setReturnid(Integer returnid) {
        this.returnid = returnid;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getRtncount() {
        return rtncount;
    }

    public void setRtncount(Integer rtncount) {
        this.rtncount = rtncount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public String getInvoictitle() {
        return invoictitle;
    }

    public void setInvoictitle(String invoictitle) {
        this.invoictitle = invoictitle == null ? null : invoictitle.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberid=").append(memberid);
        sb.append(", projectid=").append(projectid);
        sb.append(", returnid=").append(returnid);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", createdate=").append(createdate);
        sb.append(", money=").append(money);
        sb.append(", rtncount=").append(rtncount);
        sb.append(", status=").append(status);
        sb.append(", address=").append(address);
        sb.append(", invoice=").append(invoice);
        sb.append(", invoictitle=").append(invoictitle);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}