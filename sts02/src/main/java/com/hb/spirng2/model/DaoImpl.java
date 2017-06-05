package com.hb.spirng2.model;

import java.sql.SQLException;
import java.util.List;

public interface DaoImpl {
	public List<SimpleVo> selectAll() throws SQLException;
	public void insertOne(SimpleVo simpleVo) throws SQLException ;
	
	
}
