package com.example.quiz_1141121.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz_1141121.req.FillinReq;
import com.example.quiz_1141121.res.BasicRes;
import com.example.quiz_1141121.service.FillinService;

@RestController
public class FillinController {
@Autowired
private FillinService fillinService;




@PostMapping("quiz/fillin")
public BasicRes fillin(@RequestBody FillinReq req) {
	return fillinService.fillin(req);
}
}
