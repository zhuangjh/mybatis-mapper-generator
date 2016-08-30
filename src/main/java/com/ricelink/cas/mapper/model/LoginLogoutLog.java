package com.ricelink.cas.managed.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "login_logout_log")
public class LoginLogoutLog {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * login 登陆，logout 登出
     */
    @Column(name = "TYPE")
    private String type;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "SERVICE_ID")
    private String serviceId;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取login 登陆，logout 登出
     *
     * @return TYPE - login 登陆，logout 登出
     */
    public String getType() {
        return type;
    }

    /**
     * 设置login 登陆，logout 登出
     *
     * @param type login 登陆，logout 登出
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return SERVICE_ID
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}