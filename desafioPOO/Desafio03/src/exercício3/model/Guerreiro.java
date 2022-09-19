package exercício3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
    
    static int qtdGuerreiros ;
    
    private List<String> Habilidade = new ArrayList<>();

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        qtdGuerreiros ++;
    }

    public static int getQtdGuerreiros() {
        return qtdGuerreiros;
    }

    public List<String> getHabilidade() {
        return Habilidade;
    }

    public void setHabilidade(List<String> Habilidade) {
        this.Habilidade = Habilidade;
    }

    @Override
    public void lvlUp() {
        setVida(getVida() + 30);
        setMana(getMana() + 5);
        setXp(getXp() + 1);
        setInteligencia(getInteligencia() + 2);
        setForca(getForca() + 55);
        setLevel(getLevel() + 1);
    };
    
    public void attack() {
        Random gerador = new Random();
        int ataque = (getForca() * getLevel()) + gerador.nextInt(300);
    };
    
    public String aprenderMagia(String habilidade) {
        Habilidade.add(habilidade);
        return "Habilidade " + habilidade + " adquirida!";
    };
    
    public int totalGuerreiro(){
    int totalDeGuerreiros = getQtdGuerreiros();
    return totalDeGuerreiros;
}
}
