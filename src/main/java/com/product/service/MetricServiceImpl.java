package com.product.service;

import java.util.List;

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

	@Override
	public List<Metric> getMetrics() {
		return metricRepository.findAll();
	}

	
}
