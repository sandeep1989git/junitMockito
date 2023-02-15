package com.sandeep.mokito.mokitoDemo.bussiness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SomeBussinessImpl {
	private DataService dataService;

	public SomeBussinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	int getMax() {
		int[] numbers=dataService.getAllData();
		List<Integer> collect = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		return Collections.max(collect);
	}
	
}

interface DataService{
	int[] getAllData();
}