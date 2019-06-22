/**
 * @项目名称：LearnProject
 * @文件名称：Person.java
 * @所属包名：ll.Entity
 * @创建时间：2018年9月5日下午2:32:19
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Entity;

/**
 * @类名称：Person
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月5日 下午2:32:19
 */
public class Person {

	private String firstName, lastName, job, gender;
	private int salary, age;

	public Person(String firstName, String lastName, String job, String gender, int age,
			int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.job = job;
		this.salary = salary;
	}

	/**
	 * firstName.
	 *
	 * @return  the firstName
	 * @since   JDK 1.6
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * firstName.
	 *
	 * @param   firstName    the firstName to set
	 * @since   JDK 1.6
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * lastName.
	 *
	 * @return  the lastName
	 * @since   JDK 1.6
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * lastName.
	 *
	 * @param   lastName    the lastName to set
	 * @since   JDK 1.6
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * job.
	 *
	 * @return  the job
	 * @since   JDK 1.6
	 */
	public String getJob() {
		return job;
	}

	/**
	 * job.
	 *
	 * @param   job    the job to set
	 * @since   JDK 1.6
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * gender.
	 *
	 * @return  the gender
	 * @since   JDK 1.6
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * gender.
	 *
	 * @param   gender    the gender to set
	 * @since   JDK 1.6
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * salary.
	 *
	 * @return  the salary
	 * @since   JDK 1.6
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * salary.
	 *
	 * @param   salary    the salary to set
	 * @since   JDK 1.6
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * age.
	 *
	 * @return  the age
	 * @since   JDK 1.6
	 */
	public int getAge() {
		return age;
	}

	/**
	 * age.
	 *
	 * @param   age    the age to set
	 * @since   JDK 1.6
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
