package com.yasi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Operaciones obj = new Operaciones();
        Scanner reader = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int CuboNo;
        System.out.println("Introduzca el primer valor: ");
        valor1 = Integer.parseInt(reader.nextLine());
        System.out.println("Introduzca el segundo valor: ");
        valor2 = Integer.parseInt(reader.nextLine());
        obj.netValor1(valor1);
        obj.netValor2(valor2);
        System.out.println("Primer operando"+" es" + ":   " + obj.charVAlor1());
        System.out.println("Segundo operando"+ "es" +":   " + obj.charVAlor2());
        System.out.println(obj.charVAlor1() + " + " + obj.charVAlor2() + "   " + "Sumando valores: "  +   obj.SumarNo());
        System.out.println( obj.charVAlor1() + " - " + obj.charVAlor2() + "   " + "Restando valores: " +  obj.RestarNo());
        System.out.println(obj.charVAlor1() + " * " + obj.charVAlor2() + "   " + "Multiplicando valores: "  + obj.MultiplicarNo());
        System.out.println(obj.charVAlor1() + " elevado al cubo " + " : " + obj.CuboNo());
        System.out.println("El Residuo es: " + obj.Residuo());
    }
}
class Operaciones {
    public int d;
    public int b;

    public void netValor1(int valor) {
        d = valor;
    }
    public void netValor2(int valor) {
        b = valor;
    }
    public Integer charVAlor1() {
        return this.d;
    }
    public Integer charVAlor2() {
        return this.b;
    }
    public Integer SumarNo() {
        return this.d + this.b;
    }
    public Integer RestarNo() {
        return this.d - this.b;
    }
    public Integer MultiplicarNo() {
        return this.d * this.b;
    }
    public Integer Residuo() {
        return this.d % this.b;
    }
    public Double CuboNo() {
        return Math.pow(this.d, 3);
    }
    public Integer Multiplicar3N(Integer num) {
        return this.d + this.b * num;
    }
    public Integer Multiplicar4N(Integer num1, Integer num2) {
        return this.d + this.b * num1 * num2;
    }
    public Double RaizCuadradaN() {
        return Math.sqrt(this.d);
    }
    public Double CuadradoDeN() {
        return Math.pow(this.d, 2);
    }
    public Boolean EsParN() {
        if (this.d % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public Boolean EsMultiploN() {
        if (this.d % this.b == 0) {
            return true;
        } else {
            return false;
        }

    }
}