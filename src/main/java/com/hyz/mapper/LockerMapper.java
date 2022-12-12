package com.hyz.mapper;

import com.hyz.pojo.Locker;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LockerMapper {
    Boolean updateLockerStatusByMemberAccount(@Param("memberAccount") Integer memberAccount,@Param("lockerNumberId") Integer lockerNumberId);

    List<Locker> getAll();

    Boolean resetBox(@Param("lockerNumberId") Integer lockerNumberId);

    Locker getInfoByMemberId(@Param("lockerNumberId") Integer lockerNumberId);
}
