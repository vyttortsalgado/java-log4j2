import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pessoa {

    private static final Logger logger = LogManager.getLogger(Pessoa.class);

    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id);
    }

    public Pessoa(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void talk(){
        logger.trace("Oi, eu sou um log.");
        logger.debug("Oi, eu sou um log.");
        logger.info("Oi, eu sou um log.");
        logger.warn("Oi, eu sou um log.");
        logger.error("Oi, eu sou um log.");
        logger.fatal("Oi, eu sou um log.");

        System.out.println("Testando");
    }
}
