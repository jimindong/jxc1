package com.mf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mf.entity.Menu;
import com.mf.repository.MenuRepository;
import com.mf.service.MenuService;

/**
 * 权限菜单Service实现类
 *
 * @author Administrator
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuRepository menuRepository;

    @Override
    public List<Menu> findByParentIdAndRoleId(int parentId, int roleId) {
        return menuRepository.findByParentIdAndRoleId(parentId, roleId);
    }

    @Override
    public List<Menu> findByRoleId(int roleId) {
        return menuRepository.findByRoleId(roleId);
    }

    @Override
    public List<Menu> findByParentId(int parentId) {
        return menuRepository.findByParentId(parentId);
    }

    @Override
    public Menu findById(Integer id) {
        return menuRepository.findOne(id);
    }

}
