package com.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Metric;
import com.product.service.MetricService;

@RestController
@RequestMapping("/api/metric")
@CrossOrigin
public class MetricController {

	Logger logger = LoggerFactory.getLogger(MetricController.class);
	
	@Autowired
	MetricService metricService;

	/**
	 * API to update count based on the selection
	 * @param id
	 * @return
	 */
	@PostMapping("/updateCount/{id}")
	public ResponseEntity<Metric> counterUpdate(@PathVariable long id){
		
		return new ResponseEntity<Metric>(metricService.updateCount(id), HttpStatus.OK);
	}
	
	/**
	 * API to retrieve the metrics details
	 * @return metricList
	 */
	@GetMapping("/getMetrics")
	public List<Metric> getMetricCount() {
		List<Metric> metricList = metricService.getMetrics();
		return metricList;
	}
}
