public class labert {
    
    int laberinto[][] = 
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1},
        {1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1},
        {1,0,1,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,1},
        {1,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,0,0,0,1,0,1},
        {1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,1,1,0,1},
        {1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,1,1,1,1},
        {1,0,1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1},
        {1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
}

if(Juego.obtieneNivel()==1){g.setColor(Color.DARK_GRAY);}
                if(Juego.obtieneNivel()==2){g.setColor(Color.PINK);}
                if(Juego.obtieneNivel()>=3){g.setColor(Color.MAGENTA);}

                g.fillRect(columna*anchoBloque,fila*altoBloque,anchoBloque,altoBloque);
                g.setColor(Color.BLACK);
                g.drawRect(columna*anchoBloque,fila*altoBloque,anchoBloque,altoBloque);
