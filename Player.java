class Player {
  Arma arma;
  int forca;
  float posicaoX;
  float posicaoY;
  int pontoDeVida;
  String nome;

  Player(String n, int ptsDeVida , float posicaoInicialX , float posicaoInicialY){
    nome = n;
    pontoDeVida = ptsDeVida;
    posicaoX = posicaoInicialX;
    posicaoY = posicaoInicialY;
  }
  
  void mover(float posX , float posY){
    if (posX == 'a'){
      posicaoX = posicaoX - 5;
    }else if(posX == 'd'){
      posicaoX = posicaoX + 5;
    }      
    if(posY == 'w'){
      posicaoY = posicaoY + 5;
    }else if(posY == 's'){
      posicaoY = posicaoY - 5;
    }
  }

  float exibirPosicaoX(){
    return posicaoX;
  }

  float exibirPosicaoY(){
    return posicaoY ;
  }

  void recerberDano(int dano){
    pontoDeVida = pontoDeVida - dano;
  }

  int exibirPontosDeVida(){

    return pontoDeVida;
  }

  String exibirStatus(){

    return "Player : " + nome + "\nVida Atual : " + pontoDeVida + "Arma :" + this.arma.id;
  }

  int causarDano(){
     forca = arma.danoDaArma();   
    return forca;
  }

  int receberArma(Arma arma1){
    this.arma = arma1;
    return 0;
  }
}

/*construtor 
  Player(/*pode receber parâmetros){
    
    //executa instruções 
    
    //sem retorno 
  }*/