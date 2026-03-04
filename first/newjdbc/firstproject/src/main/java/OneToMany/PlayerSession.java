package OneToMany;

import jakarta.persistence.*;

@Entity
public class PlayerSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String playerName;

    @ManyToOne
    @JoinColumn(name = "server_id")   // FK column
    private GameServer server;

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public GameServer getServer() {
        return server;
    }

    public void setServer(GameServer server) {
        this.server = server;
    }
}