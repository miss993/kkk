var pageSize = 20;

Ext.define('finalscore.store.FinalTestStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.finaltestStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'finalscore.model.FinalTestModel',
	proxy : {
		url : server_context + '/finalscore/finalscore/.json',
		type : 'ajax',
		api : {
			read : server_context + '/finalscore/finalscore/.json',
			update : server_context + '/finalscore/finalscore/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});