package ru.springboot.MySecondTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.springboot.MySecondTestAppSpringBoot.model.Request;
import ru.springboot.MySecondTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

@Service
@Qualifier("ModifySystemTimeRequestService")
public class ModifySystemTimeRequestService implements ModifyRequestService {

    @Override
    public void modify(Request request) {
        request.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
    }

}
