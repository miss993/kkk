Ext.define('attendance.controller.AttendanceController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.attendanceController',
	stores : [ 'AttendanceStore' ],
	models : [ 'AttendanceModel' ],
	views : [ 'AttendanceGrid', 'AttendanceEdit' ],
	init : function() {
		this.control({
			'AttendanceGrid' : {
				itemdblclick : this.editAttendance
			},
			'attendanceEdit button[action=save]' : {
				click : this.updateAttendance
			}
		});
	},
	editAttendance : function(grid, record) {
		var view = Ext.widget('attendanceEdit');
		view.down('form').loadRecord(record);
	},
	updateAttendance : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	} 
});
