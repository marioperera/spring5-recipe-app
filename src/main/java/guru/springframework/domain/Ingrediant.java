package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingrediant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Descreption;
    private BigDecimal amount;

    @ManyToOne
    private Recepe recepe;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getDescreption() {
        return Descreption;
    }

    public void setDescreption(String descreption) {
        Descreption = descreption;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recepe getRecepe() {
        return recepe;
    }

    public void setRecepe(Recepe recepe) {
        this.recepe = recepe;
    }
}
