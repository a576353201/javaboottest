import java.util.Date;
import java.io.Serializable;

/**
 * 平台用户信息表(Accountsinfo)实体类
 *
 * @author makejava
 * @since 2020-11-16 19:23:44
 */
public class Accountsinfo implements Serializable {
    private static final long serialVersionUID = -79808358323861573L;
    /**
    * 用户标识
    */
    private Integer userid;
    /**
    * 游戏标识
    */
    private Integer gameid;
    /**
    * 密保标识
    */
    private Integer protectid;
    /**
    * 口令索引
    */
    private Integer passwordid;
    /**
    * 推广员标识
    */
    private Integer spreaderid;
    /**
    * 用户帐号
    */
    private String accounts;
    /**
    * 用户昵称
    */
    private String nickname;
    /**
    * 注册帐号
    */
    private String regaccounts;
    /**
    * 个性签名
    */
    private String underwrite;
    /**
    * 身份证号
    */
    private String passportid;
    /**
    * 真实名字
    */
    private String compellation;
    /**
    * 登录密码
    */
    private String logonpass;
    /**
    * 安全密码
    */
    private String insurepass;
    /**
    * 动态密码
    */
    private String dynamicpass;
    /**
    * 动态密码更新时间
    */
    private Date dynamicpasstime;
    /**
    * 头像标识
    */
    private Integer faceid;
    /**
    * 自定标识
    */
    private Integer customid;
    /**
    * 赠送礼物
    */
    private Integer present;
    /**
    * 用户奖牌
    */
    private Integer usermedal;
    /**
    * 经验数值
    */
    private Integer experience;
    
    private Integer growlevelid;
    /**
    * 用户魅力
    */
    private Integer loveliness;
    /**
    * 用户权限
    */
    private Integer userright;
    /**
    * 管理权限
    */
    private Integer masterright;
    /**
    * 服务权限
    */
    private Integer serviceright;
    /**
    * 管理等级
    */
    private Integer masterorder;
    /**
    * 会员等级
    */
    private Integer memberorder;
    /**
    * 过期日期
    */
    private Date memberoverdate;
    /**
    * 切换时间
    */
    private Date memberswitchdate;
    /**
    * 头像版本
    */
    private Integer customfacever;
    /**
    * 用户性别
    */
    private Integer gender;
    /**
    * 禁止服务
    */
    private Integer nullity;
    /**
    * 禁止时间
    */
    private Date nullityoverdate;
    /**
    * 关闭标志
    */
    private Integer stundown;
    /**
    * 固定机器
    */
    private Integer moormachine;
    /**
    * 是否机器人
    */
    private Integer isandroid;
    /**
    * 登录次数
    */
    private Integer weblogontimes;
    /**
    * 登录次数
    */
    private Integer gamelogontimes;
    /**
    * 游戏时间
    */
    private Integer playtimecount;
    /**
    * 在线时间
    */
    private Integer onlinetimecount;
    /**
    * 登录地址
    */
    private String lastlogonip;
    /**
    * 登录时间
    */
    private Date lastlogondate;
    /**
    * 登录手机
    */
    private String lastlogonmobile;
    /**
    * 登录机器
    */
    private String lastlogonmachine;
    /**
    * 注册地址
    */
    private String registerip;
    /**
    * 注册时间
    */
    private Date registerdate;
    /**
    * 注册手机
    */
    private String registermobile;
    /**
    * 注册机器
    */
    private String registermachine;
    /**
    * PC       0x00     ,
ANDROID  0x10(cocos 0x11,u3d 0x12)     ,
ITOUCH   0x20     ,
IPHONE   0x30(cocos 0x31,u3d 0x32)     ,
IPAD     0x40(cocos 0x41,u3d 0x42)     ,
WEB      0x50     
    */
    private Integer registerorigin;
    /**
    * =2 表示是游客
    */
    private Integer platformid;
    
    private String useruin;
    
    private Integer rankid;
    
