package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.model.Metric;

@Service
public interface MetricService {

	public Metric save(Metric metric);
	
	public Metric updateCount(long id);

	public List<Metric> getMetrics();

}
