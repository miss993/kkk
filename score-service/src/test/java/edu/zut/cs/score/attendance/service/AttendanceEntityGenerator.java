package edu.zut.cs.score.attendance.service;

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

import edu.zut.cs.score.attendance.domain.Attendance;
import edu.zut.cs.score.base.service.GenericGenerator;

/**
 *  Entity Generator for attendance package.
 * @author caisongjiang
 *
 */
public class AttendanceEntityGenerator extends GenericGenerator {
	List<Attendance> attendanceList;
	AttendanceManager attendanceManager;
	
	@Autowired
	public void setAttendanceManager(AttendanceManager attendanceManager) {
		this.attendanceManager = attendanceManager;
	}
	@Before
	public void setUp() throws Exception {
		this.attendanceList = new ArrayList<Attendance>();
		InputStream input = AttendanceManagerTest.class.getResourceAsStream("/attendance.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Attendance s = new Attendance();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 0)
						s.setCode(value);
					if (j == 1)
						s.setName(value);
					if (j == 2)
						s.setClazz(value);
					if (j == 3)
						s.setDay1(value);
					if (j == 4)
						s.setDay2(value);
					if (j == 5)
						s.setDay3(value);
					if (j == 6)
						s.setDay4(value);
					if (j == 7)
						s.setDay5(value);
					if (j == 8)
						s.setDay6(value);
					if (j == 9)
						s.setDay7(value);
					if (j == 10)
						s.setDay8(value);
					if (j == 11)
						s.setDay9(value);
					if (j == 12)
						s.setDay10(value);
					if (j == 13)
						s.setAscore(value);
				}
			}
			this.attendanceList.add(s);
		}
	}
	@Test
	public void test() {
		this.attendanceManager.save(this.attendanceList);
		List<Attendance> result = this.attendanceManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Attendance> result=" + result); //$NON-NLS-1$
		}
	}
}
