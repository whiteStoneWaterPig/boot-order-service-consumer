package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bloom on 2018/9/2.
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;


    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id：" + userId);
        //查询用户的收获地址
        List<UserAddress> addressesList = userService.getUserAddressList(userId);
        return addressesList;



    }
}
