Ext.define('finalscore.view.FinalTestEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.finaltestEdit',
	title : '编辑学生信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'code',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 'sno',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'sname',
				fieldLabel : '成绩'
			}]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
