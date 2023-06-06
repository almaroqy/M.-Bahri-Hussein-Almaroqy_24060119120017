/*
	File: DAOManager.java
	Nama: M. Bahri Hussein Almaroqy
	Deskripsi: pengelola DAO dalam program
*/

public class DAOManager {
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person) {
		personDAO = person;
	}

	public PersonDAO getPersonDAO() {
		return personDAO;
	}
}