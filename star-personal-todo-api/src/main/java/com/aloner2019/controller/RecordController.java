package com.aloner2019.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloner2019.mapper.RecordMapper;
import com.aloner2019.pojo.Record;
import com.aloner2019.service.RecordService;
import com.aloner2019.utils.StarJSONResult;

@RestController
@RequestMapping("/record")
public class RecordController extends BaseController {

	@Autowired
	private RecordService recordService;
	
	/**
	 * 插入一条TODO
	 * @param record
	 * @return
	 */
	@PostMapping("/new")
	public StarJSONResult insertRecord(@RequestBody Record record) {
		if(record != null) {
			System.out.println(record);
			recordService.insertRecord(record.getTitle(), record.getContent(), "001");			
			return StarJSONResult.ok();
		}else {
			return StarJSONResult.errorMsg("input error");
		}
	}
	
	/**
	 * 查询所有TODO
	 * @return StarJSONResult
	 */
	@GetMapping("/home_init")
	public StarJSONResult findAll() {
		return StarJSONResult.ok(recordService.findAll());
	}
}
