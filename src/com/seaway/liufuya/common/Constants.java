package com.seaway.liufuya.common;


public class Constants {

	// 页面字符串
	/**
	 * MyLoginForm.java 登录页面文字
	 */
	public static final String lunaLoginLeft = "欢迎使用";
	public static final String lunaLoginRight = "留夫鸭电商核心管理系统";
	public static final String lunaLoginUsername = "账户名";
	public static final String lunaLoginPassword = "密码";

	/**
	 * 当前登录用户Session常量
	 */
	public static final String CURRENT_LOGIN_NAME = "CURRENT_LOGIN_NAME";
	public static final String CURRENT_LOGIN_USER = "CURRENT_LOGIN_USER";
	/**
	 * 登录验证码Session常量
	 */
	public static final String KAPTCHA_SESSION_KEY = "KAPTCHA_SESSION_KEY";

	// 存入验证码的 Session Name
	public static final String VALIDATION_CODE = "validation_code";

	// --------------------------------------------------------------------------
	// 分页，页面最大显示数据条数
	public static final int MEMBER_ADDRESS_PAGEROWS = 20; // CRM管理
															// ，会员扩张信息管理页面最大显示条数

	// ---------------------------------------------------------------------------
	// 会员管理界面，左侧树状菜单 节点值
	public static final String[] CRM_MENUS_TREE1 = { "会员资料", "扩展资料", "会员等级",
			"会员活动", "会员黑名单", "诉求类别", "会员诉求", "短信发送" }; //
	// 积分管理
	public static final String[] CRM_MENUS_TREE2 = { "兑奖规则信息管理", "兑换奖品资料管理",
			"消费积分规则管理", "会员积分兑换管理"}; //"会员积分调整", "会员积分清除", "会员积分补录"

	// 所有将会被点击到的 菜单值数组，用于在 CrmManageScreen.java 中 itemClick(ItemClickEvent
	// event) 方法中调用
	public static final String[] CRM_MENUS_ITEMCLICK = { "会员资料", "扩展资料",
			"会员等级", "会员活动", "会员黑名单", "诉求类别", "会员诉求", "短信发送", "兑奖规则信息管理",
			"兑换奖品资料管理", "消费积分规则管理", "会员积分兑换管理", "会员积分调整", "会员积分清除", "会员积分补录" };

	public static final Object[][] CRM_MENUS_TREE = new Object[][] {
			new Object[] { "会员管理", "会员资料", "扩展资料", "会员等级", "会员活动", "会员黑名单",
					"诉求类别", "会员诉求", "短信发送" },
			new Object[] { "积分管理", "兑奖规则信息管理", "兑换奖品资料管理", "消费积分规则管理",
					"会员积分兑换管理", "会员积分调整", "会员积分清除", "会员积分补录" } };
	public static final Object[][] CRM_REPORT_TREE = new Object[][] {
		new Object[] { "会员报表", "会员诉求报表", "会员查询报表"},
		new Object[] { "门店报表", "门店统计报表", "门店配送报表", "门店销量报表"},
		new Object[] { "销售报表", "当天销售情况报表", "历史销售情况报表", "自定义格式报表"}};

	// ---------------------------------------------------------------------------
	// 从留夫鸭现有 POS 数据库中获取会员信息、门店信息的接口
	// 根 URL
	public static final String POSOUT_BASEURL = "http://115.29.12.128:8080/posout/";
	// 获取留夫鸭数据库中三个表中的数据条数
	public static final String CRDS_COUNT_URL = "getCrdsCount";
	public static final String VIP_COUNT_URL = "getVipCount";
	public static final String SHOP_COUNT_URL = "getShopCount";
	// 获取留夫鸭数据库中三个表中的详细数据列表
	public static final String CRDS_LIST_URL = "getCrdsList";
	public static final String VIP_LIST_URL = "getVipList";
	public static final String SHOP_LIST_URL = "getShopList";

	// ---------------------------------------------------------------------------
	// 会员管理模块，第一个子菜单选中后，右侧表格显示数据的条数
	// com.seaway.liufuya.mvc.crm.memberinfo.layout.MemberInfoListView
	/**
	 * Natural property order for Person bean. Used in tables and forms.
	 */
	public static final String[] MEMEBER_COL_REPORT = new String[] {
			"realName", "user_type","loginName","sex", "birthday","work_type", "city", "entityCardNumber",
			"memberCard_score", "memberCard_balance", "create_date","status"};
	/**
	 * "表头列名" captions for properties in same order as in NATURAL_COL_ORDER.
	 */
	public static final String[] MEMEBER_COL_REPORT_CHINESE = new String[] {
		"用户名", "用户类型","手机号","性别","生日","工作", "城市", "实体卡号", "积分", "余额", "注册日期","状态" };
	
