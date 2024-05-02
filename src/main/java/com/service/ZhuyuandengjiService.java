package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuyuandengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuyuandengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuyuandengjiView;


/**
 * 住院登记
 *
 * @author 
 * @email 
 * @date 2022-03-13 22:12:44
 */
public interface ZhuyuandengjiService extends IService<ZhuyuandengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuyuandengjiVO> selectListVO(Wrapper<ZhuyuandengjiEntity> wrapper);
   	
   	ZhuyuandengjiVO selectVO(@Param("ew") Wrapper<ZhuyuandengjiEntity> wrapper);
   	
   	List<ZhuyuandengjiView> selectListView(Wrapper<ZhuyuandengjiEntity> wrapper);
   	
   	ZhuyuandengjiView selectView(@Param("ew") Wrapper<ZhuyuandengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuyuandengjiEntity> wrapper);
   	

}

