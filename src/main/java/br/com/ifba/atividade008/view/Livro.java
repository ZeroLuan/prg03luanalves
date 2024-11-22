/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade008.view;

/**
 *
 * @author a1591
 */
public class Livro {

    private String titulo;
    private String autor;
    private int totalDePaginas;
    private boolean aberto;
    private String leitor;

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.totalDePaginas = 0;
        this.aberto = false;
        this.leitor = "";
    }

    public void detalhes(String titulo, String autor, int totalDePaginas, boolean aberto, String leitor) {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de Paginas: " + totalDePaginas);
        System.out.println("Aberto: " + aberto);
        System.out.println("Leitor: " + leitor);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
}
