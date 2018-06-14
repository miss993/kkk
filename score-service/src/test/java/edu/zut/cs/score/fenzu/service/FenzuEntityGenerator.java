package edu.zut.cs.score.fenzu.service;
/**
 * Entity Generator for fennzu
 * @author panshaoqian
 */
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
import edu.zut.cs.score.fenzu.domain.Fenzu;
import edu.zut.cs.score.fenzu.domain.Studentsex;
import edu.zut.cs.score.fenzu.service.FenzuManager;
public class FenzuEntityGenerator extends GenericGenerator {
   List<Fenzu> fenzuList;
   FenzuManager fenzuManager;
   @Autowired
   
   public void setFenzuManager(FenzuManager fenzuManager ) {
	   this.fenzuManager=fenzuManager;
   }
   @Before
   public void setUp() throws Exception {
	   this.fenzuList=new ArrayList<Fenzu>();
	   InputStream input =FenzuManagerTest.class.getResourceAsStream("/fenzu.xlsx");
	   @SuppressWarnings("resource")
	   XSSFWorkbook wb = new XSSFWorkbook(input);
	   XSSFSheet sheet = wb.getSheetAt(0);
	   for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Fenzu s=new Fenzu();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 0)
						s.setName(value);
					if (j == 1)
						s.setStudentclass(value);
					if (j == 2)
						s.setStudentdoing(value);
					if (j == 3)
						s.setStudentno(value);
					if (j == 5)
						s.setStudentzhiwu(value);
					if (j == 4)
						if (StringUtils.equalsIgnoreCase("男", value)) {
							s.setStudentsex(Studentsex.男);
						} else if (StringUtils.equalsIgnoreCase("女", value)) {
							s.setStudentsex(Studentsex.女);
						}
				}
			}
			this.fenzuList.add(s);
	   }
   }
   @Test
   public void test() {
	   this.fenzuManager.save(this.fenzuList);
	   List<Fenzu> result = this.fenzuManager.findAll();
	   if (logger.isInfoEnabled()) {
		   logger.info("test() - List<Fenzu> result="+result);
	   }
	   
   }
}
