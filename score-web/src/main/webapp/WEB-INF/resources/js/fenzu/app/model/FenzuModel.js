Ext.define('fenzu.model.FenzuModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.fenzuModel',
	fields : [ {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'studentno',
		type : 'string',
		sortable : true
	}, {
		name : 'studentclass',
		type : 'string',
		sortable : true
	}, {
		name : 'studentsex',
		type : 'string',
		sortable : true
	}, {
		name : 'studentdoing',
		type : 'string',
		sortable : true
	}, {
		name : 'studentzhiwu',
		type : 'string',
		sortable : true
	} ]
});