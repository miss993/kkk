var pageSize = 20;

var attendanceStore = Ext.create('attendance.store.AttendanceStore');

Ext.define('attendance.view.AttendanceGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.attendanceGrid',
	title : 'Java EE 平时考勤',
	store : attendanceStore,
	columns : [ {
		text : "学号",
		width : 90,
		sortable : true,
		dataIndex : 'code'
	}, {
		text : "姓名",
		width : 80,
		sortable : true,
		dataIndex : 'name'
	}, {
		text : "班级",
		width : 80,
		sortable : true,
		dataIndex : 'clazz'
	}, {
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day1'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day2'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day3'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day4'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day5'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day6'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day7'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day8'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day9'
	},{
		text : "考勤",
		width : 80,
		sortable : true,
		dataIndex : 'day10'
	},{
		text : "成绩",
		width : 120,
		sortable : true,
		dataIndex : 'ascore'
	}],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : attendanceStore,
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
