//调试表原始对象
{
  "title" : "调试：com.intellij.database.psi.DbTableImpl",
  "methodList" : [ {
    "name" : "isSystem",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
    "value" : "false"
  }, {
    "name" : "isTemporary",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
    "value" : "false"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "getColumnAttrs",
    "desc" : "public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
    "value" : null
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "AccountsInfo"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "0"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "create table AccountsInfo\n(\n    UserID             int identity\n        constraint PK_AccountsInfo_UserID\n            primary key,\n    GameID             int\n        constraint DF_AccountsInfo_GameID default 0                        not null,\n    ProtectID          int\n        constraint DF_UserAccounts_ProtectID default 0                     not null,\n    PasswordID         int\n        constraint DF_AccountsInfo_PasswordID default 0                    not null,\n    SpreaderID         int\n        constraint DF_AccountsInfo_SpreaderID default 0                    not null,\n    Accounts           nvarchar(31)                                        not null,\n    NickName           nvarchar(31)\n        constraint DF_AccountsInfo_Nickname default ''                     not null,\n    RegAccounts        nvarchar(31)                                        not null,\n    UnderWrite         nvarchar(250)\n        constraint DF_UserAccounts_UnderWrite default ''                   not null,\n    PassPortID         nvarchar(18)\n        constraint DF_AccountsInfo_PassPortID default N''                  not null,\n    Compellation       nvarchar(16)\n        constraint DF_AccountsInfo_Compellation default N''                not null,\n    LogonPass          nchar(32)                                           not null,\n    InsurePass         nchar(32)\n        constraint DF_AccountsInfo_InsurePass default N''                  not null,\n    DynamicPass        nchar(32)\n        constraint DF_AccountsInfo_DynamicPass default ''                  not null,\n    DynamicPassTime    datetime\n        constraint DF_AccountsInfo_DynamicPassTime default getdate()       not null,\n    FaceID             smallint\n        constraint DF_UserAccounts_FaceID default 0                        not null,\n    CustomID           int\n        constraint DF_AccountsInfo_CustomFaceID default 0                  not null,\n    Present            int\n        constraint DF_AccountsInfo_Present default 0                       not null,\n    UserMedal          int\n        constraint DF_AccountsInfo_LoveLiness1 default 0                   not null,\n    Experience         int\n        constraint DF_UserAccounts_Experience default 0                    not null,\n    GrowLevelID        int\n        constraint DF_AccountsInfo_GrowLevelID default 1                   not null,\n    LoveLiness         int\n        constraint DF_AccountsInfo_LoveLiness default 0                    not null,\n    UserRight          int\n        constraint DF_AccountsInfo_UserRight default 0                     not null,\n    MasterRight        int\n        constraint DF_AccountsInfo_MasterRight default 0                   not null,\n    ServiceRight       int\n        constraint DF_AccountsInfo_ServiceRight default 0                  not null,\n    MasterOrder        tinyint\n        constraint DF_AccountsInfo_MasterOrder default 0                   not null,\n    MemberOrder        tinyint\n        constraint DF_UserAccounts_MemberOrder default 0                   not null,\n    MemberOverDate     datetime\n        constraint DF_UserAccounts_MemberOverDate default (1980 - 1) - 1   not null,\n    MemberSwitchDate   datetime\n        constraint DF_AccountsInfo_MemberSwitchDate default (1980 - 1) - 1 not null,\n    CustomFaceVer      tinyint\n        constraint DF_AccountsInfo_CustomFaceVer default 0                 not null,\n    Gender             tinyint\n        constraint DF_AccountsInfo_Gender default 0                        not null,\n    Nullity            tinyint\n        constraint DF_UserAccounts_ServiceNullity default 0                not null,\n    NullityOverDate    datetime\n        constraint DF_AccountsInfo_NullityOverDate default '1900-01-01'    not null,\n    StunDown           tinyint\n        constraint DF_AccountsInfo_CloseDown default 0                     not null,\n    MoorMachine        tinyint\n        constraint DF_AccountsInfo_MoorMachine default 0                   not null,\n    IsAndroid          tinyint\n        constraint DF_AccountsInfo_IsAndroid default 0                     not null,\n    WebLogonTimes      int\n        constraint DF_AccountsInfo_WebLogonTimes default 0                 not null,\n    GameLogonTimes     int\n        constraint DF_UserAccounts_AllLogonTimes default 0                 not null,\n    PlayTimeCount      int\n        constraint DF_AccountsInfo_PlayTimeCount default 0                 not null,\n    OnLineTimeCount    int\n        constraint DF_AccountsInfo_OnLineTimeCount default 0               not null,\n    LastLogonIP        nvarchar(15)                                        not null,\n    LastLogonDate      datetime\n        constraint DF_UserAccounts_LastLogonDate default getdate()         not null,\n    LastLogonMobile    nvarchar(11)\n        constraint DF_AccountsInfo_RegisterMobile1 default N''             not null,\n    LastLogonMachine   nvarchar(32)\n        constraint DF_AccountsInfo_MachineSerial default '------------'    not null,\n    RegisterIP         nvarchar(15)                                        not null,\n    RegisterDate       datetime\n        constraint DF_UserAccounts_RegisterDate default getdate()          not null,\n    RegisterMobile     nvarchar(11)\n        constraint DF_AccountsInfo_RegisterMobile default N''              not null,\n    RegisterMachine    nvarchar(32)\n        constraint DF_AccountsInfo_RegisterMachine default N'------------' not null,\n    RegisterOrigin     tinyint\n        constraint DF_AccountsInfo_RegisterOrigin default 0,\n    PlatformID         smallint\n        constraint DF_AccountsInfo_UserUin default 0                       not null,\n    UserUin            nvarchar(32)\n        constraint DF_AccountsInfo_UserUin_1 default N''                   not null,\n    RankID             int,\n    AgentID            int\n        constraint DF_AccountsInfo_AgentID default 0                       not null,\n    ParentID           int\n        constraint DF__AccountsI__Paren__351DDF8C default 0                not null,\n    UserType           tinyint\n        constraint DF__AccountsI__UserT__37FA4C37 default 0                not null,\n    Advertiser         nvarchar(50)\n        constraint DF__AccountsI__Adver__4B0D20AB default ''               not null,\n    LastLogonIPAddress nvarchar(50),\n    AdvertPlat         nvarchar(50)\n        constraint DF__AccountsI__Adver__54968AE5 default ''               not null,\n    LastLogoOrigin     tinyint\n        constraint DF_AccountsInfo_LastLogoOrigin default 0                not null,\n    RegisterMobileDate datetime\n        constraint DF_AccountsInfo_RegisterMobileDate default getdate()    not null\n)\ngo\n\nexec sp_addextendedproperty 'MS_Description', '平台用户信息表', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户标识', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'UserID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '游戏标识', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'GameID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '密保标识', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'ProtectID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '口令索引', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'PasswordID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '推广员标识', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'SpreaderID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户帐号', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'Accounts'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户昵称', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'NickName'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '注册帐号', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'RegAccounts'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '个性签名', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'UnderWrite'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '身份证号', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'PassPortID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '真实名字', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'Compellation'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '登录密码', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'LogonPass'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '安全密码', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'InsurePass'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '动态密码', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'DynamicPass'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '动态密码更新时间', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'DynamicPassTime'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '头像标识', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'FaceID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '自定标识', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'CustomID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '赠送礼物', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'Present'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户奖牌', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'UserMedal'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '经验数值', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'Experience'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户魅力', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'LoveLiness'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户权限', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'UserRight'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '管理权限', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'MasterRight'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '服务权限', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'ServiceRight'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '管理等级', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'MasterOrder'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '会员等级', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'MemberOrder'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '过期日期', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'MemberOverDate'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '切换时间', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'MemberSwitchDate'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '头像版本', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'CustomFaceVer'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户性别', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'Gender'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '禁止服务', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'Nullity'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '禁止时间', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'NullityOverDate'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '关闭标志', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'StunDown'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '固定机器', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'MoorMachine'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '是否机器人', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'IsAndroid'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '登录次数', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'WebLogonTimes'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '登录次数', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'GameLogonTimes'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '游戏时间', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'PlayTimeCount'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '在线时间', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'OnLineTimeCount'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '登录地址', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'LastLogonIP'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '登录时间', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'LastLogonDate'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '登录手机', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'LastLogonMobile'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '登录机器', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'LastLogonMachine'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '注册地址', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'RegisterIP'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '注册时间', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'RegisterDate'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '注册手机', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'RegisterMobile'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '注册机器', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'RegisterMachine'\ngo\n\nexec sp_addextendedproperty 'MS_Description', 'PC       0x00     ,\nANDROID  0x10(cocos 0x11,u3d 0x12)     ,\nITOUCH   0x20     ,\nIPHONE   0x30(cocos 0x31,u3d 0x32)     ,\nIPAD     0x40(cocos 0x41,u3d 0x42)     ,\nWEB      0x50     ', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'RegisterOrigin'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '=2 表示是游客', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'PlatformID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', 'T_Acc_Agent.AgentID 677这套代理', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo',\n     'COLUMN', 'ParentID'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '变色用', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'UserType'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '试玩任务ID', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'Advertiser'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '试玩平台名', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'AdvertPlat'\ngo\n\nexec sp_addextendedproperty 'MS_Description', '最后登录来源', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN',\n     'LastLogoOrigin'\ngo\n\ncreate index IX_AccountsInfo\n    on AccountsInfo (SpreaderID)\ngo\n\n"
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "平台用户信息表"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@526058e"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "IconWrapperWithTooltip:jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202020.2.2/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "com.intellij.psi.impl.PsiManagerImpl@5fe08d34"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbElementImpl.getWeight()",
    "value" : "10000"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Deferred. Base=IconWrapperWithTooltip:jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202020.2.2/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project(name=demo, containerState=ACTIVE, componentStore=E:\\Download\\test)"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: table, a_RYAccountsDB.dbo.AccountsInfo [Microsoft…@localhost] (Valid)"
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "table"
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "isQuoted",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isQuoted()",
    "value" : "true"
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "Microsoft SQL Server - @localhost: root"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "Microsoft SQL Server - @localhost: root"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "a_RYAccountsDB.dbo [Microsoft SQL Server - @localhost]"
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "AccountsInfo"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@12f06e26"
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "processDeclarations",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "createLayeredIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
    "value" : null
  }, {
    "name" : "registerIconLayer",
    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "overlayIcons",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@41fa4e06, COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@3d743150, com.intellij.semantic.SemServiceImpl$$Lambda$3992/0x0000000102662840=PsiCachedValueImpl{com.intellij.semantic.SemServiceImpl$$Lambda$3992/0x0000000102662840@8f8c09a}}"
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "getOwnReferences",
    "desc" : "public default java.lang.Iterable<? extends com.intellij.model.psi.PsiSymbolReference> com.intellij.psi.PsiElement.getOwnReferences()",
    "value" : "[]"
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@19e81efd"
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@19e81efd"
  }, {
    "name" : "createPointer",
    "desc" : "public default com.intellij.model.Pointer<? extends com.intellij.database.symbols.DasPsiSymbol> com.intellij.database.symbols.DasPsiSymbol.createPointer()",
    "value" : null
  }, {
    "name" : "getPsiDeclarations",
    "desc" : "public default com.intellij.util.containers.JBIterable<com.intellij.psi.PsiElement> com.intellij.database.symbols.DasPsiSymbol.getPsiDeclarations()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.psi.DbTable.getDasObject()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasTable com.intellij.database.psi.DbTable.getDasObject()",
    "value" : "AccountsInfo: table"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@5d0a7422"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "a_RYAccountsDB.dbo: schema"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "38"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@333ddb3f"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@653dbdd3"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "java.util.function.Function",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$1164/0x0000000100f2d040@6b987e32"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$1@5051d170"
  }, {
    "name" : "ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$2@de81c66"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "myUserMap",
    "type" : "com.intellij.util.keyFMap.KeyFMap",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@41fa4e06, COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@3d743150, com.intellij.semantic.SemServiceImpl$$Lambda$3992/0x0000000102662840=PsiCachedValueImpl{com.intellij.semantic.SemServiceImpl$$Lambda$3992/0x0000000102662840@8f8c09a}}"
  }, {
    "name" : "updater",
    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@5b3eb2d"
  } ]
}

