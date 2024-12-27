package co.edu.ue.entity;

//Esta es mi clase generica
//Toda clase debe llevar atributos, construtores y metodos de acceso, metodos de orden que son los metodos que nosotros creamos

public class User { // 1.Declaramos atributos encapsulados

	private Integer id;
	private String name;
	private String lastname;
	private String mail;

	// 2. constructor para darle valores a mis atributos

	public User(int id, String name, String lastname, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
	}

	public User() {
		super();
	}

	// 3. metodos de acceso a los atributos con el metodo get

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", mail=");
		builder.append(mail);
		builder.append("]");
		return builder.toString();
	}

}
