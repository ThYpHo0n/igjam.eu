package com.innogames.igjam.config;


import com.innogames.crm.grafsy.Client;
import com.innogames.crm.grafsy.FileClient;
import com.innogames.crm.grafsy.actuator.GrafsyMetricExporter;
import com.innogames.crm.grafsy.actuator.JavaMetricsReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.endpoint.SystemPublicMetrics;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.io.File;

@Configuration
public class MetricConfiguration {

	@Value("${crm.metrics.file:/tmp/grafsy/igjam.grafsy}")
	private String metricsFilename;

	@Value("${crm.metrics.prefix:backend.igjam}")
	private String prefix;

	@Autowired
	private GaugeService gaugeService;

	@Autowired
	private SystemPublicMetrics systemPublicMetrics;

	@Bean
	@Profile("!test")
	public Client metricsClient() {
		File file = new File(metricsFilename);
		return new FileClient(file);
	}

	@Bean
	public JavaMetricsReader getMetricReader() {
		return new JavaMetricsReader(gaugeService, systemPublicMetrics);
	}

	@Bean
	@ExportMetricWriter
	public MetricWriter grafsyMetricWriter() {
		return new GrafsyMetricExporter(metricsClient(), prefix);
	}
}
