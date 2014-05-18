package com.star.aop.user.service;

import com.star.aop.user.bean.Person;

/**
 *
 * @author: 王明星(WangMingXing)
 * @En_Name: Star
 * @E-mail: hiwangmx@gmail.com
 * @version:
 * @Created Time: 2014年5月18日 下午8:19:18
 * @Description:
 *
 **/
public interface UserService {

	public Person getUser(String id);
	public void update(Person person);
	public void save(Person person);
	
}
