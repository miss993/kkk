Ext.define('finalscore.model.FinalTestModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.finaltestModel',
	fields : [ {
		name : 'sno',
		type : 'int',
		sortable : true
	}, {
		name : 'sname',
		type : 'string',
		sortable : true
	}, {
		name : 'sscore',
		type : 'int',
		sortable : true
	} ]
});