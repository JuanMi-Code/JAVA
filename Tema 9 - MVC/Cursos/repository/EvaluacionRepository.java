package cursos.repository;

import cursos.dao.EvaluacionDao;

public class EvaluacionRepository {

	private EvaluacionDao dao;
	private static EvaluacionRepository instance;
	
	public static synchronized EvaluacionRepository getInstance() {
		if(instance == null) {
			instance = new EvaluacionRepository();
		}
		return instance;
	}
	
	private EvaluacionRepository() {
		dao = new EvaluacionDao();
	}
}
