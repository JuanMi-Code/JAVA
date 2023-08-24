package Instituto;

import Instituto.Utils.DbConnection;

public class Init {

	public static void main(String[] args) {
		
		DbConnection.getInstance().getConnection();
		
	}
}
