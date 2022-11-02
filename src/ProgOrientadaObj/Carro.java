package ProgOrientadaObj;

public class Carro {
        // Atributos
        private  String  marca ;
        modelo String  privado ;
        int  . privada ;
        int velocidade

       // Método construtor para informar Marca e Modelo
       Carro ( String  marca , String  modelo ) {
           isso . marca = marca ;
           isso . modelo = modelo ;
           velocidade = 0 ;
       }
   
       // Método para acelerar
       public  void  acelerar ( int  a ) {
           Sistema . fora . println ( "-- Aceleração --" );
           velocidade = velocidade + a ;
           if ( velocidade > 200 ) {
               Sistema . fora . println ( "Impossível acelerar tanto." );
               velocidade = 200 ;
           } else {
               Sistema . fora . println ( "A velocidade atual do carro é: " + velocidade + " km/h." );
           }
       }
   
       // Método para frear
       void  frear ( int  f ) {
           Sistema . fora . println ( "-- Frenagem --" );
           velocidade = velocidade - f ;
           if ( velocidade < 0 ) {
               Sistema . fora . println ( "Você freou muito forte. \nA velocidade atual é 0 km/h." );
               velocidade = 0 ;
           } else {
               Sistema . fora . println ( "A velocidade atual do carro é: " + velocidade + " km/h." );
           }
       }
   
       // Método toString
       @ Substituir
       public  String  toString () {
           return  "Carro {" +
                   "marca='" + marca + '\'' +
                   ", modelo='" + modelo + '\'' +
                   ", velocidade=" + velocidade +
                   '}' ;
       }
   
       // Método printStatus
       public  void  printStatusCarro () {
           Sistema . fora . println ( toString ());
       }
}
