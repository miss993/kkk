package edu.zut.cs.score.fenzu.service;
import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.fenzu.service.FenzuManager;
import edu.zut.cs.score.base.service.GenericManagerTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class fFenzuTest extends GenericManagerTestCase<Long,Fenzu,FenzuManager> {

    @Autowired
    FenzuManager userManager;

    public fFenzuTest() {
        super(Fenzu.class);
    }

    @Test
    public void testFindAll() {
        List<Fenzu> all = this.userManager.findAll();
        assertEquals(all.size(), 100);
    }

    @Test
    public void testFindbyUsername() {
        String studentname = "world";
        Fenzu expected_user = new Fenzu();
        // expected_user.setStudentname(studentname);
        Fenzu user = this.userManager.findbyStudentname(studentname);
        this.logger.info(user);
        // assertEquals(user.getUsername(), expected_user.getUsername());
        assertEquals(user, expected_user);
    }

}


