package com.tanerdiler.microservice.account.resource;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class InfoResource {

	@Autowired
	Environment environment;

	@GetMapping("/info")
	public Map<String, String> info() throws UnknownHostException {
		Map<String, String> response = Maps.newHashMap();
		response.put("port", environment.getProperty("server.port"));

		// Local address
		InetAddress localhost = InetAddress.getLocalHost();
		response.put("hostAddress", localhost.getHostAddress());
		response.put("hostName", localhost.getHostName());

		// Remote address
		InetAddress loopback = InetAddress.getLoopbackAddress();
		response.put("loopbackHostAddress", loopback.getHostAddress());
		response.put("loopbackHostName", loopback.getHostName());

		return response;
	}
}
