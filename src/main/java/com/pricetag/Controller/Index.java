package com.pricetag.Controller;

import com.pricetag.Bean.ItemInfo;
import com.pricetag.Bean.RowItem;
import com.pricetag.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Index {

    @Autowired
    private ItemService itemService;


    @RequestMapping("/")
    public String getIndex(Model model) {
        List<ItemInfo> list = itemService.getItemInfo();
        List<RowItem> items = new ArrayList<>();
        for (int i =1;i<=list.size();i=i+3){
            RowItem ri = new RowItem();
            ri.setName1(list.get(i-1).getA());
            ri.setPrice1(list.get(i-1).getP());
            ri.setName2(list.get(i).getA());
            ri.setPrice2(list.get(i).getP());
            ri.setName3(list.get(i+1).getA());
            ri.setPrice3(list.get(i+1).getP());
            items.add(ri);
        }
        model.addAttribute("items",items);
        return "price.html";
    }
}
