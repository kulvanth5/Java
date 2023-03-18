package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.mycompany.app.Sorter;

@RestController
public class ServiceController{

	@PostMapping("/")
	public double[] service(@RequestBody double arr[],String str){
	Sorter obj = new Sorter();
	double result[] = obj.sorter(arr,str);

		return (result);
	}
}
