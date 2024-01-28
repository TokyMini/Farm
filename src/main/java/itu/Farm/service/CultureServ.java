package itu.Farm.service;

import itu.Farm.bean.Culture;
import itu.Farm.conn.Connexion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class CultureServ {
    @Autowired
    Connexion co;

    public List<Culture> getAll() {
        List<Culture> table = new ArrayList<>();
        try {
            Connection conn = co.connect();

            String sql = "select * from culture";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Culture temp = new Culture(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5));
                table.add(temp);
            }

            rs.close();
            stmt.close();
            conn.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return table;
    }

    public Culture find(String id){
        List<Culture> cu = this.getAll();
        for (Culture l: cu){
            if(l.getId().equalsIgnoreCase(id)){
                return l;
            }
        }
        return null;
    }
}
