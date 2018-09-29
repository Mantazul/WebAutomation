package database;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ConnectToMongoDB {

    public static MongoDatabase mongoDatabase = null;
    public static MongoDatabase connectToMongoDB(){
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("data01");
        System.out.println("Database Connected");
        return mongoDatabase;
    }

    public static String insertToMongoDB(WebElement element){
        MongoDatabase mongoDatabase = connectToMongoDB();
        String menu = element.getText();
        MongoCollection<Document>  collection = mongoDatabase.getCollection("infoMenu");
        //using getCollection(String s) method.
        Document doc = new Document().append("menuList",menu);
        collection.insertOne(doc);
        return menu + " added.";
    }

    public static List<String> readFromMongoDB(){
        List<String> list = new ArrayList<>();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("infoMenu");
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for(Document doc:iterable){
            String id = "";
            int idInt = 0;
            String spanText = (String) doc.get("menuList");
            list.add(spanText);
        }
        return list;
    }
    }


