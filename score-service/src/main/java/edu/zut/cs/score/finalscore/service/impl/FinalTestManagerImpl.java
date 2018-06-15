package edu.zut.cs.score.finalscore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;


import edu.zut.cs.score.base.service.impl.GenericManagerImpl;
import edu.zut.cs.score.finalscore.domain.FinalTest;
import edu.zut.cs.score.finalscore.service.FinalTestManager;
import edu.zut.cs.score.finalscore.dao.FinalTestDao;

@Component
public class FinalTestManagerImpl extends GenericManagerImpl<FinalTest, Long> implements FinalTestManager{

	FinalTestDao finaltestDao;

	@Override
	public List<FinalTest> findBySno(String sno) {

		// 创建查询条件数据对象
		FinalTest queryObject = new FinalTest();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setSno(sno);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("postcode", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
		// 创建实例并查询
		Example<FinalTest> ex = Example.of(queryObject, matcher);
		List<FinalTest> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<FinalTest> findBySname(String sname) {
		// 创建查询条件数据对象
		FinalTest queryObject = new FinalTest();
		queryObject.setSname(sname);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("fullname", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<FinalTest> ex = Example.of(queryObject, matcher);
		List<FinalTest> result = dao.findAll(ex);
		return result;
	}

	@Autowired
	public void setStudentDao(FinalTestDao finaltestDao) {
		this.finaltestDao = finaltestDao;
		this.dao = this.finaltestDao;
	}
}
