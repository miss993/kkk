package edu.zut.cs.score.finalscore.service;
import edu.zut.cs.score.finalscore.domain.Student;
import edu.zut.cs.score.base.service.GenericManagerTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentManagerTest extends GenericManagerTestCase<Long, Student, StudentManager> {

    @Autowired
    StudentManager userManager;

    public StudentManagerTest() {
        super(Student.class);
    }

    @Test
    public void testFindAll() {
        List<Student> all = this.userManager.findAll();
        assertEquals(all.size(), 100);
    }

    @Test
    public void testFindbyUsername() {
        String studentname = "world";
        Student expected_user = new Student();
        // expected_user.setStudentname(studentname);
        Student user = this.userManager.findbyStudentname(studentname);
        this.logger.info(user);
        // assertEquals(user.getUsername(), expected_user.getUsername());
        assertEquals(user, expected_user);
    }

}
