var pageSize = 20;

var fenzuStore = Ext.create('fenzu.store.FenzuStore');

Ext.define('fenzu.view.FenzuGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.fenzuGrid',
	title : 'Java EE 分组管理',
	store : fenzuStore,
	columns : [ {
		text : '学号',
		width : 160,
		sortable : true,
		dataIndex : 'studentno'
	}, {
		text : "班级",
		width : 160,
		sortable : true,
		dataIndex : 'studentclass'
	}, {
		text : "姓名",
		width : 120,
		sortable : true,
		dataIndex : 'name'
	}, {
		text : "性别",
		width : 80,
		sortable : true,
		dataIndex : 'studentsex'
	},{
		text : "任务",
		width : 420,
		sortable : true,
		dataIndex : 'studentdoing'
	}, {
		text : " 职务",
		width : 420,
		sortable : true,
		dataIndex : 'studentzhiwu'
	}], 
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : fenzuStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});
