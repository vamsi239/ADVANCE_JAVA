package OneToMany;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class GameServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String serverName;

    @OneToMany(mappedBy = "server", cascade = CascadeType.ALL)
    private List<PlayerSession> sessions;

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public List<PlayerSession> getSessions() {
        return sessions;
    }

    public void setSessions(List<PlayerSession> sessions) {
        this.sessions = sessions;
    }
}