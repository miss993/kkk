Ext.define('assignments.controller.AssignmentsController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.assignmentsController',
	stores : [ 'AssignmentsStore' ],
	models : [ 'AssignmentsModel' ],
	views : [ 'AssignmentsGrid', 'AssignmentsEdit' ],
	init : function() {
		this.control({
			'assignmentsGrid' : {
				itemdblclick : this.editAssignments
			},
			'assignmentsEdit button[action=save]' : {
				click : this.updateAssignments
			}
		});
	},
	editAssignments : function(grid, record) {
		var view = Ext.widget('assignmentsEdit');
		view.down('form').loadRecord(record);
	},
	updateAssignments : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	} 
});
