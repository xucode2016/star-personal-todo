package com.aloner2019.service.impl;

import java.util.Date;
import java.util.List;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloner2019.mapper.RecordMapper;
import com.aloner2019.pojo.Record;
import com.aloner2019.service.RecordService;

@Service
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordMapper recordMapper;

	@Autowired
	private Sid sid;

	@Override
	public void insertRecord(String title, String content, String creator) {
		System.out.println(title);
		System.out.println(content);
		System.out.println(creator);
		String id = sid.nextShort();
		Record record = new Record();
		record.setId(id);
		record.setTitle(title);
		record.setContent(content);
		record.setCreator(creator);
		record.setCompleted(0);
		record.setCreateAt(new Date());
		record.setUpdateAt(new Date());
		recordMapper.insert(record);
	}

	@Override
	public List<Record> findAll() {
		return recordMapper.selectAll();
	}

}