//调试列原始对象
{
  "title" : "调试：com.intellij.database.psi.DbColumnImpl",
  "methodList" : [ {
    "name" : "getDefault",
    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
    "value" : null
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbColumnImpl.getWeight()",
    "value" : "10030"
  }, {
    "name" : "getDataType",
    "desc" : "public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
    "value" : "int"
  }, {
    "name" : "isNotNull",
    "desc" : "public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
    "value" : "true"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "UserID"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "column"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "1"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "alter table AccountsInfo\n    add UserID int identity\ngo\n\nexec sp_addextendedproperty 'MS_Description', '用户标识', 'SCHEMA', 'dbo', 'TABLE', 'AccountsInfo', 'COLUMN', 'UserID'\ngo\n\n"
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "用户标识"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@526058e"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "UserID: column"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "IconWrapperWithTooltip:jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202020.2.2/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "com.intellij.psi.impl.PsiManagerImpl@5fe08d34"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Deferred. Base=IconWrapperWithTooltip:jar:file:/D:/Program%20Files/JetBrains/IntelliJ%20IDEA%202020.2.2/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project(name=demo, containerState=ACTIVE, componentStore=E:\\Download\\test)"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "UserID: column"
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: column, a_RY…tsDB.dbo.Acco…Info.UserID [Microsoft…@localhost] (Valid)"
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "column"
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "UserID: column"
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "isQuoted",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isQuoted()",
    "value" : "true"
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "Microsoft SQL Server - @localhost: root"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "Microsoft SQL Server - @localhost: root"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "a_RYAccountsDB.dbo.AccountsInfo [Microsoft SQL Server - @localhost]"
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "UserID: column"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "UserID"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "UserID: column"
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@12f06e26"
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "UserID: column"
  }, {
    "name" : "processDeclarations",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "createLayeredIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
    "value" : null
  }, {
    "name" : "registerIconLayer",
    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "overlayIcons",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@53e44469}"
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "getOwnReferences",
    "desc" : "public default java.lang.Iterable<? extends com.intellij.model.psi.PsiSymbolReference> com.intellij.psi.PsiElement.getOwnReferences()",
    "value" : "[]"
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@19e81efd"
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@19e81efd"
  }, {
    "name" : "createPointer",
    "desc" : "public default com.intellij.model.Pointer<? extends com.intellij.database.symbols.DasPsiSymbol> com.intellij.database.symbols.DasPsiSymbol.createPointer()",
    "value" : null
  }, {
    "name" : "getPsiDeclarations",
    "desc" : "public default com.intellij.util.containers.JBIterable<com.intellij.psi.PsiElement> com.intellij.database.symbols.DasPsiSymbol.getPsiDeclarations()",
    "value" : "UserID: column"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.psi.DbColumn.getDasObject()",
    "value" : "UserID: column"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasColumn com.intellij.database.psi.DbColumn.getDasObject()",
    "value" : "UserID: column"
  }, {
    "name" : "getTableName",
    "desc" : "public default java.lang.String com.intellij.database.model.DasColumn.getTableName()",
    "value" : "AccountsInfo"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@5d0a7422"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "AccountsInfo: table"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "UserID: column"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "38"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@333ddb3f"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@653dbdd3"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "java.util.function.Function",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$1164/0x0000000100f2d040@6b987e32"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$1@5051d170"
  }, {
    "name" : "ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$2@de81c66"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "myUserMap",
    "type" : "com.intellij.util.keyFMap.KeyFMap",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@53e44469}"
  }, {
    "name" : "updater",
    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@5b3eb2d"
  } ]
}

