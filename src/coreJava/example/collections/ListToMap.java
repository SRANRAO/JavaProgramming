package coreJava.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String args[]) {
		//Create List
		List<CountryJob> countryJobsList = new ArrayList<CountryJob>();
		
		// add counttryJobs to list
		countryJobsList.add(new CountryJob("1","usa", "TX", "C2C", 75067));
		countryJobsList.add(new CountryJob("1","usa", "TX", "C2H", 75067));
		countryJobsList.add(new CountryJob("3","usa", "TX", "W2", 75067));
		countryJobsList.add(new CountryJob("4","usa", "NY", "C2C", 75067));
		countryJobsList.add(new CountryJob("5","usa", "NY", "C2H", 75067));
		countryJobsList.add(new CountryJob("6","usa", "NY", "W2", 75067));
		

		// Count the number of records using Collectors
		Long count = countryJobsList.stream().collect(Collectors.counting());
		System.out.println("Size of the list:"+count);
		
		//Create map using groupBy
		Map<String, List<CountryJob>> collectByStateCode = countryJobsList.stream().collect(Collectors.groupingBy(t -> t.getStateCode()));
		System.out.println("collect2========="+collectByStateCode);
		
		Map<String, Set<String>> collect = countryJobsList.stream().collect(Collectors.groupingBy(t -> t.getJobType(),
				Collectors.mapping(t-> t.getStateCode(), Collectors.toSet())));
		System.out.println("collect======"+collect);
		
		HashMap<String, Long> collect2 = countryJobsList.stream().collect(Collectors.groupingBy(t-> t.getStateCode(), HashMap:: new, Collectors.counting()));
		System.out.println("collect2===="+collect2);
		
		Hashtable<String, List<String>> collect3 = countryJobsList.stream().collect(Collectors.groupingBy(t->t.getStateCode(), Hashtable:: new,
				Collectors.mapping(t->t.getId(), Collectors.toList())));
		System.out.println("collect3======"+collect3);
	}		
	
	public static class CountryJob {
		
		private String id;
		
		private String name;
		
		private String stateCode;
		
		private String jobType;
		
		private int pinCode;
		
		public CountryJob() {

		}

		public CountryJob(String id, String name, String stateCode, String jobType, int pinCode) {
			this.id = id;
			this.name = name;
			this.stateCode = stateCode;
			this.jobType = jobType;
			this.pinCode = pinCode;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStateCode() {
			return stateCode;
		}

		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}

		public String getJobType() {
			return jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public int getPinCode() {
			return pinCode;
		}

		public void setPinCode(int pinCode) {
			this.pinCode = pinCode;
		}
		
	}
}


