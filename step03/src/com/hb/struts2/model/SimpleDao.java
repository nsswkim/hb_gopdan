package com.hb.struts2.model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class SimpleDao {
   
   public List<SimpleVo> selectAll() {
      List<SimpleVo> list = new ArrayList<>();
      System.out.println("daoΩ√¿€");
      list.add(new SimpleVo(1111,"test1",
            new Date(System.currentTimeMillis()),4321));
      list.add(new SimpleVo(2222,"test2",
            new Date(System.currentTimeMillis()),4321));
      list.add(new SimpleVo(3333,"test3",
            new Date(System.currentTimeMillis()),4321));
      System.out.println("dao≥°");
      return list;
   }

   
}