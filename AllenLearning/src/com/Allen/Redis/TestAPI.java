package com.Allen.Redis;

import java.util.HashMap;
import java.util.Map;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TestAPI {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.30.68", 6379);

		jedis.select(15);
		jedis.set("wangjun", "18");
		jedis.del("wangjun");

		Transaction t = jedis.multi();// 开始事务

		t.flushDB();

		// String
		t.set("it010String", "My name is allen！");
		t.set("it010String1", "I am learn jedis!");
		t.del("it010String1");


		// Hash
		Map<String, String> hash = new HashMap<String, String>();
		hash.put("name", "Allen");
		hash.put("age", "18");
		hash.put("sex", "男");
		t.hmset("ITMES组", hash);


		t.hset("ITERP组", "name", "Mrs Li");
		t.hset("ITERP组", "age", "50");
		t.hset("ITERP组", "sex", "女");

		// List
		t.lpush("it010List", "5");
		t.lpush("it010List", "4");
		t.lpush("it010List", "3");
		t.lpush("it010List", "2");
		t.lpush("it010List", "1");


		// set
		t.sadd("it010Set", "discuz.net");
		t.sadd("it010Set", "tianya.cn");
		t.sadd("it010Set", "groups.google.com");

		// sortedSet
		t.zadd("it010SortedSet", 1d, "迪丽热巴");
		t.zadd("it010SortedSet", 2d, "古力娜扎");
		t.zadd("it010SortedSet", 3d, "AngleBaby");

		t.exec();

		System.out.println(jedis.get("it010String"));
		System.out.println(jedis.get("it010String1"));
		System.out.println(jedis.hget("ITMES组", "name"));
		System.out.println(jedis.hget("ITMES组", "age"));
		System.out.println(jedis.hget("ITMES组", "sex"));
		System.out.println(jedis.lrange("it010List", 0, -1));
		System.out.println(jedis.smembers("it010Set"));
		System.out.println(jedis.zrangeByScore("it010SortedSet", 0, 4));


	}
}
