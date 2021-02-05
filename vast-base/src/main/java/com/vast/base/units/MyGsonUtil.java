package com.vast.base.units;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.vast.base.dto.vo.BaseMenuVo;
import com.vast.base.entity.BaseMenu;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.units
 * @ClassName: MyGsonUtil
 * @Author: Administrator
 * @Description:
 * @Date: 2021/2/5 15:09
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class MyGsonUtil {
    private static Gson gson = new Gson();

    public static void main(String[] args) {
        BaseMenu menu1 = new BaseMenu();
        menu1.setId(1);
        menu1.setParentCode("2222");
        menu1.setMenuName("ceshi1");

        BaseMenu menu2 = new BaseMenu();
        menu2.setId(1);
        menu2.setParentCode("2222");
        menu2.setMenuName("ceshi2");

        List<BaseMenu> list = new ArrayList<>();
        list.add(menu1);
        list.add(menu2);

        List<BaseMenuVo> listVo = parseList(list,BaseMenuVo.class);
        for(BaseMenuVo vo : listVo) {
            System.out.println(vo.getMenuName());
        }
    }
    public static <T>List<T> parseList(String msg,Class<T> tClass) {
        List<T> list = new ArrayList<T>();
        try {
            Gson gson = new Gson();
            JsonArray arry = new JsonParser().parse(msg).getAsJsonArray();
            for (JsonElement jsonElement : arry) {
                list.add(gson.fromJson(jsonElement, tClass));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static <T>List<T> parseList(Object obj,Class<T> tClass) {
        if(null != obj) {
            String msg = gson.toJson(obj);
            return parseList(msg,tClass);
        }
        return null;
    }


    public static String bean2Json(Object list) {
        if(null != list) {
            return gson.toJson(list);
        }
        return null;
    }
}
