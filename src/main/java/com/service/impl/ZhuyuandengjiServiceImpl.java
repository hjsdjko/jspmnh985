package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuyuandengjiDao;
import com.entity.ZhuyuandengjiEntity;
import com.service.ZhuyuandengjiService;
import com.entity.vo.ZhuyuandengjiVO;
import com.entity.view.ZhuyuandengjiView;

@Service("zhuyuandengjiService")
public class ZhuyuandengjiServiceImpl extends ServiceImpl<ZhuyuandengjiDao, ZhuyuandengjiEntity> implements ZhuyuandengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuyuandengjiEntity> page = this.selectPage(
                new Query<ZhuyuandengjiEntity>(params).getPage(),
                new EntityWrapper<ZhuyuandengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuyuandengjiEntity> wrapper) {
		  Page<ZhuyuandengjiView> page =new Query<ZhuyuandengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuyuandengjiVO> selectListVO(Wrapper<ZhuyuandengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuyuandengjiVO selectVO(Wrapper<ZhuyuandengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuyuandengjiView> selectListView(Wrapper<ZhuyuandengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuyuandengjiView selectView(Wrapper<ZhuyuandengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
