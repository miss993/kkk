var pageSize = 20;

var homeworkStore = Ext.create('assignments.store.AssignmentsStore');

Ext.define('assignments.view.AssignmentsGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.assignmentsGrid',
	title : 'Java EE 课程-五次作业成绩',
	store : assignmentsStore,
	columns : [ {
		text : "学号",
		width : 160,
		sortable : true,
		dataIndex : 'stuid'
	}, {
		text : "姓名",
		width : 120,
		sortable : true,
		dataIndex : 'name'
	} ,{
		text : "第一次作业成绩",
		width : 120,
		sortable : true,
		dataIndex : 'score1'
	} ,{
		text : "第二次作业成绩",
		width : 120,
		sortable : true,
		dataIndex : 'score2'
	} ,{
		text : "第三次作业成绩",
		width : 120,
		sortable : true,
		dataIndex : 'score3'
	} ,{
		text : "第四次作业成绩",
		width : 120,
		sortable : true,
		dataIndex : 'score4'
	} ,{
		text : "第五次作业成绩",
		width : 120,
		sortable : true,
		dataIndex : 'score5'
	}],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : homeworkStore,
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