//调试列原始列类型
{
  "title" : "调试：com.intellij.database.model.DataType",
  "methodList" : [ {
    "name" : "getLength",
    "desc" : "public int com.intellij.database.model.DataType.getLength()",
    "value" : "-1"
  }, {
    "name" : "getScale",
    "desc" : "public int com.intellij.database.model.DataType.getScale()",
    "value" : "0"
  }, {
    "name" : "getPrecision",
    "desc" : "public int com.intellij.database.model.DataType.getPrecision()",
    "value" : "-1"
  }, {
    "name" : "equalsWithoutJdbc",
    "desc" : "public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
    "value" : null
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean)",
    "value" : null
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification()",
    "value" : "int"
  }, {
    "name" : "withTypeName",
    "desc" : "public com.intellij.database.model.DataType com.intellij.database.model.DataType.withTypeName(java.lang.String)",
    "value" : null
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "MAX_SIZE",
    "type" : "int",
    "value" : "2147483647"
  }, {
    "name" : "STAR_SIZE",
    "type" : "int",
    "value" : "2147483646"
  }, {
    "name" : "NO_SIZE",
    "type" : "int",
    "value" : "-1"
  }, {
    "name" : "NO_SCALE",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "UNKNOWN",
    "type" : "com.intellij.database.model.DataType",
    "value" : "unknown"
  }, {
    "name" : "schemaName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "packageName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "typeName",
    "type" : "java.lang.String",
    "value" : "int"
  }, {
    "name" : "size",
    "type" : "int",
    "value" : "-1"
  }, {
    "name" : "scale",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "sizeUnit",
    "type" : "com.intellij.database.model.LengthUnit",
    "value" : "com.intellij.database.model.LengthUnit@1b391f5a"
  }, {
    "name" : "vagueArg",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "suffix",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "sizeUnitExplicit",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "custom",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "enumValues",
    "type" : "java.util.List",
    "value" : null
  }, {
    "name" : "jdbcType",
    "type" : "int",
    "value" : "0"
  } ]
}

//获取原始列类型中的字段
sqlType = int

//执行原始列类型中的方法
sqlTypeLen = -1