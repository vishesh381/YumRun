package com.yumrun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yumrun.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
