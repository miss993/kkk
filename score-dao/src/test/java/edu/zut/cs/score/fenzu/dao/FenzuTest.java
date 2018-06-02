package edu.zut.cs.score.fenzu.dao;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.base.dao.GenericDaoTestCase;
public class FenzuTest extends GenericDaoTestCase <Long,Fenzu,FenzuDao>{
	@Autowired
	FenzuDao fenzuDao;
	@Test
	public void testFindAll() {
    List<Fenzu> r=this.fenzuDao.findAll();
    if (logger.isInfoEnabled()) {
        logger.info("testFindAll() - List<Student> result={}", r); //$NON-NLS-1$
    }
}
}