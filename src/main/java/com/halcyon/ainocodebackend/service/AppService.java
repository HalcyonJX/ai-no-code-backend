package com.halcyon.ainocodebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.halcyon.ainocodebackend.model.dto.app.AppQueryRequest;
import com.halcyon.ainocodebackend.model.entity.App;
import com.halcyon.ainocodebackend.model.entity.User;
import com.halcyon.ainocodebackend.model.vo.AppVO;
import jakarta.servlet.http.HttpServletRequest;
import reactor.core.publisher.Flux;

import java.util.List;

/**
* @author 张嘉鑫
* @description 针对表【app(应用)】的数据库操作Service
* @createDate 2026-01-22 20:21:24
*/
public interface AppService extends IService<App> {

    /**
     * 通过对话生成应用代码
     *
     * @param appId     应用 ID
     * @param message   提示词
     * @param loginUser 登录用户
     * @return
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    /**
     * 获取查询条件
     */
    QueryWrapper<App> getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 实体转VO
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装类列表
     *
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);
}
