package edu.zut.cs.score.base.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import edu.zut.cs.score.base.domain.BaseTreeEntity;

/**
 * Generic Tree DAO (Data Access Object) with common methods to CRUD POJOs.
 * Implemented with Spring-Data-JPA Repository
 * <p>
 * Extend this interface if you want type safe (no casting necessary) DAO's for
 * your domain objects.
 * 
 * @author <a href="mailto:482274154@qq.com">Wang YuDong</a>
 * @param <T>
 *            a type variable,实体类型
 * @param <PK>
 *            the primary key for that type，实体类Id
 */
@NoRepositoryBean
public abstract interface GenericTreeDao<T extends BaseTreeEntity<T>, PK extends Serializable>
		extends GenericDao<T, PK> {
	List<T> getRoot();
}
