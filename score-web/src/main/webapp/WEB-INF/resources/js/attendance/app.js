Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'attendance',
	appFolder : server_context + '/resources/js/attendance/app',
	controllers : [ 'AttendanceController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'attendanceGrid'
			} ]
		});
	}
});
