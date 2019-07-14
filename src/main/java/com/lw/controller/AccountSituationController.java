package com.lw.controller;

import com.lw.entity.FundAccountSituationEntity;
import com.lw.service.AccountSituationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountSituationController {
    private static final Logger log = LoggerFactory.getLogger(AccountSituationController.class);
    @Autowired
    private AccountSituationService accountService;

    @RequestMapping("/getList")
    public String getList() {
        List<FundAccountSituationEntity> list = accountService.getList(null);
        log.debug("list.size()={} ", list.size());
        log.info("webapp.root=[{}]", System.getProperty("webapp.root"));
        return "hello";
    }
}
