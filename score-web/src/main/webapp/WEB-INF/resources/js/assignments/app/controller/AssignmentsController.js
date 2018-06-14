Ext.define('assignments.controller.AssignmentsController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.assignmentsController',
	stores : [ 'AssignmentsStore' ],
	models : [ 'AssignmentsModel' ],
	views : [ 'AssignmentsGrid', 'AssignmentsEdit' ],
	init : function() {
		this.control({
			'AssignmentsGrid' : {
				itemdblclick : this.editHomework
			},
			'AssignmentsEdit button[action=save]' : {
				click : this.updateHomework
			}
		});
	},
	editHomework : function(grid, record) {
		var view = Ext.widget('AssignmentsEdit');
		view.down('form').loadRecord(record);
	},
	updateHomework : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	} 
});
