package Dao;
import uvsq.fr.pglp5_2.Groupe;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class GroupeDAO implements DAO<Groupe> {

	  @Override
	  public Groupe create(Groupe obj) {
	    try (ObjectOutputStream out =
	        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("groupe")))) {
	      out.writeObject(obj);
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
	    return obj;
	  }

	  @Override
	  public Groupe find(String id) {
	    Groupe g = new Groupe("Vide");
	    try (ObjectInputStream in =
	        new ObjectInputStream(new BufferedInputStream(new FileInputStream(id)))) {
	      g = (Groupe) in.readObject();

	    } catch (ClassNotFoundException | IOException e) {
	      e.printStackTrace();
	    }

	    return g;
	  }

	  @Override
	  public void delete(String file) {

	    try {
	      File f = new File(file);

	      if (f.delete()) {
	        System.out.println("supression avec sucees");
	      } else {
	        System.out.println("echouer");
	      }
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

	@Override
	public Groupe update(Groupe obj) {
		// TODO Auto-generated method stub
		return null;
	}
	}
