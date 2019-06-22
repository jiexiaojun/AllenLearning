/**
 * @项目名称：AllenLearning
 * @文件名称：Test1.java
 * @所属包名：com.Allen.Test
 * @创建时间：2019年6月13日上午8:06:41
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */
package com.Allen.Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		User user1 = new User(1, "哈哈");


//		User user2 = new User(2, "呵呵");

		User user2 = user1;
		list.add(user1);
		list.add(user2);

		User user3 = list.get(1);
		user3.setName("刘丽");
		for (User user : list) {
			System.out.println(user.getId() + user.getName());
		}
	}



	static class User {
		private int id;
		private String name;


		public User() {

		}

		/**
		 * Creates a new instance of User.
		 *
		 * @param id
		 * @param name
		 */

		public User(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		/**
		 * id.
		 *
		 * @return  the id
		 * @since   JDK 1.8
		 */
		public int getId() {
			return id;
		}

		/**
		 * id.
		 *
		 * @param   id    the id to set
		 * @since   JDK 1.8
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * name.
		 *
		 * @return  the name
		 * @since   JDK 1.8
		 */
		public String getName() {
			return name;
		}

		/**
		 * name.
		 *
		 * @param   name    the name to set
		 * @since   JDK 1.8
		 */
		public void setName(String name) {
			this.name = name;
		}

	}

}

