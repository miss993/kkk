Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'finaltest',
	appFolder : server_context + '/resources/js/finaltest/app',
	controllers : [ 'FinalTestController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'finaltestGrid'
			} ]
		});
	}
});
