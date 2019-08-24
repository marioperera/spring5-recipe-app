package guru.springframework.domain;

import javax.persistence.*;

//import javax.persistence.Id;

@Entity
public class Notes {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @OneToOne
    private Recepe recepe;

    @Lob
    private  String recepeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recepe getRecepe() {
        return recepe;
    }

    public void setRecepe(Recepe recepe) {
        this.recepe = recepe;
    }

    public String getRecepeNotes() {
        return recepeNotes;
    }

    public void setRecepeNotes(String recepeNotes) {
        this.recepeNotes = recepeNotes;
    }
}
