package utlity;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ExcelHandler {
	private static String filePath;

	public static Map<String, String> getTestDataInMap(String sheetName, String testCaseId) throws Exception {

		Map<String, String> TestDataInMap = new TreeMap<String, String>();
		String query = null;
		query = String.format("SELECT * FROM %s WHERE Run='Yes' and Menu='%s'", sheetName, testCaseId);
		Fillo fillo = new Fillo();
		Connection conn = null;
		Recordset recordset = null;

		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			recordset = conn.executeQuery(query);//
			//recordset=((com.codoid.products.fillo.Connection) conn).executeQuery(query);
			while (recordset.next()) {
				for (String field : recordset.getFieldNames()) {
					TestDataInMap.put(field, recordset.getField(field));
				}
			}
		} catch (FilloException e) {
			e.printStackTrace();
			throw new Exception("Test data cannot find . . .");
		}
		conn.close();
		return TestDataInMap;
	}

	public static void UpdateTestResultsToExcel(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {

			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET TestCaseStatus='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

	public static void UpdateDateTime(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Module_Run_Time_and_Date='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void Updatereson(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Execution_status='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void OTP(String sheetName, List<String> tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET OTP='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void OTPcv(String sheetName, List<String> tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET OTPCV='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void Updatcap(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Captha='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatRequest_No(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Request_No='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatCompany_Type(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Company Type='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatCompany(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Company='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatEntity(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Entity='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatDomain(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Domain='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}public static void UpdatVehicle_Override(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Vehicle Override='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatStatus(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Status='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatRequest_Status(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET  Update Request Status='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatRegistered_On(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Registered On='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatTrade_License_Number(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Trade License Number='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatApproved_On(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Approved On='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
	public static void UpdatApproved_By(String sheetName, String tcStatus, String testCaseId) {
		Connection conn = null;
		Fillo fillo = new Fillo();
		try {
			conn = fillo.getConnection("C:\\IAVMEP\\src\\test\\resources\\Test_data\\IAVMEP TEST DATA.xlsx");
			String query = String.format("UPDATE %s SET Approved By='%s' where Menu='%s'", sheetName, tcStatus, testCaseId);
			conn.executeUpdate(query);
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}
}
