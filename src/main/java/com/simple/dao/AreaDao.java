package com.simple.dao;

import com.simple.entity.Area;

import java.util.List;

/**
 * Created by simple on 2018/5/27.
 */
public interface AreaDao {
    /**
     * 查询区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据areaId查询
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 新增区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
