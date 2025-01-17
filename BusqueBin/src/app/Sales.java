package app;

import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

import app.Sales.BusquedaBinaria;

public class Sales {
	
	Scanner scan = new Scanner(System.in);
	int opc;
	int [] Enero = new int [30];
	int [] Feb = new int [30];
	int [] Mar = new int [30];
	int [] Abr = new int [30];
	int [] May = new int [30];
	int [] Jun = new int [30];
	int [] Jul = new int [30];
	int [] Ago = new int [30];
	int [] Sep = new int [30];
	int [] Oct = new int [30];
	int [] Nov = new int [30];
	int [] Dic = new int [30];
	
	
	public void Menu()
	{
		System.out.println("Elige de las siguientes oopciones el mes del que quieres buscar la venta");
		System.out.println("1)Enero 2)Febrero 3)Marzo 4)Abril 5)Mayo 6)Junio");
		System.out.println("7)Julio 8)Agosto 9)Septiembre 10)Octubre 11)Noviembre 12)Diciembre");
		opc = scan.nextInt();
		switch(opc){
		case 1: 
			LlenarRandom();
			Buscar(Enero);
			break;
		case 2:
			LlenarRandom();
			Buscar(Feb);
			break;
		case 3:
			LlenarRandom();
			Buscar(Mar);
			break;
		case 4:
			LlenarRandom();
			Buscar(Abr);
			break;
		case 5:
			LlenarRandom();
			Buscar(May);
		case 6:
			LlenarRandom();
			Buscar(Jun);
			break;
		case 7:
			LlenarRandom();
			Buscar(Jul);
			break;
		case 8:
			LlenarRandom();
			Buscar(Ago);
			break;
		case 9:
			LlenarRandom();
			Buscar(Sep);
			break;
		case 10:
			LlenarRandom();
			Buscar(Oct);
			break;
		case 11:
			LlenarRandom();
			Buscar(Nov);
			break;
		case 12:
			LlenarRandom();
			Buscar(Dic);
			break;
		default:
			System.out.println("�Ves lo que hiciste? el programa explot� por tu culpa");
			break;
		}
		
	}
	
	
	private void LlenarRandom(){
		for(int i=0; i<=29; i++){
			Enero [i] = (int)(Math.random()*100)+1;
			Feb [i] = (int)(Math.random()*100)+1;
			Mar [i] = (int)(Math.random()*100)+1;
			Abr [i] = (int)(Math.random()*100)+1;
			May [i] = (int)(Math.random()*100)+1;
			Jun [i] = (int)(Math.random()*100)+1;
			Jul [i] = (int)(Math.random()*100)+1;
			Ago [i] = (int)(Math.random()*100)+1;
			Sep [i] = (int)(Math.random()*100)+1;
			Oct [i] = (int)(Math.random()*100)+1;
			Nov [i] = (int)(Math.random()*100)+1;
			Dic [i] = (int)(Math.random()*100)+1;
		}
	}
	
	interface BusquedaBinaria{	
		public int Busqueda(int vector[], int valor);
	}
	
	BusquedaBinaria Busqueda = (vector,valor) ->{
		int inicio = 0;
		int fin = vector.length -1;
		int pos;
		while(inicio <= fin){
			pos = (inicio + fin) / 2;
			if (vector[pos] == valor) {
				return pos;
			}else if(vector[pos] < valor){
				inicio = pos + 1;
			}else {
				fin = pos - 1;
			}
		}
		return -1;
	};
	
	private void Buscar(int[]vector){
		Scanner sc = new Scanner(System.in);	
		Sales obj = new Sales();
		System.out.println("Inserte el valor a buscar: ");
		int valor = sc.nextInt();
		int posicion = obj.Busqueda.Busqueda(vector, valor);
		if (posicion == -1) {
			System.out.println("El valor de " + valor + " no se encuentra en el vector ");
		}else {
			System.out.println("El valor de " + valor + " se encuentra en la posici�n: " + posicion + " del vector");
		}
	}
}

