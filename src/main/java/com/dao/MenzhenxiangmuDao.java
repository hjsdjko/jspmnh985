package com.dao;

import com.entity.MenzhenxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenzhenxiangmuVO;
import com.entity.view.MenzhenxiangmuView;


/**
 * 门诊项目
 * 
 * @author 
 * @email 
 * @date 2022-03-13 22:12:44
 */
public interface MenzhenxiangmuDao extends BaseMapper<MenzhenxiangmuEntity> {
	
	List<MenzhenxiangmuVO> selectListVO(@Param("ew") Wrapper<MenzhenxiangmuEntity> wrapper);
	
	MenzhenxiangmuVO selectVO(@Param("ew") Wrapper<MenzhenxiangmuEntity> wrapper);
	
	List<MenzhenxiangmuView> selectListView(@Param("ew") Wrapper<MenzhenxiangmuEntity> wrapper);

	List<MenzhenxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<MenzhenxiangmuEntity> wrapper);
	
	MenzhenxiangmuView selectView(@Param("ew") Wrapper<MenzhenxiangmuEntity> wrapper);
	

}
