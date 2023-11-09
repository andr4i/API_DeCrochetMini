package com.gen.DeCrochet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.DeCrochet.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
