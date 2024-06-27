package com.entity.view;

import com.entity.PinpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 品牌
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 18:28:00
 */
@TableName("pinpai")
public class PinpaiView  extends PinpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PinpaiView(){
	}
 
 	public PinpaiView(PinpaiEntity pinpaiEntity){
 	try {
			BeanUtils.copyProperties(this, pinpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
