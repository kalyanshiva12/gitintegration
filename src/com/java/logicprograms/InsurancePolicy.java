package com.java.logicprograms;

import java.util.ArrayList;
import java.util.List;

public class InsurancePolicy {

	private List<Policy> polices = new ArrayList<>();

	public InsurancePolicy() {
		polices = new ArrayList<>();
	}

	public void addPolicy(Policy policie) {
		polices.add(policie);
	}

	public void removePolicy(Policy policy) {
		polices.remove(policy);
	}

	public List<Policy> getAllPolicies() {
		return polices;
	}
	
	
	
}
