package com.taotao.mapper;

import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int countByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int deleteByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int insert(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int insertSelective(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    List<TbUser> selectByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    TbUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Mar 22 02:05:02 CST 2017
     */
    int updateByPrimaryKey(TbUser record);
}