	/**
	 * "表头列名" captions for properties in same order as in NATURAL_COL_ORDER.
	 */
	public static final String[] MEMEBER_COL_HEADERS_CHINESE = new String[] {
		"手机号码", "名称", "性别", "类型", "城市", "实体卡号", "积分", "余额", "注册日期" };
	
	/**
	 * Natural property order for Person bean. Used in tables and forms.
	 */
	public static final Object[] MEMEBER_COL_ORDER = new String[] {
		"loginname", "realname", "usersex", "usertype", "city", "cardid",
		"cardscore", "cardbalance", "createdate" };
	

	// 会员表单中的固定下拉菜单的值
	public static final String[] MEMBER_AGE_AREAS = new String[] { "60前",
			"60后", "70后", "80后", "90后", "00后", "10后" }; // 年龄段
	public static final String[] MEMBER_WORK_TYPES = new String[] { "科研人员",
			"律师/法务/合规", "教师", "医院/医疗/护理", "公务员", "在校学生", "翻译", "建筑", "行政/后勤",
			"互联网/电子商务/网游", "销售人员", "采购", "公关/媒介", "酒店/旅游", "计算机软件", "物流/仓储",
			"人力资源", "艺术/设计", "其他" }; // 工作类型
	public static final String[] MEMBER_FAMILY_MONEY = new String[] { "1000以下",
			"1000-3000", "3000-5000", "10000-20000", "20000-50000", "50000以上" }; // 家庭收入
	public static final String[] MEMBER_ENTITY_CARD_STATUS = new String[] {
			"已开卡", "已使用", "已作废" }; // 实体卡状态
	public static final String[] MEMBER_REG_TYPES = new String[] { "实体卡注册",
			"网站注册", "微信注册", "后台注册" }; // 会员注册类型

	// ---------------------------------------------------------------------------
	// 会员扩展资料，
	public static final Object[] MEMEBER_ADD_COL_ORDER = new String[] {
			"loginname", "realname", "usersex", "usertype", "city", "cardid" };
	// "表头列名" captions for properties in same order as in NATURAL_COL_ORDER.
	public static final String[] MEMEBER_ADD_COL_HEADERS_CHINESE = new String[] {
			"手机号码", "名称", "性别", "类型", "城市", "实体卡号" };

	public static final Object[] MEMEBER_ADDRESS_COL_ORDER = new String[] {
			"city", "area", "address_keywords", "gps_long", "gps_lat",
			"is_default", "is_available", "create_date" };
	// "表头列名" captions for properties in same order as in NATURAL_COL_ORDER.
	public static final String[] MEMEBER_ADDRESS_COL_HEADERS_CHINESE = new String[] {
			"城市", "区域", "地址", "经度", "纬度", "默认地址", "能否配送", "创建日期" };

	// ---------------------------------------------------------------------------
	// 会员等级列表
	public static final Object[] MEMEBER_LEVEL_ORDER = new String[] {
			"levelName", "levelBegin", "levelEnd", "createTime", "createPerson" };
	// "表头列名" captions for properties in same order as in NATURAL_COL_ORDER.
	public static final String[] MEMEBER_LEVEL_CHINESE = new String[] { "等级名称",
			"起始积分", "结束积分", "创建时间", "创建人" };

	// ---------------------------------------------------------------------------
	// 会员扩展资料，
	public static final Object[] EXCHANGE_RULE_TABLE_COL = new String[] {
			"ruleCode", "ruleName", "ruleNumberBegin", "ruleNumberEnd",
			"remark", "startDate", "createPerson", "status" };

	public static final String[] EXCHANGE_RULE_TABLE_COL_HEADERS_CHINESE = new String[] {
			"规则代码", "规则名称", "规则起始", "规则结束", "备注", "开始时间", "创建人", "状态" };

	// ----------------------------------------------------------------------------
	// 诉求类别
	// 诉求类型
	public static final Object[] COMPLAIN_TYPE_COL = new String[] { "typeName",
			"createDate", "createPerson", "status", "remark" };
	// 表明列头
	public static final String[] COMPLAIN_TYPE_COL_HEADERS_CHINESE = new String[] {
			"诉求类型", "创建时间", "创建人", "状态", "备注" };
	
	// ----------------------------------------------------------------------------
	// 诉求
	// 诉求
	public static final Object[] COMPLAIN_COL = new String[] { "complainCode","typeName", "relName", "telPhone", "createTime","adminPerson","isOk","remark","complainContent","updateDate" };
	// 表明列头
	public static final String[] COMPLAIN_COL_HEADERS_CHINESE = new String[] {"诉求编码", "诉求类型", "会员", "会员电话", "投诉时间","处理人","诉求状态","处理意见","投诉内容","回复时间" };

}
