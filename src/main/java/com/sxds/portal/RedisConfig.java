package com.sxds.portal;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;

@Configuration  
//@EnableCaching//开启注解  
public class RedisConfig extends CachingConfigurerSupport {
	@Bean
	  public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) { 
	   RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>(); 
	   RedisSerializer stringSerializer = new StringRedisSerializer();
//	   new FastJsonRedisSerializer<Object>(Object.class)
	   redisTemplate.setConnectionFactory(factory); 
	   redisTemplate.setKeySerializer(stringSerializer);
	   redisTemplate.setValueSerializer(stringSerializer);
	   redisTemplate.setKeySerializer(stringSerializer);
       redisTemplate.setValueSerializer(stringSerializer);
       redisTemplate.setHashKeySerializer(stringSerializer);
       redisTemplate.setHashValueSerializer(new FastJsonRedisSerializer<Object>(Object.class));
	   return redisTemplate; 
	  } 
	  @Bean
	  public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) { 
	   StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(); 
	   stringRedisTemplate.setConnectionFactory(factory); 
	   return stringRedisTemplate; 
	  } 
}