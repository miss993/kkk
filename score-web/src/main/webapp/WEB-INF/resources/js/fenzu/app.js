Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'fenzu',
	appFolder : server_context + '/resources/js/fenzu/app',
	controllers : [ 'FenzuController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'fenzuGrid'
			} ]
		});
	}
});
