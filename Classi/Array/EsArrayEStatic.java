/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esarrayestatic;

import java.util.Scanner;
/**
 *
 * @author Studente
 */
public class EsArrayEStatic {

  
    /**
     * @param args the command line arguments
     */
        static int operazioni=0;
        static double UltimaSomma=0;
        static int UltimoMax=0;
        static int UltimoMin=0;
        
    public static void main(String[] args) {
        final int DIM=5;
        int [] A=new int [DIM];
        double somma;
        int Max;
        int Min;
        
        
        Popola(A);
        
        Stampa(A);
        
        somma=Somma(A,DIM);
        
        System.out.println("La somma dei contenuti degli array è:"+somma);
       
        Max=max(A,DIM);
        Min=min(A,DIM);
        System.out.println("Max:"+Max+", Min:"+Min);
    }
    
    static void Popola (int[] A){
        EsArrayEStatic.operazioni++;
        
          Scanner scanner = new Scanner(System.in);
          
        System.out.println("Popoliamo l'array");
        
        for(int i=0; i<A.length;i++){
            
            A[i]=scanner.nextInt();
            
        }
        }
    static void Stampa(int[] A){
           EsArrayEStatic.operazioni++;
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    
    static double Somma(int[] A, int DIM){
           EsArrayEStatic.operazioni++;
        double ris=0;
        for(int i=0;i<DIM;i++){
            ris+=A[i];
            EsArrayEStatic.operazioni++;
        }
        EsArrayEStatic.UltimaSomma=ris;
        
        return ris;
    }
    
    static int max(int [] A, int DIM){
           EsArrayEStatic.operazioni++;
        int Max=0;
        for(int i=0;i<DIM;i++){
            if(i==0){
                Max=A[i];
                
            }
            else if(A[i]>Max){
                Max=A[i];
            }
        }
        EsArrayEStatic.UltimoMax=Max;
        return Max;
    }
    
    static int min(int[] A, int DIM){
           EsArrayEStatic.operazioni++;
        int Min=0;
         for(int i=0;i<DIM;i++){
            if(i==0){
                Min=A[i];
                
            }
            else if(A[i]>Min){
                Min=A[i];
            }
        }
         EsArrayEStatic.UltimoMin=Min;
        return Min;
    }
}
