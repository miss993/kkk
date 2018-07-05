package edu.zut.cs.score.fenzu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;
import edu.zut.cs.score.fenzu.service.FenzuManager;
import edu.zut.cs.score.base.service.impl.GenericManagerImpl;
import edu.zut.cs.score.fenzu.dao.FenzuDao;
import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.fenzu.service.impl.FenzuManagerlmpl;

/**
 * FenzuManagerImpl继承了基础方法GenericManagerImpl 并且实现了接口fenzuManager
 * 
 * @author panshaoqian
 */
@Component
public class FenzuManagerlmpl extends GenericManagerImpl<Fenzu, Long> implements FenzuManager {
	FenzuDao fenzuDao;

	/**
	 * 重写 FenzuManager中的方法，用code找数据
	 * 
	 */
	@Override
	public List<Fenzu> findByStudentno(String studentno) {
		// 创建查询条件数据对象
		Fenzu objk = new Fenzu();
		objk.setDateCreated(null);
		objk.setDateModified(null);
		objk.setStudentno(studentno);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("studentno", GenericPropertyMatchers.startsWith());
		// 创建实例并查询
		Example<Fenzu> ex = Example.of(objk, matcher);
		List<Fenzu> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<Fenzu> findByname(String name) {
		// 创建查询条件数据对象
		Fenzu ojbk = new Fenzu();
		ojbk.setName(name);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("name", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified");
		// 创建实例并查询
		Example<Fenzu> ex = Example.of(ojbk, matcher);
		List<Fenzu> result = dao.findAll(ex);
		return result;
	}

	@Autowired
	public void setFenzuDao(FenzuDao fenzuDao) {
		this.fenzuDao = fenzuDao;
		this.dao = this.fenzuDao;
	}

}
