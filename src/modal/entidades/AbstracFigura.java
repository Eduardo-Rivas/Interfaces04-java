package modal.entidades;

import modal.enums.Color;

public abstract class AbstracFigura implements InterfaceFigura {
   private Color color;
   
   //--Defino el Constructor--//
   public AbstracFigura(Color color) 
   {
      this.color = color;	   
   }
   
   //--Getters y Setters--//
   public Color getColor()
   {
	   return this.color;
   }
   public void setColor(Color color)
   {
	   this.color = color;
   }
   
}
