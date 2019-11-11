package com.aloner2019.service;

import com.aloner2019.pojo.Record;

public interface RecordService {
	
	/**
	 *  插入一条todo
	 * @param title
	 * @param content
	 * @param creator
	 */
	public void insertRecord(String title, String content, String creator);
}
