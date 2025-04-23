package com.dao;

import com.entity.KechengCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengCommentbackView;

/**
 * 课程评价 Dao 接口
 *
 * @author 
 */
public interface KechengCommentbackDao extends BaseMapper<KechengCommentbackEntity> {

   List<KechengCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
