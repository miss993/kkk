package edu.zut.cs.score.base.dao;

import java.io.Serializable;
import java.util.List;

import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;

import edu.zut.cs.score.base.BaseAbstractTestCase;
import edu.zut.cs.score.base.domain.BaseEntity;

@ContextConfiguration(locations = { "classpath:/applicationContextTest-resources.xml",
		"classpath:/applicationContext-dao.xml" })
public class GenericDaoTestCase<PK extends Serializable, T extends BaseEntity, D extends GenericDao<T, PK>>
		extends BaseAbstractTestCase {

	protected PK id;

	protected T entity;

	protected D dao;

	protected List<T> list;

	@Before
	public void setUp() throws Exception {

	}
}
