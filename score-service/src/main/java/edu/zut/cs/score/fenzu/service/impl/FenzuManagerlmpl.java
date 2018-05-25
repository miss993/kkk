package edu.zut.cs.score.fenzu.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.zut.cs.score.fenzu.dao.FenzuDao;
import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.base.service.impl.GenericManagerImpl;
import edu.zut.cs.score.fenzu.service.FenzuManager;


@Component
public class FenzuManagerlmpl  extends GenericManagerImpl<Fenzu,Long> implements FenzuManager  {
	FenzuDao studentDao;

	@Autowired
	public void setUserDao(FenzuDao studentDao) {
		this.studentDao = studentDao;
		this.dao = this.studentDao;
	}

	@Override
	public Fenzu findbyStudentname(String studentDao) {
		// TODO Auto-generated method stub
		return null;
	}
}


