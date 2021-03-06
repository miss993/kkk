package edu.zut.cs.score.finalscore.service;

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

import edu.zut.cs.score.finalscore.service.FinalTestManagerTest;
import edu.zut.cs.score.finalscore.domain.FinalTest;
import edu.zut.cs.score.finalscore.service.FinalTestManager;
import edu.zut.cs.score.base.service.GenericGenerator;
/**
 * 
 * @author wangyudong
 *
 */
public class FinalTestEntityGenerator extends GenericGenerator{

	List<FinalTest> finaltestList;

	FinalTestManager finaltestManager;
	
	@Autowired
	public void setStudentManager(FinalTestManager finaltestManager) {
		this.finaltestManager = finaltestManager;
	}

	@Before
	public void setUp() throws Exception {
		this.finaltestList = new ArrayList<FinalTest>();
		InputStream input = FinalTestManagerTest.class.getResourceAsStream("/finalscore-153.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			FinalTest s = new FinalTest();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 1)
						s.setSname(value);
					if (j == 2)
						s.setSno(value);
					if (j == 3)
						s.setSkaoqin(value);
					if (j == 4)
						s.setSpingshizuoye(value);
					if (j == 5)
						s.setSscore(value);
				}
			}
			this.finaltestList.add(s);
		}
	}

	@Test
	public void test() {
		this.finaltestManager.save(this.finaltestList);
		List<FinalTest> result = this.finaltestManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<FinalTest> result=" + result); //$NON-NLS-1$
		}
	}
}
