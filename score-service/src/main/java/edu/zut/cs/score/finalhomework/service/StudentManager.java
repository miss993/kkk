package edu.zut.cs.score.finalhomework.service;

import java.util.List;

import edu.zut.cs.score.base.service.GenericManager;
import edu.zut.cs.score.finalhomework.domain.Student;
import edu.zut.cs.score.finalhomework.domain.User;

public interface StudentManager extends GenericManager<Student, Long>{
	/**
     * get students according to postcode
     *
     * @param postcode
     * @return
     */
	List<Student> findByPostcode(String postcode);
}
