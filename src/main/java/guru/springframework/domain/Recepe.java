package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recepe  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descreption;
    private Integer prepTime;
    private  Integer cookTime;
    private String Source;
    private String URl;
    private String Direction;

    @Lob
    private byte[] image;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recepe")
    private Set<Ingrediant> ingrediants;

    public Long getId() {
        return id;
    }

    public Set<Ingrediant> getIngrediants() {
        return ingrediants;
    }

    public void setIngrediants(Set<Ingrediant> ingrediants) {
        this.ingrediants = ingrediants;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getURl() {
        return URl;
    }

    public void setURl(String URl) {
        this.URl = URl;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
