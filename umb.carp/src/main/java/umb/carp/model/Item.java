package umb.carp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lista_utenti")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	private String province;
	private int age;
	private String fiscalcode;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String username, String password, String name, String lastname, String email, String phone,
			String province, int age, String fiscalcode) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.province = province;
		this.age = age;
		this.fiscalcode = fiscalcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFiscalcode() {
		return fiscalcode;
	}
	public void setFiscalcode(String fiscalcode) {
		this.fiscalcode = fiscalcode;
	}
	
	@Override
	public String toString() {
		return "Lista_Utente [id=" + id + ", username=" + username + ", name=" + name + ", lastname=" + lastname
				+ ", email=" + email + ", phone=" + phone + ", province=" + province + ", age=" + age + ", fiscalcode="
				+ fiscalcode + "]";
	}
}