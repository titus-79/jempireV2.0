package models.units;
import java.util.List;

public class Villagers {

    private String name;
    private String surname;
    private static final List<String> villagersName = List.of("Lucas","Nathan","Emma","Chloé","Hugo","Léa","Louis","Camille","Gabriel","Inès","Arthur","Jade","Raphaël","Manon","Tom","Zoé","Noah","Sarah","Adam","Clara","Ethan","Lola","Paul","Mila","Mathis");
    private static final List<String> villagerSurname = List.of("Martin","Bernard","Thomas","Petit","Robert","Richard","Durand","Dubois","Moreau","Laurent","Simon","Michel","Lefebvre","Leroy","Roux","David","Bertrand","Morel","Fournier","Girard","Bonnet","Dupont","Lambert","Fontaine","Rousseau");

    public Villagers() {
        this.name = name;
        this.surname = surname;
        generateName();
    }

    private void generateName(){
        int random = (int) (Math.random() * 25);
        this.name = villagersName.get(random);
        this.surname = villagerSurname.get(random);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
