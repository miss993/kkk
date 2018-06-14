Ext.define('attendance.view.AttendanceEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.attendanceEdit',
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
			},  {
				xtype : 'textfield',
				name : 'clazz',
				fieldLabel : '班级'
			},{
				xtype : 'textfield',
				name : 'day1',
				fieldLabel : '考勤'
			}, {
				xtype : 'textfield',
				name : 'day2',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day3',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day4',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day5',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day6',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day7',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day8',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day9',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'day10',
				fieldLabel : '考勤'
			},{
				xtype : 'textfield',
				name : 'ascore',
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
