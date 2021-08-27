package com.pamirs.takin.entity.dao.dict;

import java.util.List;
import java.util.Map;

import com.pamirs.takin.entity.domain.vo.TDictionaryVo;
import com.pamirs.takin.entity.domain.entity.TDictionaryData;
import org.apache.ibatis.annotations.Param;

public interface TDictionaryDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    int insert(TDictionaryData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    int insertSelective(TDictionaryData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    TDictionaryData selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TDictionaryData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionary_data
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TDictionaryData record);

    /**
     * 更新数据字典
     *
     * @param tDictionaryVo
     */
    void updateDictionary(TDictionaryVo tDictionaryVo);

    /**
     * 查询数据字典列表
     *
     * @param paramMap
     * @return
     */
    List<TDictionaryVo> queryDictionaryList(Map<String, Object> paramMap);

    /**
     * 查询数据字典详情
     *
     * @param tDictionaryId
     * @return
     */
    TDictionaryVo queryDictionaryDetail(@Param("tDictionaryId") String tDictionaryId);

    /**
     * 删除数据字典
     *
     * @param tDictionaryIds
     */
    void deleteDictionary(@Param("tDictionaryIds") List<String> tDictionaryIds);

    /**
     * 删除数据字典类型，当有数据字典类型，但没有字典值时，删除
     */
    void deleteEmptyDictType();

}
