package com.java.logicprograms;

import java.util.*;

public class InsuranceProject {
	private Map<String, InsurancePolicy> policyMap;
	private InsurancePolicy[] policies;
	private List<InsurancePolicy> policyList;
	private Set<InsurancePolicy> policySet;
	private Queue<InsurancePolicy> policyQueue;

	public InsuranceProject() {
		policyMap = new HashMap<>();
		policies = new InsurancePolicy[10];
		policyList = new ArrayList<>();
		policySet = new HashSet<>();
		policyQueue = new LinkedList<>();
	}

	public void addPolicyToMap(String policyNumber, InsurancePolicy policy) {
		policyMap.put(policyNumber, policy);
	}

	public InsurancePolicy getPolicyFromMap(String policyNumber) {
		return policyMap.get(policyNumber);
	}

	public void removePolicyFromMap(String policyNumber) {
		policyMap.remove(policyNumber);
	}

	public void addPolicyToArray(int index, InsurancePolicy policy) {
		policies[index] = policy;
	}

	public InsurancePolicy getPolicyFromArray(int index) {
		return policies[index];
	}

	public void addPolicyToList(InsurancePolicy policy) {
		policyList.add(policy);
	}

	public InsurancePolicy getPolicyFromList(int index) {
		return policyList.get(index);
	}

	public void removePolicyFromList(InsurancePolicy policy) {
		policyList.remove(policy);
	}

	public void addPolicyToSet(InsurancePolicy policy) {
		policySet.add(policy);
	}

	public boolean containsPolicyInSet(InsurancePolicy policy) {
		return policySet.contains(policy);
	}

	public void removePolicyFromSet(InsurancePolicy policy) {
		policySet.remove(policy);
	}

	public void addPolicyToQueue(InsurancePolicy policy) {
		policyQueue.add(policy);
	}

	public InsurancePolicy getNextPolicyFromQueue() {
		return policyQueue.poll();
	}

	// Other methods for manipulating the collections
}
