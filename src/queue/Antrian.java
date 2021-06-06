/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author User
 */
public class Antrian {
        private int ukuran;
        private long[] antrian;
        private int belakang;
        private int jumitem;
        private int depan;
    
        public Antrian (int s){
            ukuran = s;
            antrian = new long[ukuran];
            depan = 0;
            belakang = -1;
            jumitem = 0;
    }
    
        public void enqueue (long j){
                if (!isFull()){
                     antrian[++belakang] = j;
                     jumitem++;
                }
        }

        public long dequeue (){
            long temp = antrian[0];
            if (!isEmpety()){
              for (int i=0; i<jumitem; i++)
                  antrian [1] = antrian[i+1];
                  jumitem--;
                  belakang--;
            }
            return temp;
    } 
        public long peek(){
               return antrian[depan];
        }
        public boolean isEmpety(){
               return(jumitem==0);
        }
        public boolean isFull(){
                return(belakang==ukuran-1);
        }
       public int ukuran(){
        return jumitem;
        }
       public void display(){
            for (int i=0; i<jumitem; i++)
            System.out.print(antrian[i]+" ");
            System.out.println("");
        
      
      }
}
