package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Metric;
import com.product.repository.MetricRepository;

@Service
public class MetricServiceImpl implements MetricService {

	@Autowired
	MetricRepository metricRepository;
	
	public Metric save(Metric metric) {
		return metricRepository.save(metric);
	}

	public Metric updateCount(long id) {
		
	    Metric metric = metricRepository.findById(id).orElse(null);
		if(metric != null) {
			metric.setCount(metric.getCount()+1);
		}
		return metricRepository.save(metric);
	}
}
