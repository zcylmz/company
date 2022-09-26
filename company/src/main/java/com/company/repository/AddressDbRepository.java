package com.company.repository;

import com.company.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDbRepository extends JpaRepository<Address,Long> {

}
