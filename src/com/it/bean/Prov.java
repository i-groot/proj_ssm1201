package com.it.bean;

import java.io.Serializable;
/**
 * 
 * 
 * 
 * <p>
 * Title:上午9:43:58
 * </p>
 * <p>
 * Description:com.it.bean.Prov.java
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016-11-30
 * </p>
 * <p>
 * Company: 中软创新(北京)科技有限公司
 * </p>
 * 
 * @author 郑向云
   @email   zyx80002@163.com
 */
public class Prov implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String prov_id; 
	private String prov_name;
	public Prov() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prov(String provId, String provName) {
		super();
		prov_id = provId;
		prov_name = provName;
	}
	public String getProv_id() {
		return prov_id;
	}
	public void setProv_id(String provId) {
		prov_id = provId;
	}
	public String getProv_name() {
		return prov_name;
	}
	public void setProv_name(String provName) {
		prov_name = provName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.prov_id+"\t"+this.prov_name;
	}
	
	
}