    private Integer agentid;
    /**
    * T_Acc_Agent.AgentID 677这套代理
    */
    private Integer parentid;
    /**
    * 变色用
    */
    private Integer usertype;
    /**
    * 试玩任务ID
    */
    private String advertiser;
    
    private String lastlogonipaddress;
    /**
    * 试玩平台名
    */
    private String advertplat;
    /**
    * 最后登录来源
    */
    private Integer lastlogoorigin;
    
    private Date registermobiledate;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public Integer getProtectid() {
        return protectid;
    }

    public void setProtectid(Integer protectid) {
        this.protectid = protectid;
    }

    public Integer getPasswordid() {
        return passwordid;
    }

    public void setPasswordid(Integer passwordid) {
        this.passwordid = passwordid;
    }

    public Integer getSpreaderid() {
        return spreaderid;
    }

    public void setSpreaderid(Integer spreaderid) {
        this.spreaderid = spreaderid;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRegaccounts() {
        return regaccounts;
    }

    public void setRegaccounts(String regaccounts) {
        this.regaccounts = regaccounts;
    }

    public String getUnderwrite() {
        return underwrite;
    }

    public void setUnderwrite(String underwrite) {
        this.underwrite = underwrite;
    }

    public String getPassportid() {
        return passportid;
    }

    public void setPassportid(String passportid) {
        this.passportid = passportid;
    }

    public String getCompellation() {
        return compellation;
    }

    public void setCompellation(String compellation) {
        this.compellation = compellation;
    }

    public String getLogonpass() {
        return logonpass;
    }

    public void setLogonpass(String logonpass) {
        this.logonpass = logonpass;
    }

    public String getInsurepass() {
        return insurepass;
    }

    public void setInsurepass(String insurepass) {
        this.insurepass = insurepass;
    }

    public String getDynamicpass() {
        return dynamicpass;
    }

    public void setDynamicpass(String dynamicpass) {
        this.dynamicpass = dynamicpass;
    }

    public Date getDynamicpasstime() {
        return dynamicpasstime;
    }

    public void setDynamicpasstime(Date dynamicpasstime) {
        this.dynamicpasstime = dynamicpasstime;
    }

    public Integer getFaceid() {
        return faceid;
    }

    public void setFaceid(Integer faceid) {
        this.faceid = faceid;
    }

    public Integer getCustomid() {
        return customid;
    }

    public void setCustomid(Integer customid) {
        this.customid = customid;
    }

    public Integer getPresent() {
        return present;
    }

    public void setPresent(Integer present) {
        this.present = present;
    }

    public Integer getUsermedal() {
        return usermedal;
    }

    public void setUsermedal(Integer usermedal) {
        this.usermedal = usermedal;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getGrowlevelid() {
        return growlevelid;
    }

    public void setGrowlevelid(Integer growlevelid) {
        this.growlevelid = growlevelid;
    }

    public Integer getLoveliness() {
        return loveliness;
    }

    public void setLoveliness(Integer loveliness) {
        this.loveliness = loveliness;
    }

    public Integer getUserright() {
        return userright;
    }

    public void setUserright(Integer userright) {
        this.userright = userright;
    }

    public Integer getMasterright() {
        return masterright;
    }

    public void setMasterright(Integer masterright) {
        this.masterright = masterright;
    }

    public Integer getServiceright() {
        return serviceright;
    }

    public void setServiceright(Integer serviceright) {
        this.serviceright = serviceright;
    }

    public Integer getMasterorder() {
        return masterorder;
    }

    public void setMasterorder(Integer masterorder) {
        this.masterorder = masterorder;
    }

    public Integer getMemberorder() {
        return memberorder;
    }

    public void setMemberorder(Integer memberorder) {
        this.memberorder = memberorder;
    }

    public Date getMemberoverdate() {
        return memberoverdate;
    }

    public void setMemberoverdate(Date memberoverdate) {
        this.memberoverdate = memberoverdate;
    }

    public Date getMemberswitchdate() {
        return memberswitchdate;
    }

    public void setMemberswitchdate(Date memberswitchdate) {
        this.memberswitchdate = memberswitchdate;
    }

    public Integer getCustomfacever() {
        return customfacever;
    }

    public void setCustomfacever(Integer customfacever) {
        this.customfacever = customfacever;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getNullity() {
        return nullity;
    }

    public void setNullity(Integer nullity) {
        this.nullity = nullity;
    }

    public Date getNullityoverdate() {
        return nullityoverdate;
    }

    public void setNullityoverdate(Date nullityoverdate) {
        this.nullityoverdate = nullityoverdate;
    }

    public Integer getStundown() {
        return stundown;
    }

    public void setStundown(Integer stundown) {
        this.stundown = stundown;
    }

    public Integer getMoormachine() {
        return moormachine;
    }

    public void setMoormachine(Integer moormachine) {
        this.moormachine = moormachine;
    }

    public Integer getIsandroid() {
        return isandroid;
    }

    public void setIsandroid(Integer isandroid) {
        this.isandroid = isandroid;
    }

    public Integer getWeblogontimes() {
        return weblogontimes;
    }

    public void setWeblogontimes(Integer weblogontimes) {
        this.weblogontimes = weblogontimes;
    }

    public Integer getGamelogontimes() {
        return gamelogontimes;
    }

    public void setGamelogontimes(Integer gamelogontimes) {
        this.gamelogontimes = gamelogontimes;
    }

    public Integer getPlaytimecount() {
        return playtimecount;
    }

    public void setPlaytimecount(Integer playtimecount) {
        this.playtimecount = playtimecount;
    }

    public Integer getOnlinetimecount() {
        return onlinetimecount;
    }

    public void setOnlinetimecount(Integer onlinetimecount) {
        this.onlinetimecount = onlinetimecount;
    }

    public String getLastlogonip() {
        return lastlogonip;
    }

    public void setLastlogonip(String lastlogonip) {
        this.lastlogonip = lastlogonip;
    }

    public Date getLastlogondate() {
        return lastlogondate;
    }

    public void setLastlogondate(Date lastlogondate) {
        this.lastlogondate = lastlogondate;
    }

    public String getLastlogonmobile() {
        return lastlogonmobile;
    }

    public void setLastlogonmobile(String lastlogonmobile) {
        this.lastlogonmobile = lastlogonmobile;
    }

    public String getLastlogonmachine() {
        return lastlogonmachine;
    }

    public void setLastlogonmachine(String lastlogonmachine) {
        this.lastlogonmachine = lastlogonmachine;
    }

    public String getRegisterip() {
        return registerip;
    }

    public void setRegisterip(String registerip) {
        this.registerip = registerip;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getRegistermobile() {
        return registermobile;
    }

    public void setRegistermobile(String registermobile) {
        this.registermobile = registermobile;
    }

    public String getRegistermachine() {
        return registermachine;
    }

    public void setRegistermachine(String registermachine) {
        this.registermachine = registermachine;
    }

    public Integer getRegisterorigin() {
        return registerorigin;
    }

    public void setRegisterorigin(Integer registerorigin) {
        this.registerorigin = registerorigin;
    }

    public Integer getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    public String getUseruin() {
        return useruin;
    }

    public void setUseruin(String useruin) {
        this.useruin = useruin;
    }

    public Integer getRankid() {
        return rankid;
    }

    public void setRankid(Integer rankid) {
        this.rankid = rankid;
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public String getLastlogonipaddress() {
        return lastlogonipaddress;
    }

    public void setLastlogonipaddress(String lastlogonipaddress) {
        this.lastlogonipaddress = lastlogonipaddress;
    }

    public String getAdvertplat() {
        return advertplat;
    }

    public void setAdvertplat(String advertplat) {
        this.advertplat = advertplat;
    }

    public Integer getLastlogoorigin() {
        return lastlogoorigin;
    }

    public void setLastlogoorigin(Integer lastlogoorigin) {
        this.lastlogoorigin = lastlogoorigin;
    }

    public Date getRegistermobiledate() {
        return registermobiledate;
    }

    public void setRegistermobiledate(Date registermobiledate) {
        this.registermobiledate = registermobiledate;
    }

}