package com.springboot.average;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "student-courses")
@RibbonClient(name = "student-courses")
public interface AverageServiceProxy {

	@GetMapping("/student-courses/name/{name}")
	AverageStudentBean averageStudentValue(@PathVariable("name") String name);
}
