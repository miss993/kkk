package edu.zut.cs.score.assignments.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.assignments.domain.Assignments;
import edu.zut.cs.score.base.service.GenericGenerator;
import edu.zut.cs.score.finalhomework.domain.Homework;

/**
 * 
 * @author zhoutong
 *
 * 从execl中读取学号姓名信息插入数据库测试
 * 成功后会在数据库的T_Assignments表中生成
 */
public class AssignmentsEntityGenerator extends GenericGenerator{
	List<Assignments> assignmentsList;
	AssignmentsManager assignmentsmanager;
	/**
	 * 
	 * @param assignmentsmanager
	 */
	@Autowired
	public void setAssignmentManager(AssignmentsManager assignmentsmanager) {
		this.assignmentsmanager = assignmentsmanager;
	}
	/**
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception{
		this.assignmentsList = new ArrayList<Assignments>();
		InputStream input = AssignmentsManagerTest.class.getResourceAsStream("/assignments.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			Row row = sheet.getRow(i);
			Assignments s = new Assignments();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if(j == 0)
						s.setStuid(value);
					if(j == 1)
						s.setName(value);;
					if(j == 2)
						s.setScore1(value);
					if(j == 3)
						s.setScore2(value);
					if(j == 4)
						s.setScore3(value);
					if(j == 5)
						s.setScore4(value);
					if(j == 6)
						s.setScore5(value);
				}
			}
			this.assignmentsList.add(s);
		}
	}
	/**
	 * Test测试
	 */
	@Test
	public void test() {
		this.assignmentsmanager.save(this.assignmentsList);
		List<Assignments> result = this.assignmentsmanager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Assignments> result=" + result);
		}
	}

}
