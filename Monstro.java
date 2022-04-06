class Monstro {
  String nome;
  int forca;
  int pontosDeVida;

  Monstro(String n , int f , int ptsDeVida ){
    nome = n;
    pontosDeVida = ptsDeVida;
    forca = f;
    
  }
  
  int causarDano(){
    return forca * 3;
  }

  String grunhir(){
    return "Fiu Fiu";
  }

  void receberDano(int dano ){
    pontosDeVida -= dano;

      if(pontosDeVida <= 0){
        morrer();
      }
  }

  void morrer (){
    System.out.println("Morreu");
  }
  
}