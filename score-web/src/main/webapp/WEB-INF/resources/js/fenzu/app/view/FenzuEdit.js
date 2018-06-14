Ext.define('fenzu.view.FenzuEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.fenzuEdit',
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
				name : 'name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'studentno',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 'studentclass',
				fieldLabel : '班级'
			}, {
				xtype : 'textfield',
				name : 'studentsex',
				fieldLabel : '性别'
			},{
				xtype : 'textfield',
				name : 'studentdoing',
				fieldLabel : '任务'
			}, {
				xtype : 'textfield',
				name : 'studentzhiwu',
				fieldLabel : '职务'
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