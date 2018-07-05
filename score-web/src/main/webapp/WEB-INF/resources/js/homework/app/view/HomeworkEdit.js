Ext.define('homework.view.HomeworkEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.homeworkEdit',
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
				name : 'name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'sex',
				fieldLabel : '性别'
			}, {
				xtype : 'textfield',
				name : 'grade',
				fieldLabel : '年级'
			},{
				xtype : 'textfield',
				name : 'major',
				fieldLabel : '专业'
			}, {
				xtype : 'textfield',
				name : 'address',
				fieldLabel : '班级'
			},{
				xtype : 'textfield',
				name : 'mark',
				fieldLabel : '平时成绩'
			},{
				xtype : 'textfield',
				name : 'finalmark',
				fieldLabel : '验收成绩'
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
