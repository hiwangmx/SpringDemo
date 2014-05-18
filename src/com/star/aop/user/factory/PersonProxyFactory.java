package com.star.aop.user.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.star.aop.user.serviceImp.UserServiceImp;

/**
 * 
 * @author: 王明星(WangMingXing)
 * @En_Name: Star
 * @E-mail: hiwangmx@gmail.com
 * @version:
 * @Created Time: 2014年5月18日 下午8:42:50
 * @Description:
 * 
 **/
public class PersonProxyFactory implements InvocationHandler{

	private Object targetObject;

	public Object createProxyInstance(Object targetObject){
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(), this.targetObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		UserServiceImp userService = (UserServiceImp)this.targetObject;
		Object result = null;
		if(userService != null){
			result = method.invoke(this.targetObject, args);
		}
		return result;
	}
}
