import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int dano = 0; 
    //Arma arma1 = new Arma(01 , 10);
    Player player1 = new Player("Biú" , 100 , 10 , 10 , 30);
    Arma arma1 = new Arma(01 , 10);//colocar antes do player1
    player1.receberArma(arma1);
    
    String playerStatus = player1.exibirStatus();
    System.out.println(playerStatus);

    Monstro monstro1 = new Monstro("Gatinho Manhoso" , 10, 10);// fazer sem contrutor colocar o monstro1.
    //dano = player1.causarDano();
    
    monstro1.receberDano(/*dano*/player1.causarDano());
  }
}

    /*Scanner lerEntrada = new Scanner(System.in);
    int dano = 0;
    Player player = new Player();
    player.nome = lerEntrada.next();
    player.pontoDeVida = 100;
    player.posicaoX = 0;
    player.posicaoY = 0;
    
    System.out.println("Posição X: ");
    char posX = lerEntrada.next().charAt(0);
    
    
    System.out.println("Posição Y: ");
    char posY = lerEntrada.next().charAt(0);
    player.mover(posX , posY);

    System.out.println("A posição X : " + player.exibirPosicaoX() + " A posição Y :" + player.exibirPosicaoY());

    System.out.println("Combate Começa");
    dano = 10;
    player.recerberDano(dano);

    System.out.println("A sua vida " + player.exibirPontosDeVida());

    System.out.println("Situação do jogador: \n" + player.exibirStatus());
  }*/

/*Instancia é todo objeto*/
/*Assinutura do metodo, declaração do metedo
classe > metedos > estruturas
Manutençã em aninhamento é complexa*/

/*while(monstro.pontosDeVida > 0 ){
  monstro1.receberDano(player1.causarDano())
  system.out,println("Vida monstro :" + monstro1.pontosDeVida) 
}*/