package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenzhenxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenzhenxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenzhenxiangmuView;


/**
 * 门诊项目
 *
 * @author 
 * @email 
 * @date 2022-03-13 22:12:44
 */
public interface MenzhenxiangmuService extends IService<MenzhenxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenzhenxiangmuVO> selectListVO(Wrapper<MenzhenxiangmuEntity> wrapper);
   	
   	MenzhenxiangmuVO selectVO(@Param("ew") Wrapper<MenzhenxiangmuEntity> wrapper);
   	
   	List<MenzhenxiangmuView> selectListView(Wrapper<MenzhenxiangmuEntity> wrapper);
   	
   	MenzhenxiangmuView selectView(@Param("ew") Wrapper<MenzhenxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenzhenxiangmuEntity> wrapper);
   	

}

