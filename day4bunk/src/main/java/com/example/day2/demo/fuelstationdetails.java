package com.example.day2.demo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="petrolbunk")
public class fuelstationdetails {
	@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int sapCode;
		@Column(name="bunkname")
		private String bunkName;
		private String address;
		public int getSapCode() {
			return sapCode;
		}
		public void setSapCode(int sapCode){
			this.sapCode = sapCode;
		}

		public String getBunkName() {
			return bunkName;
		}
		public void setBunkName(String bunkName) {
			this.bunkName = bunkName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}	
}
