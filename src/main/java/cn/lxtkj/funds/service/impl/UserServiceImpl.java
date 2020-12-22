package cn.lxtkj.funds.service.impl;

import cn.lxtkj.funds.entity.User;
import cn.lxtkj.funds.mapper.UserMapper;
import cn.lxtkj.funds.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leixt
 * @since 2020-12-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
