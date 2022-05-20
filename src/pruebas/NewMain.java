/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import DAOs.ConexionBD;
import DAOs.ProfesoresDAO;
import Entities.Profesor;
import Interfaces.IProfesoresDAO;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import interfaces.IFachadaBO;
import org.bson.Document;

/**
 *
 * @author marti
 */
public class NewMain {
private IFachadaBO fachadaBO;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        MongoClient mongoClient = new MongoClient();
        //ACCESO A LA BD ESPECIFICA
        MongoDatabase database = mongoClient.getDatabase("proyectos");
        //ACCESO A LA COLECCCIÓN
        MongoCollection<Document> collection = database.getCollection("profesores");
        
        IProfesoresDAO profesoresDAO = new ProfesoresDAO(new ConexionBD());
    }
    
}
