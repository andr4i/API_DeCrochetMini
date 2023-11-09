package com.gen.DeCrochet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gen.DeCrochet.model.Address;
import com.gen.DeCrochet.repository.AddressRepository;

@Service
public class AddressService {

	
	@Autowired
	private AddressRepository addressRepository;
	
	// GET
	public List<Address> getAllAddress(){
		return addressRepository.findAll();
	}
	
	public Address getAddressById(long id) {
		return addressRepository.findById(id).orElse(null);
	}
	
	// POST
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}
	
	// PUT
	public Address updateAddress(Long id,Address addressDetails) {
		Address address = addressRepository.findById(id).orElse(null);
		address.setCity(addressDetails.getCity());
		address.setExtNumber(addressDetails.getExtNumber());
		address.setIntNumber(addressDetails.getIntNumber());
		address.setState(addressDetails.getState());
		address.setStreet(addressDetails.getStreet());
		address.setNeighbourhood(addressDetails.getNeighbourhood());
		address.setZipCode(addressDetails.getZipCode());
		
		return addressRepository.save(address);
	}
	
	// DELETE
	
	public void deleteAddress(Long id) {
		addressRepository.deleteById(id);
	}
	
	
	
}
