Ext.define('homework.model.HomeworkModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.homeworkModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'code',
		type : 'string',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'sex',
		type : 'string',
		sortable : true
	}, {
		name : 'major',
		type : 'string',
		sortable : true
	}, {
		name : 'grade',
		type : 'string',
		sortable : true
	}, {
		name : 'address',
		type : 'string',
		sortable : true
	},{
		name : 'mark',
		type : 'integer',
		sortable : true
	},{
		name : 'finalmark',
		type : 'integer',
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