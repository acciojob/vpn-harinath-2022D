package com.driver.services;

import com.driver.model.Admin;
import com.driver.model.ServiceProvider;
import com.driver.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;

@Service
public interface AdminService {
    public Admin register(String username, String password);
    public Admin addServiceProvider(int adminId, String providerName);
    public ServiceProvider addCountry(int serviceProviderId, String countryName) throws Exception;

}