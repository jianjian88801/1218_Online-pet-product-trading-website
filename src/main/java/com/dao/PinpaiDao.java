package com.dao;

import com.entity.PinpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinpaiVO;
import com.entity.view.PinpaiView;


/**
 * 品牌
 * 
 * @author 
 * @email 
 * @date 2021-04-25 18:28:00
 */
public interface PinpaiDao extends BaseMapper<PinpaiEntity> {
	
	List<PinpaiVO> selectListVO(@Param("ew") Wrapper<PinpaiEntity> wrapper);
	
	PinpaiVO selectVO(@Param("ew") Wrapper<PinpaiEntity> wrapper);
	
	List<PinpaiView> selectListView(@Param("ew") Wrapper<PinpaiEntity> wrapper);

	List<PinpaiView> selectListView(Pagination page,@Param("ew") Wrapper<PinpaiEntity> wrapper);
	
	PinpaiView selectView(@Param("ew") Wrapper<PinpaiEntity> wrapper);
	
}
