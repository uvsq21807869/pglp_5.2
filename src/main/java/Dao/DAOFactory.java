package Dao;

import uvsq.fr.pglp5_2.Annuaire;
import uvsq.fr.pglp5_2.Groupe;
import uvsq.fr.pglp5_2.Personnel;

public class DAOFactory {
	public static DAO<Annuaire> getAnnuaireDAO(){

        return new AnnuaireDAO();
    }

	 public static DAO<Groupe> getGroupeDao() {

		    return new GroupeDAO();
		  }

		  public static DAO<Personnel> getPersonnelDao() {

		    return new PersonnelDAO();
		  }
}
