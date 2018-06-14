Ext.define('fenzu.controller.FenzuController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.fenzuController',
	stores : [ 'FenzuStore' ],
	models : [ 'FenzuModel' ],
	views : [ 'FenzuGrid', 'FenzuEdit' ],
	init : function() {
		this.control({
			'fenzuGrid' : {
				itemdblclick : this.editFenzu
			},
			'FenzuEdit button[action=save]' : {
				click : this.updateFenzu
			}
		});
	},
	editFenzu : function(grid, record) {
		var view = Ext.widget('fenzuEdit');
		view.down('form').loadRecord(record);
	},
	updateFenzu : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	} 
});