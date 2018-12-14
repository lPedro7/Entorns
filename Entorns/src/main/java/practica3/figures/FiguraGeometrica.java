package practica3.figures;

import java.awt.Color;

public abstract class FiguraGeometrica implements Figura {
   protected int codi=0;
   protected String nom="";
   protected Color color=Color.white;

   public FiguraGeometrica (int ncodi, String nnom, Color ncolor) {
      if (ncodi>0) codi = ncodi;
      nom = nnom;
      color = ncolor;
   }

   public FiguraGeometrica(FiguraGeometrica f)  {
      this (f.codi, f.nom, f.color);
   }

   public FiguraGeometrica () {}

   public void setCodi(int nouCodi)  {
      if (nouCodi>=0) codi = nouCodi;
   }

   public void setNom (String nouNom)  {
      nom = nouNom;
   }

   public void setColor (Color nouColor) {
      color = nouColor;
   }   

   public int getCodi () {
      return codi;
   }

   public String getNom () {
      return nom;
   }
   
   public Color getColor () {
      return color;
   }

   public void visualitzar () {
      System.out.print(toString());
   }

   public abstract double area();

   public String toString() {
      String s = "Codi..........:" + codi + "\n";
      s = s + "Nom...........:" + nom + "\n";
      s = s + "Color.........:" + color + "\n";
      return s;
   }

   public boolean equals(Object f) {
     //if (this.codi == ((FiguraGeometrica)f).getCodi()) return true;

      //else return false;
      return f.equals(getCodi());
   }

}