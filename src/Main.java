import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Object> paramters = new HashMap<String, Object>();
		paramters.put("P_MES", 1);
		paramters.put("P_SECTOR", 2);
		ReportHelper.exportTXT("CapitalTrabajo", paramters);
	}
}
