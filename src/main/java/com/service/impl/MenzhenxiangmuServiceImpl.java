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


import com.dao.MenzhenxiangmuDao;
import com.entity.MenzhenxiangmuEntity;
import com.service.MenzhenxiangmuService;
import com.entity.vo.MenzhenxiangmuVO;
import com.entity.view.MenzhenxiangmuView;

@Service("menzhenxiangmuService")
public class MenzhenxiangmuServiceImpl extends ServiceImpl<MenzhenxiangmuDao, MenzhenxiangmuEntity> implements MenzhenxiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenzhenxiangmuEntity> page = this.selectPage(
                new Query<MenzhenxiangmuEntity>(params).getPage(),
                new EntityWrapper<MenzhenxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenzhenxiangmuEntity> wrapper) {
		  Page<MenzhenxiangmuView> page =new Query<MenzhenxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenzhenxiangmuVO> selectListVO(Wrapper<MenzhenxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenzhenxiangmuVO selectVO(Wrapper<MenzhenxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenzhenxiangmuView> selectListView(Wrapper<MenzhenxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenzhenxiangmuView selectView(Wrapper<MenzhenxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
