package com.aloner2019.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.aloner2019.service.RecordService;
import com.aloner2019.utils.StarJSONResult;

@RestController
public class RecordController extends BaseController {

	
	
	@Autowired
	private RecordService recordService;
	
	public StarJSONResult insertRecord() {
		return null;
	}
}
