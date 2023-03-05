package com.store.mapper;

import com.store.entity.user.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper {
    int addAddress(Address address);
    int deleteAddress(int id);
    int modifyAddress(Address address);
    List<Address> addressList(String account);
    int setAddressOff(int id);//设置地址为删除状态
}
