package Dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import uvsq.fr.pglp5_2.Personnel;

public class PersonnelDAO implements DAO<Personnel> {

	  @Override
	  public Personnel create(Personnel obj) {
	    try (ObjectOutputStream out =new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("personnel")))) {
	      out.writeObject(obj);
	    } catch (IOException ioe) {
	    }
	    return obj;
	  }

	  @Override
	  public Personnel find(String id) {
	    Personnel p = null;
	    try (ObjectInputStream in =new ObjectInputStream(new BufferedInputStream(new FileInputStream(id)))) {
	      p = (Personnel) in.readObject();

	    } catch (ClassNotFoundException | IOException e) {
	      e.printStackTrace();
	    }

	    return p;
	  }

	  @Override
	  public void delete(String file) {

	        try {
	            File f = new File(file);

	            if (f.delete()) {
	                System.out.println("suppresion avec succees");
	            } else {
	                System.out.println("Failure");
	            }
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	    }

	@Override
	public Personnel update(Personnel obj) {
		// TODO Auto-generated method stub
		return null;
	}

	}
