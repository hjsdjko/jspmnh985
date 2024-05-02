package com.entity.view;

import com.entity.ZhuyuandengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 住院登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-13 22:12:44
 */
@TableName("zhuyuandengji")
public class ZhuyuandengjiView  extends ZhuyuandengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuyuandengjiView(){
	}
 
 	public ZhuyuandengjiView(ZhuyuandengjiEntity zhuyuandengjiEntity){
 	try {
			BeanUtils.copyProperties(this, zhuyuandengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}