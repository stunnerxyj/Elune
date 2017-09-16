/**
 * Elune - Lightweight Forum Powered by Razor.
 * Copyright (C) 2017, Touchumind<chinash2010@gmail.com>
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.elune.dao;

import com.elune.entity.TopicEntity;
import com.elune.entity.TopicEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
    long countByExample(TopicEntityExample example);

    int deleteByExample(TopicEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TopicEntity record);

    int insertSelective(TopicEntity record);

    List<TopicEntity> selectByExampleWithBLOBs(TopicEntityExample example);

    List<TopicEntity> selectByExample(TopicEntityExample example);

    TopicEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TopicEntity record, @Param("example") TopicEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") TopicEntity record, @Param("example") TopicEntityExample example);

    int updateByExample(@Param("record") TopicEntity record, @Param("example") TopicEntityExample example);

    int updateByPrimaryKeySelective(TopicEntity record);

    int updateByPrimaryKeyWithBLOBs(TopicEntity record);

    int updateByPrimaryKey(TopicEntity record);
}