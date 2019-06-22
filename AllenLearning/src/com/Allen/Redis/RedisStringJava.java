package com.Allen.Redis;

import redis.clients.jedis.Jedis;

@SuppressWarnings("resource")
public class RedisStringJava {
	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		// 设置 redis 字符串数据
		jedis.set("mylove", "女神姐姐刘丽");
		// 获取存储的数据并输出
		System.out.println("我的真爱： " + jedis.get("mylove"));
	}
}
