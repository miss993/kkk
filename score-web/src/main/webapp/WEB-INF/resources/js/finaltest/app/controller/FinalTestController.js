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
			'finaltestEdit button[action=save]' : {
				click : this.updateFinalTest
			}
		});
	},
	editFinalTest : function(grid, record) {
		var view = Ext.widget('finaltestEdit');
		view.down('form').loadRecord(record);
	},
	updateFinalTest : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
