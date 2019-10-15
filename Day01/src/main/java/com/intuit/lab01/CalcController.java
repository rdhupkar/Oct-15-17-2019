package com.intuit.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
	
	@Autowired
	private Calculator calculator;

	@GetMapping("/multiply/{a}/{b}")
	public CalcResults multiply(@PathVariable int a, @PathVariable int b) {
		int result = calculator.multiply(a, b);
		CalcResults calcResults = new CalcResults();
		calcResults.setNum1(a);
		calcResults.setNum2(b);
		calcResults.setResult(result);
		calcResults.setOperation("Multiplication");
		return calcResults;
	}
	
	
	@PostMapping("/product")
	public int product(@RequestParam("num1") int a, @RequestParam("num2") int b) {
		return calculator.multiply(a, b);
	}
	
	@PutMapping("/subtract/{a}/{b}")
	public int subtract(@PathVariable int a, @PathVariable int b) {
		return calculator.subtract(a, b);
	}
	
	@GetMapping("/square/{num}")
	public int square(@PathVariable int num) {
		return calculator.square(num);
	}
	
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return calculator.add(a, b);
	}
}
