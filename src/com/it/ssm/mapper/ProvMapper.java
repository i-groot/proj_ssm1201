package com.it.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.it.bean.Prov;

/**
 * 
 * 
 * <p>
 * Title:上午10:46:23
 * </p>
 * <p>
 * Description:com.it.ssm.mapper.ProvMapper.java
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016-12-1
 * </p>
 * <p>
 * Company: 中软创新(北京)科技有限公司
 * </p>
 * 
 * @author 郑向云
   @email   zyx80002@163.com
 */
@Service
public interface ProvMapper {
	public void addProv(Prov prov);
	public void delProv(Prov prov);
	public void updProv(Prov prov);
	public List<Prov> queryAll(Prov prov);
	public Prov findById(Prov prov);
	//public List<Prov> selectProv2(Prov prov);
}
