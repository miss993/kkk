package edu.zut.cs.score.finalhomework.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.score.base.service.GenericGenerator;
import edu.zut.cs.score.finalhomework.domain.Homework;
import edu.zut.cs.score.finalhomework.domain.Sex;

/**
 *  Entity Generator for finalhomework package.
 * @author chaxiaoyin
 *
 */
public class HomeworkEntityGenerator extends GenericGenerator{

		List<Homework> homeworkList;
		HomeworkManager homeworkManager;
		
		@Autowired
		public void setHomeworkManager(HomeworkManager homeworkManager) {
			this.homeworkManager = homeworkManager;
		}
		@Before
		public void setUp() throws Exception {
			this.homeworkList = new ArrayList<Homework>();
			InputStream input = HomeworkManagerTest.class.getResourceAsStream("/homework_test.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(input);
			XSSFSheet sheet = wb.getSheetAt(0);
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				Homework s = new Homework();
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);
					if (cell != null) {
						cell.setCellType(CellType.STRING);
						String value = row.getCell(j).getStringCellValue().trim();
						if (j == 1)
							s.setGrade(value);
						if (j == 2)
							s.setMajor(value);
						if (j == 3)
							s.setAddress(value);
						if (j == 4)
							s.setCode(value);
						if (j == 5)
							s.setName(value);
						if (j == 6)
							if (StringUtils.equalsIgnoreCase("男", value)) {
								s.setSex(Sex.男);
							} else if (StringUtils.equalsIgnoreCase("女", value)) {
								s.setSex(Sex.女);
							}
						if (j == 7)
							s.setMark(Integer.valueOf(value));
						
					}
				}
				this.homeworkList.add(s);
			}
		}
		@Test
		public void test() {
			this.homeworkManager.save(this.homeworkList);
			List<Homework> result = this.homeworkManager.findAll();
			if (logger.isInfoEnabled()) {
				logger.info("test() - List<Homework> result=" + result); //$NON-NLS-1$
			}
		}
		
		
		
}
