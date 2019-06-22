package com.Allen.Redis;

import redis.clients.jedis.Jedis;

public class TestMS {
	public static void main(String[] args) {
//		Jedis jedis_M = new Jedis("192.168.30.68",6379);
		Jedis jedis_S = new Jedis("127.0.0.1", 6379);

		jedis_S.slaveof("192.168.30.68", 6379);
//		jedis_M.select(15);
//		jedis_M.set("it010String","my name is allen！");

		String result = jedis_S.get("it010String");
		System.out.println(result);
	}
}
