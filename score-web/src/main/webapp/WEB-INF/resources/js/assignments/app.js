Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'assignments',
	appFolder : server_context + '/resources/js/assignments/app',
	controllers : [ 'AssignmentsController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'assignmentsGrid'
			} ]
		});
	}
});
