Ext.define('attendance.model.AttendanceModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.attendanceModel',
	fields : [ {
		name : 'code',
		type : 'string',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'clazz',
		type : 'string',
		sortable : true
	}, {
		name : 'day1',
		type : 'string',
		sortable : true
	},{
		name : 'day2',
		type : 'string',
		sortable : true
	},{
		name : 'day3',
		type : 'string',
		sortable : true
	},{
		name : 'day4',
		type : 'string',
		sortable : true
	},{
		name : 'day5',
		type : 'string',
		sortable : true
	},{
		name : 'day6',
		type : 'string',
		sortable : true
	},{
		name : 'day7',
		type : 'string',
		sortable : true
	},{
		name : 'day8',
		type : 'string',
		sortable : true
	},{
		name : 'day9',
		type : 'string',
		sortable : true
	},{
		name : 'day10',
		type : 'string',
		sortable : true
	},
	{
		name : 'ascore',
		type : 'string',
		sortable : true
	},{
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});