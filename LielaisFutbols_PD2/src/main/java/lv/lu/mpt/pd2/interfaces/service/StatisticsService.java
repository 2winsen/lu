package lv.lu.mpt.pd2.interfaces.service;

import javax.sql.DataSource;


public interface StatisticsService {
	
	DataSource getDataSource();
	
	Object[][] getLeagueTable();
	
	Object[][] getTop10Scorers();
	
	Object[][] getTop5GoalKeepers();
	
	Object[][] getTopAggressivePlayers();
	
	Object[][] getTopStrictReferees();
	
	Object[][] getTopMostPopularNames();
	
	Object[][] getTeamStatistics(String teamName);
	
	Object[][] getRefereeStatistics(Long refereeId);
	
}
