Ext.define('finaltest.controller.FinalTestController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.finaltestController',
	stores : [ 'FinalTestStore' ],
	models : [ 'FinalTestModel' ],
	views : [ 'FinalTestGrid', 'FinalTestEdit' ],
	init : function() {
		this.control({
			'finaltestGrid' : {
				itemdblclick : this.editFinalTest
			},
			'studentEdit button[action=save]' : {
				click : this.updateFinalTest
			}
		});
	},
	editStudent : function(grid, record) {
		var view = Ext.widget('finaltestEdit');
		view.down('form').loadRecord(record);
	},
	updateStudent : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
