package com.pj.hazelcastdemo;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HazelcastDemoApplication
{
	public static void main(String[] args)
	{
		test();
		SpringApplication.run(HazelcastDemoApplication.class, args);
	}

	private static void test()
	{
		ClientConfig clientConfig = new ClientConfig();
		//clientConfig.getNetworkConfig().addAddress("127.0.0.1");
		HazelcastClient.newHazelcastClient(clientConfig);
	}
}
