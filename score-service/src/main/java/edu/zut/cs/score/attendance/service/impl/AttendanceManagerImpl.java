package edu.zut.cs.score.attendance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.score.attendance.dao.AttendanceDao;
import edu.zut.cs.score.attendance.domain.Attendance;
import edu.zut.cs.score.attendance.service.AttendanceManager;
import edu.zut.cs.score.base.service.impl.GenericManagerImpl;



@Component
public class AttendanceManagerImpl extends GenericManagerImpl<Attendance, Long> implements AttendanceManager{

	AttendanceDao attendanceDao;
	
	@Override
	public List<Attendance> findByCode(String code) {
		// 创建查询条件数据对象
		Attendance queryObject=new Attendance();
				queryObject.setDateCreated(null);
				queryObject.setDateModified(null);
				queryObject.setCode(code);
				// 创建匹配器，即如何使用查询条件
				// 创建匹配器，即如何使用查询条件
				ExampleMatcher  matcher=ExampleMatcher.matching() // 构建对象
						.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
						.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
						.withMatcher("code", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
				// 创建实例并查询
				Example<Attendance> ex = Example.of(queryObject, matcher);
				List<Attendance> result = dao.findAll(ex);
				return result;
	}

	@Override
	public List<Attendance> findByName(String name) {
		// 创建查询条件数据对象
		Attendance queryObject = new Attendance();
						queryObject.setName(name);
						// 创建匹配器，即如何使用查询条件
						ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
								.withMatcher("name", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
								.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
						// 创建实例并查询
						Example<Attendance> ex = Example.of(queryObject, matcher);
						List<Attendance> result = dao.findAll(ex);
						return result;
	}
	
	@Autowired
	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao=attendanceDao;
		this.dao=this.attendanceDao;}

}
