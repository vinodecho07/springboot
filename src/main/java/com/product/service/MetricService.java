package com.product.service;

import org.springframework.stereotype.Service;

import com.product.model.Metric;

@Service
public interface MetricService {

	public Metric save(Metric metric);
	
	public Metric updateCount(long id);
}
