package Dao;
import uvsq.fr.pglp5_2.Annuaire;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class AnnuaireDAO implements DAO<Annuaire> {


    @Override
    public Annuaire create(Annuaire obj) {
        try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("annuaire")))) {
            out.writeObject(obj);
        }
        catch(IOException ioe){

        }
        return obj;
    }

    @Override
    public Annuaire find(String id) {
        Annuaire p = Annuaire.getInstance();
        try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(id)))) {
            p = (Annuaire) in.readObject();

          }
        catch(ClassNotFoundException | IOException e){
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
	public Annuaire update(Annuaire obj) {
		// TODO Auto-generated method stub
		return null;
	}
}