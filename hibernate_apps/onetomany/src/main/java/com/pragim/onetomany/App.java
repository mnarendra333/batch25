package com.pragim.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.onetomany.entity.IPLTeam;
import com.pragim.onetomany.entity.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        //child objects
        
        Player p1 = new Player();
        p1.setId(1001);
        p1.setPlayerName("Rohit");
        p1.setAge(35);
        p1.setRuns(4000);
        p1.setPlayerType("BATSMEN");
        
        
        Player p2 = new Player();
        p2.setId(1002);
        p2.setPlayerName("PANDYA");
        p2.setAge(28);
        p2.setRuns(2000);
        p2.setPlayerType("BATSMEN");
        
        
        Player p3 = new Player();
        p3.setId(1003);
        p3.setPlayerName("AYYAR");
        p3.setAge(27);
        p3.setRuns(2000);
        p3.setPlayerType("BATSMEN");
        
        
        Set<Player> palyerList = new HashSet<Player>();
        palyerList.add(p1);
        palyerList.add(p2);
        palyerList.add(p3);
        
        
        //prepare the parent
        IPLTeam team = new IPLTeam();
        team.setId(1);
        team.setTeamName("Mumbai Indians");
        team.setOwner("MA");
        team.setCity("Mumbai");
        team.setPlayerList(palyerList);
        
        
        Transaction tx = session.beginTransaction();
        
        session.save(team);
        
        tx.commit();
        System.out.println("Done!!!!");
        
        
        
        
        
        
        
    }
}
