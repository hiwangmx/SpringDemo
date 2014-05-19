package com.star.aop.user.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * 
 * 
 * 把2变成16最有效的办法
	2 >> 3

hibernate的几种状态
	瞬时状态:是指对象被new之后尚未保存到数据库,一旦服务器停止,JVM会回收它所占的内存资源,此时对象没有与session关联.
	托管状态：在数据库中已有数据与之对应，且与session相关联。实体状态转换到托管状态的方法。
		A.调用persist(),实体从游离转变到托管,最后变成持久化状态.
		B.调用find()或Query执行查询,实体从持久变成托管.
		C.调用refresh(),游离实体将被重新加载,变成托管状态.
		D.调用merge(),将游离实体变成托管实体.
	游离状态:数据库中有数据与之对应但不在session的管理范围,它的属性不与数据库中持久化的实体同步.
	实体从托管变成游离的情况有:
		A.当一个事务结束,实体超过持久化上下文作用域,实体变成游离态
		B.当复制实体对象或序列化时,实体将变成游离态
		C.调用clear方法时,所有的实体将强制转化为游离态

列出123456的所有排列组合


session和cookie的区别

sql分页

	oracle：
		SELECT * FROM ( SELECT A.*, ROWNUM RN 
		FROM (SELECT * FROM TABLE_NAME) A ) WHERE RN BETWEEN 21 AND 40
	mysql：
		SELECT * FROM Account 
		LIMIT 起始行,每页多少行
 * 
 * @author john
 *
 */

public class PersonAopTest {

	
	public static void main(String[] args) {
		//PersonProxyFactory personProxyFactory = new PersonProxyFactory();
		//UserServiceImp userService = (UserServiceImp) personProxyFactory.createProxyInstance(new UserServiceImp());
		//userService.save(new Person());
		System.out.println(2 << 3);
		
		String str= "123456";
		List<String> arrayList = permute(str.toCharArray(),0);
		System.out.println(arrayList.size());
		for(String strss : arrayList){
			System.out.println(strss);
		}
		
		
	}
	
	public static List<String> permute(char a[],int s){
	    List<String> listArray = new ArrayList<String>(); 
		if(s==a.length){
			listArray.add(Arrays.toString(a));
	    }
	    else
	        for(int i=s;i<a.length;++i){
	            swap(a,s,i);
	            listArray.addAll(permute(a,s+1));           
	            swap(a,s,i);
	        }
		return listArray;
	}
	 
	private static void swap(char[] a,int s,int i) {
	    char t=a[s];
	    a[s]=a[i];
	    a[i]=t; 
	}
	
}
