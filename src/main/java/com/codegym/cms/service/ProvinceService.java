package com.codegym.cms.service;

import com.codegym.cms.model.Province;

public interface ProvinceService  {
    Iterable<Province> findAll();
    Province findById(long id);
    void save(Province province);
    void delete(long id);

}
