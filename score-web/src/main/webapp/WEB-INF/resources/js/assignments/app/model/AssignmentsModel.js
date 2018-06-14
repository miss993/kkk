Ext.define('assignments.model.AssignmentsModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.assignmentsModel',
	fields : [ {
		name : 'stuid',
		type : 'string',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'score1',
		type : 'string',
		sortable : true
	}, {
		name : 'score2',
		type : 'string',
		sortable : true
	}, {
		name : 'score3',
		type : 'string',
		sortable : true
	}, {
		name : 'score4',
		type : 'string',
		sortable : true
	}, {
		name : 'score5',
		type : 'string',
		sortable : true
	}, {
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