package cc.mrbird.system.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import cc.mrbird.common.annotation.ExportConfig;
import cc.mrbird.web.domain.XgNeed;
import cc.mrbird.web.domain.XgProduction;

@Table(name = "t_user")
public class User implements Serializable {

	private static final long serialVersionUID = -4852732617765810959L;
	/**
	 * 账户有效
	 */
	public static final String STATUS_VALID = "1";
	/**
	 * 账户锁定
	 */
	public static final String STATUS_LOCK = "0";

	public static final String SEX_UNKNOW = "2";

	public static final String DEFAULT_THEME = "green";

	public static final String DEFAULT_AVATAR = "default.jpg";

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "USERNAME")
	@ExportConfig(value = "用户名")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "DEPT_ID")
	private Long deptId;

	@Transient
	@ExportConfig(value = "部门")
	private String deptName;

	@Column(name = "EMAIL")
	@ExportConfig(value = "邮箱")
	private String email;

	@Column(name = "MOBILE")
	@ExportConfig(value = "手机")
	private String mobile;

	@Column(name = "STATUS")
	@ExportConfig(value = "状态", convert = "s:0=锁定,1=有效")
	private String status = STATUS_VALID;

	@Column(name = "CRATE_TIME")
	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date crateTime;

	@Column(name = "MODIFY_TIME")
	private Date modifyTime;

	@Column(name = "LAST_LOGIN_TIME")
	private Date lastLoginTime;

	@Column(name = "SSEX")
	@ExportConfig(value = "性别", convert = "s:0=男,1=女,2=保密")
	private String ssex;

	@Column(name = "THEME")
	private String theme;

	@Column(name = "AVATAR")
	private String avatar;

	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "smsnum")
	private Long smsnum;

	@Transient
	private String roleName;

	

	private String isVip; //Y:是 N：不是

	private String profession;// 职业

	private String school;

	private String registedAddress;

	private String extend1;

	private String extend2;

	private String extend3;

	private Long companyId;

	private XgCompany companys;//0 是个人；其它是公司


//	private List<XgProduction> xgProductions;//作品
//
//	private  List<XgNeed> xgNeeds;
//



	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public XgCompany getCompanys() {
		return companys;
	}

	public void setCompanys(XgCompany companys) {
		this.companys = companys;
	}

	public String getIsVip() {
		return isVip;
	}

	public void setIsVip(String isVip) {
		this.isVip = isVip;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getRegistedAddress() {
		return registedAddress;
	}

	public void setRegistedAddress(String registedAddress) {
		this.registedAddress = registedAddress;
	}

	public String getExtend1() {
		return extend1;
	}

	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	public String getExtend2() {
		return extend2;
	}

	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}

	public String getExtend3() {
		return extend3;
	}

	public void setExtend3(String extend3) {
		this.extend3 = extend3;
	}

	/**
	 * @return USER_ID
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return USERNAME
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * @return PASSWORD
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * @return DEPT_ID
	 */
	public Long getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId
	 */
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return EMAIL
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * @return MOBILE
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	/**
	 * @return STATUS
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * @return CRATE_TIME
	 */
	public Date getCrateTime() {
		return crateTime;
	}

	/**
	 * @param crateTime
	 */
	public void setCrateTime(Date crateTime) {
		this.crateTime = crateTime;
	}

	/**
	 * @return MODIFY_TIME
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * @param modifyTime
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * @return LAST_LOGIN_TIME
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * @param lastLoginTime
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * @return SSEX
	 */
	public String getSsex() {
		return ssex;
	}

	/**
	 * @param ssex
	 */
	public void setSsex(String ssex) {
		this.ssex = ssex == null ? null : ssex.trim();
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getSmsnum() {
		return smsnum;
	}

	public void setSmsnum(Long smsnum) {
		this.smsnum = smsnum;
	}
}