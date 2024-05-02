package com.dao;

import com.entity.ZhuyuandengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuyuandengjiVO;
import com.entity.view.ZhuyuandengjiView;


/**
 * 住院登记
 * 
 * @author 
 * @email 
 * @date 2022-03-13 22:12:44
 */
public interface ZhuyuandengjiDao extends BaseMapper<ZhuyuandengjiEntity> {
	
	List<ZhuyuandengjiVO> selectListVO(@Param("ew") Wrapper<ZhuyuandengjiEntity> wrapper);
	
	ZhuyuandengjiVO selectVO(@Param("ew") Wrapper<ZhuyuandengjiEntity> wrapper);
	
	List<ZhuyuandengjiView> selectListView(@Param("ew") Wrapper<ZhuyuandengjiEntity> wrapper);

	List<ZhuyuandengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuyuandengjiEntity> wrapper);
	
	ZhuyuandengjiView selectView(@Param("ew") Wrapper<ZhuyuandengjiEntity> wrapper);
	

}
