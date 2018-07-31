package com.pricetag.Service;

import com.pricetag.Bean.ItemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ItemInfo> getItemInfo(){
        String sql="select top 27 fa.item_no,"+
                " fb.item_name as a,cast(fa.sale_price as numeric(14,2)) as p , " +
                "case when fa.item_no in ('40014') then 1 when fa.item_no in ('40002') then 2 when fa.item_no in ('40041') then 3 "+
                "	when fa.item_no in ('40005') then 4 when fa.item_no in ('40003') then 5 when fa.item_no in ('40033') then 6 "+
                "	when fa.item_no in ('40006') then 7 when fa.item_no in ('40008') then 8 when fa.item_no in ('40030') then 9 "+
                "	when fa.item_no in ('40007') then 10 when fa.item_no in ('40012') then 11 when fa.item_no in ('40042') then 12"+
                "	when fa.item_no in ('40015') then 13 when fa.item_no in ('40022') then 14 when fa.item_no in ('40028') then 15"+
                "	when fa.item_no in ('40031') then 16 when fa.item_no in ('40024') then 17 when fa.item_no in ('40035') then 18"+
                "	when fa.item_no in ('40034') then 19 when fa.item_no in ('40001') then 20 when fa.item_no in ('40037') then 21"+
                "	when fa.item_no in ('40004') then 22 when fa.item_no in ('40009') then 23 when fa.item_no in ('40043') then 24"+
                "	when fa.item_no in ('40040') then 25 when fa.item_no in ('40018') then 26 when fa.item_no in ('40039') then 27"+
                "	 else 99 end  row "+
                "from t_pc_branch_price fa " +
                "LEFT JOIN t_bd_item_info fb on fa.item_no=fb.item_no " +
                "where fa.branch_no='0002' and fa.sale_flag='0' and fa.item_no like '40___' ";

        //List<ItemInfo> list1 = jdbcTemplate.queryForList(sql, ItemInfo.class);
        List<ItemInfo> list = jdbcTemplate.query(sql, new RowMapper<ItemInfo>() {
            @Override
            public ItemInfo mapRow(ResultSet resultSet, int i) throws SQLException {
                ItemInfo item = new ItemInfo();
                item.setItem_no(resultSet.getString("item_no"));
                item.setA(resultSet.getString("a"));
                item.setP(resultSet.getString("p"));
                item.setRow(resultSet.getString("row"));

                return item;
            }
        });
        for (ItemInfo itemInfo : list) {
            System.out.println(itemInfo.toString());
        }
        return  list;

    }
}
