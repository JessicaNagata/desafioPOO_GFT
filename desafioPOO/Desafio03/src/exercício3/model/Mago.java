package exercício3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
    static int qtdMagos ;
    
    private List<String> Magia = new ArrayList<>();

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        
        qtdMagos ++;
    }

    public static int getQtdMagos() {
        return qtdMagos;
    }
    
    public List<String> getMagia() {
        return Magia;
    }

    public void setMagia(List<String> magia) {
        this.Magia = magia;
    }
    
    @Override
    public void lvlUp(){
        setVida(getVida() + 10);
        setMana(getMana() + 45);
        setXp(getXp() + 1);
        setInteligencia(getInteligencia() + 50);
        setForca(getForca() + 5);
        setLevel(getLevel() + 1);
    };
    public void attack(){
         Random gerador = new Random();
         int ataque = (getInteligencia()*getLevel()) + gerador.nextInt(300);
    };
    
    public String aprenderMagia(String habilidade) {
        Magia.add(habilidade);
        return "Magia " + habilidade + " aprendida!";
    }
    
    public int totalMago(){
    int totalDeMagos = getQtdMagos();
    return totalDeMagos;
    }
}
