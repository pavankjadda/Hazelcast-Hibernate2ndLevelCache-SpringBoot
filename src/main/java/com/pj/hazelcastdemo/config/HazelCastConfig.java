package com.pj.hazelcastdemo.config;

import com.hazelcast.client.config.ClientConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelCastConfig
{
	//@Bean
	public ClientConfig hazelCastConfig()
	{
		ClientConfig clientConfig = new ClientConfig();
		return clientConfig;
		//Hazelcast.newHazelcastInstance(cfg);
	}
}
