package com.hebaobei.baby.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hebaobei.baby.common.utils.JsonUtil;
import com.hebaobei.baby.entity.User;
import com.hebaobei.baby.mapper.UserMapper;
import com.hebaobei.baby.service.IUserService;
import com.hebaobei.baby.vo.UserVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangguang
 * @since 2017-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public int deleteAll() {
		return baseMapper.deleteAll();
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

	@Override
	@Transactional
	public void testException() {
		baseMapper.deleteAll();
		baseMapper.insert(new User("yangguasdasdadasdasdaddsadang", 35, "13998885993", new Date(), "yangg", 1));
	}

	public Page<User> selectPage(UserVO userVO) {
		EntityWrapper entityWrapper=new EntityWrapper(new User());
		entityWrapper.where("yn = {0}",1)
				.andNew(null != userVO.getId(), "id = {0}",userVO.getId())
				.andNew(null != userVO.getName(),"name = {0}",userVO.getName())
				.andNew(null != userVO.getAge(),"age = {0}",userVO.getAge())
				.andNew(null != userVO.getPhone(),"phone = {0}",userVO.getPhone())
				.andNew(null != userVO.getCreateTimeStart(),"create_time >= {0}", userVO.getCreateTimeStart())
				.andNew(null != userVO.getCreateTimeEnd(),"create_time <= {0}", userVO.getCreateTimeEnd());
		//.orderBy("age");
		Page<User> userListPage = this.selectPage(new Page<User>(userVO.getPageNumber(), userVO.getPageSize()), entityWrapper);
		System.out.println(JsonUtil.toJson(userListPage));
		return userListPage;
	}

}