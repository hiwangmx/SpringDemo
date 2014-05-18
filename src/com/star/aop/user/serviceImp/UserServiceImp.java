package com.star.aop.user.serviceImp;

import com.star.aop.user.bean.Person;
import com.star.aop.user.service.UserService;

/**
 *
 * @author: 王明星(WangMingXing)
 * @En_Name: Star
 * @E-mail: hiwangmx@gmail.com
 * @version:
 * @Created Time: 2014年5月18日 下午8:19:46
 * @Description:
 *
 **/
public class UserServiceImp implements UserService{

	private Person person = null;
	
	@Override
	public Person getUser(String id) {
		// TODO Auto-generated method stub
		System.out.println("update person");
		return null;
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		System.out.println("update person");
	}

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		System.out.println("save person");
	}

}
