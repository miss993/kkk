var pageSize = 20;

Ext.define('fenzu.store.FenzuStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.fenzuStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'fenzu.model.FenzuModel',
	proxy : {
		url : server_context + '/fenzu/fenzu/.json',
		type : 'ajax',
		api : {
			read : server_context + '/fenzu/fenzu/.json',
			update : server_context + '/fenzu/fenzu/.json'
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