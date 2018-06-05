var pageSize = 20;

var homeworkStore = Ext.create('homework.store.HomeworkStore');

Ext.define('homework.view.HomeworkGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.homeworkGrid',
	title : 'Java EE 课程-学生列表',
	store : homeworkStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "学号",
		width : 120,
		sortable : true,
		dataIndex : 'code'
	}, {
		text : "姓名",
		width : 80,
		sortable : true,
		dataIndex : 'name'
	}, {
		text : "性别",
		width : 80,
		sortable : true,
		dataIndex : 'sex'
	}, {
		text : " 专业",
		width : 80,
		sortable : true,
		dataIndex : 'major'
	}, {
		text : "年级",
		width : 80,
		sortable : true,
		dataIndex : 'grade'
	}, {
		text : "班级",
		width : 80,
		sortable : true,
		dataIndex : 'address'
	},  {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : studentStore,
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
