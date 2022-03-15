package es.ucm.fdi.is2.h2sample.domain.resource;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonResource {

    private String name;
    private String type;
    private String attack;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAttack() {
        return attack;
    }
    public void setAttack(String attack) {
        this.attack = attack;
    }

}


