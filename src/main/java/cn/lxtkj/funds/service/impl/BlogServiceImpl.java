package cn.lxtkj.funds.service.impl;

import cn.lxtkj.funds.entity.Blog;
import cn.lxtkj.funds.mapper.BlogMapper;
import cn.lxtkj.funds.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
