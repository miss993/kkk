Ext.define('finaltest.model.FinalTestModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.finaltestModel',
	fields : [ {
		name : 'sno',
		type : 'string',
		sortable : true
	}, {
		name : 'sname',
		type : 'string',
		sortable : true
	}, {
		name : 'sscore',
		type : 'string',
		sortable : true
	} , {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}]
});