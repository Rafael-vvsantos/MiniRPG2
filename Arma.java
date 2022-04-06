class Arma {
  int id;
  int forca;

  Arma (int idArma , int forcaArma){
    id = idArma;
    forca = forcaArma;
  }
  
  int danoDaArma(){
    return forca * 2;
  }
}