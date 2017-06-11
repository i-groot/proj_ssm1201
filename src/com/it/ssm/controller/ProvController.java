package com.it.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.it.bean.Prov;
import com.it.ssm.mapper.ProvMapper;

/**
 * 
 * 
 * <p>
 * Title:上午10:46:14
 * </p>
 * <p>
 * Description:com.it.ssm.controller.ProvController.java
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
@Controller
@RequestMapping("/prov")
public class ProvController {
	
	List<Prov> listP = null;
	
	/**
	 * @return the listP
	 */
	public List<Prov> getListP() {
		return listP;
	}
	
	@Autowired
	ProvMapper mapper = null;

	public void setMapper(ProvMapper mapper) {
		this.mapper = mapper;
	}
	
	@RequestMapping(value="/toAddProv",method=RequestMethod.GET)
	public String toAddProv(){
		
		return "addProv";
	}

	@RequestMapping(value="/addProv",method=RequestMethod.POST)
	public String addProv(Prov prov){
		 try {
			  mapper.addProv(prov);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return "redirect:/prov/queryAll";
	}
	
	@RequestMapping(value="/delProv",method=RequestMethod.GET)
	public String delProv(Prov prov){
		 try {
			  mapper.delProv(prov);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/prov/queryAll";
	}

	@RequestMapping(value="/queryAll",method=RequestMethod.GET)
	public ModelAndView  queryAll(Prov prov){
		ModelAndView  andView = new ModelAndView("showProv");
		 try {
			  if(!"".equals(prov.getProv_name()) && prov.getProv_name()!=null){
				  prov.setProv_name(new String(prov.getProv_name().getBytes("iso-8859-1"),"utf-8"));
			  }
			  listP = mapper.queryAll(prov);
			  andView.addObject("listP", listP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return andView;
	}
	
}
