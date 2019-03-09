package com.baomidou.samples.mybatisplus2.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.samples.mybatisplus2.entity.Address;
import com.baomidou.samples.mybatisplus2.mapper.AddressMapper;
import com.baomidou.samples.mybatisplus2.service.AddressService;
import org.springframework.stereotype.Service;


@Service
@DS("mysql2")//这里必须包一层，不能调用mp默认的插入，因为会走到从库去
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {
}
