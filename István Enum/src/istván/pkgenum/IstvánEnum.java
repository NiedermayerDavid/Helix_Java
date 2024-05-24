/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package istván.pkgenum;

import istván.pkgenum.IstvánEnum.Capa;

/**
 *
 * @author nidid
 */
public class IstvánEnum {

    
    public static void main(String[] args) {
      
    }
    public static class Hal {
        protected  String faj;
        public Hal(String faj){
            
            this.faj = faj;
        }
        }
    public class Capa extends Hal{
        private boolean veszelyes;
        public Capa(String faj){
            super(faj);
            this.veszelyes = false;
        }
    }
    Hal h = new Hal("Lazac");
    Capa c = new Capa("Tigriscapa");
    
    
    
    }
    

