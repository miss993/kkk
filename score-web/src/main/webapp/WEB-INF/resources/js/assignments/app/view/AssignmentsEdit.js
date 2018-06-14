Ext.define('assignments.view.AssignmentsEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.assignmentsEdit',
	title : '编辑作业成绩',
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
				name : 'stuid',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 'name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'score1',
				fieldLabel : '第一次作业成绩'
			}, {
				xtype : 'textfield',
				name : 'score2',
				fieldLabel : '第二次作业成绩'
			}, {
				xtype : 'textfield',
				name : 'score3',
				fieldLabel : '第三次作业成绩'
			}, {
				xtype : 'textfield',
				name : 'score4',
				fieldLabel : '第四次作业成绩'
			}, {
				xtype : 'textfield',
				name : 'score5',
				fieldLabel : '第五次作业成绩'
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
